package com.example.mythymeleafsite.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class IfElse {
    @GetMapping("/if")
    public String showIFELSE(Model model, HttpSession session){
        model.addAttribute("isAdmin",false);
        session.setAttribute("imadmin",true);
        return "IfElse";
    }

    @GetMapping("/each")
    public String showForEach(Model model){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        model.addAttribute("fname",fruits);
        return "ForEach";
    }
}
