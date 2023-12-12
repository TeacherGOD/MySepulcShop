package com.example.sepulcshop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ShopService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ShopService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Shop> getShopData() {
        String query= "SELECT shop.id, shop.name, address.city, address.street, address.house, address.\"address_index\" FROM shop, address where shop.\"id_address\" = address.id";
        List<Shop> shops=jdbcTemplate.query(query,(ResultSet rs, int rowNum) ->
                {
                    Shop shop = new Shop();
                    shop.setId(rs.getInt("id"));
                    shop.setName(rs.getString("name"));
                    shop.setCity(rs.getString("city"));
                    shop.setStreet(rs.getString("street"));
                    shop.setHouseNum(rs.getInt("house"));
                    shop.setAddressIndex(rs.getInt("address_index"));
                    return shop;
                }
        );
        shops.sort(Comparator.comparing(Shop::getCity));
        return shops;
    }
}
