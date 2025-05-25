package com.example.isabellepsyk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String home() {
        return "home";
    }

    @GetMapping("/kontakt")
    public String contact() {
        return "kontakt";
    }

    @GetMapping("/metoder")
    public String methods() {
        return "metoder";
    }

    @GetMapping("/om")
    public String about() {
        return "om";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}