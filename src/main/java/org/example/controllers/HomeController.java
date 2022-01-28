package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class HomeController {

    public String homePage(Model model){
         String userName = "Guest";

         model.addAttribute("user", userName);

        return "index";
    }

    @RequestMapping("bmi")
    public String bmiCalculator(Model model){
       model.addAttribute("title", "Carry on or Checked?");
        return "bmi";
    }

}
