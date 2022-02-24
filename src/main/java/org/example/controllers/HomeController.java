package org.example.controllers;

import org.example.models.User;
import org.example.models.dto.LoginFormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @RequestMapping(" ")
    public String homePage(Model model){

        return "index";
    }

    @RequestMapping("bmi")
    public String bmiCalculator(Model model){

        User guestName = new User();

        model.addAttribute("title", "Carry on or Checked?");

        return "bmi";
    }

}
