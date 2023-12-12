package com.example.sepulcshop.controllers;

import com.example.sepulcshop.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class SepulcController {


    private final SepulcPageService sepulcPageService;

    @Autowired
    public SepulcController(SepulcPageService sepulcPageService) {
        this.sepulcPageService = sepulcPageService;
    }




    @GetMapping("/sepulc/{id}")

    public String shopPage(@PathVariable Integer id, Model model){
        var hihi =sepulcPageService.getSepulcById(id);
        model.addAttribute("sepulc",hihi);
        return "/shops/slug";
    }
}
