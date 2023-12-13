package com.example.sepulcshop.controllers;

import com.example.sepulcshop.data.Sepulc;
import com.example.sepulcshop.data.SepulcCart;
import com.example.sepulcshop.data.SepulcPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.Set;


@Controller
public class CartController {

    private final SepulcCart sepulcCart;
    private final SepulcPageService sepulcPageService;



    @Autowired
    public CartController(SepulcCart sepulcCart,SepulcPageService sepulcPageService) {
        this.sepulcCart = sepulcCart;
        this.sepulcPageService = sepulcPageService;
    }

    @GetMapping("/SepulcBox")
    public String get(Model model) {
        Set<Sepulc> sepulcs = sepulcCart.getSepulcCart();

        model.addAttribute("sepulcs", sepulcs);
        model.addAttribute("sepulc", new Sepulc());
        return "/shops/buy";
    }



    @PostMapping("/SepulcBox/{id}")
    public String add(@PathVariable Integer id,Sepulc sepulc, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("sepulcs", sepulcCart.getSepulcCart());
            return "index";
        }
        sepulc  =sepulcPageService.getSepulcById(sepulc.getId());
        sepulcCart.add(sepulc);
        return "redirect:/SepulcBox";
    }
}
