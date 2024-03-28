package com.tcn.controllers;

import com.tcn.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value="/")
    public String index(Model model){
        model.addAttribute("categories", this.categoryService.getCates());
        return "home";
    }
}
