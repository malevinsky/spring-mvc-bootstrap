package com.example.bellerophon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //идентификация контроллера
public class First_Controller {

    @GetMapping("/")  //гарантирует, что http запр, чтобы / отобр в home
    public String home(Model model) {
        model.addAttribute("title", "ттллтол");
        return "home";
    }

    @GetMapping("/home")
    public String start(Model model) {
        model.addAttribute("title", "ттллтол");
        return "home";
    }
    @GetMapping("/buy")
    public String buy(Model model) {
        model.addAttribute("title", "ттллтол");
        return "registration";
    }

    @GetMapping("/price")
    public String price(Model model) {
        model.addAttribute("title", "ттллтол");
        return "price";
    }
}
