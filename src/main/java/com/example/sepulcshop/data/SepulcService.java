package com.example.sepulcshop.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class SepulcService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public SepulcService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Sepulc> getSepulcData() {
        System.out.println("\n\n\n\nhi?\n\n\n\n\n");
        List<Sepulc> sepulcs= jdbcTemplate.query("Select * from sepulc",(ResultSet rs,int rowNum)->
        {
            Sepulc sepulc = new Sepulc();
            sepulc.setId(rs.getInt("id"));
//            sepulc.setAuthor(rs.getString("author"));
//            sepulc.setTitle(rs.getString("title"));
//            sepulc.setPriceOld(rs.getString("priceOld"));
//            sepulc.setPrice(rs.getString("price"));
            sepulc.setDescription(rs.getString("description"));
            sepulc.setPrice(rs.getInt("price"));
            sepulc.setImagePath(rs.getString("imagePath"));
            return sepulc;
        });

        return new ArrayList<>(sepulcs);
    }
}
