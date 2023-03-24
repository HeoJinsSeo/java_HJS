package com.aloha.hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    private String attributeName;
    private String attributeValue;

    @GetMapping(value="/")
        public String home(Model model) {

            model.addAttribute(attributeName="test", attributeValue="안녕하세요~!");
        
            return "index";
        }
    }

