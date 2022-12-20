package com.example.Springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "kimmm");
        return "greetings";
    }


    @GetMapping("/bye")
    public String SeeyouNext(Model model){
        model.addAttribute("nickname", "ingyeommmm");
        return "goodbye";
    }
}
