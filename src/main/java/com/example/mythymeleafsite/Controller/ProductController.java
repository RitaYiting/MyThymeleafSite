package com.example.mythymeleafsite.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/product") //路徑
    public String procuct(){
        return "real-estate";   //回傳DataExchange.html的網頁(在templates不用加.html)
    }

    @GetMapping("/data") //路徑
    public String showDataExchange(HttpSession session, HttpServletRequest request, Model m){
        session.setAttribute("msg","這是利用 Session 傳遞而來的資料");
        request.setAttribute("msg","這是透過 Request 傳遞而來的資料");
        m.addAttribute("msg2","這是透過 Model 傳遞而來的資料");
        return "DataExchange"; //回傳DataExchange.html的網頁(在templates不用加.html)
    }

}
