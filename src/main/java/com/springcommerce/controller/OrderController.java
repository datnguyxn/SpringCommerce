package com.springcommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
    @GetMapping("")
    public String order() {
        return "pages/components/order";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "pages/components/checkout";
    }
}
