package com.tcn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value="/{kw}")
    public String index(Model model, @PathVariable(value="kw", required = false) String kw){
        model.addAttribute("word", kw);
        return "home";
    }
}
