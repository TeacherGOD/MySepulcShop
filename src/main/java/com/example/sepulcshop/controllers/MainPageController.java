package com.example.sepulcshop.controllers;


import com.example.sepulcshop.data.Sepulc;
import com.example.sepulcshop.data.SepulcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/mySepulc")
public class MainPageController {


    private final SepulcService sepulcService;

    @Autowired
    public MainPageController(SepulcService sepulcService) {
        this.sepulcService = sepulcService;
    }


    @ModelAttribute("recommendedSepulcs")
    public List<Sepulc> recommendedSepulcs()
    {
        return sepulcService.getSepulcData();
    }


    @GetMapping("/")
    public String mainPage()
    {
//        model.addAttribute("sepulcData",sepulcService.getSepulcData());
//        model.addAttribute("searchPlaceHolder","New, lol");
//        model.addAttribute("currentTime",new SimpleDateFormat("HH:mm").format(new Date()));
//        model.addAttribute("placeholderTextPart2","но зачем");
        return "index";
    }

}