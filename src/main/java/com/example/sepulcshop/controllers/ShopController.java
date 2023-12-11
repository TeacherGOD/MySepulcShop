package com.example.sepulcshop.controllers;

import com.example.sepulcshop.data.Shop;
import com.example.sepulcshop.data.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class ShopController {

    private final ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @ModelAttribute("shopsList")
    public List<Shop> shopList()
    {
        return shopService.getShopData();
    }

    @GetMapping("/shops")
    public String shopPage(){
        return "/shops/index";
    }
}
