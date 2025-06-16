package com.example.dish_form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MenuController {

    @GetMapping("/add-dish")
    public String showForm(Model model) {
        model.addAttribute("dish", new Dish());
        return "add-dish";
    }

    @PostMapping("/add-dish")
    public String processForm(@ModelAttribute Dish dish, Model model) {
        String message = "Dish '" + dish.getName() + "' - '" + dish.getPrice() + "' lei is ready!";
        model.addAttribute("message", message);
        return "add-dish";
    }
}
