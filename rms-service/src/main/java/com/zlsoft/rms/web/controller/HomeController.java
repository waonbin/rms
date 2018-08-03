package com.zlsoft.rms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "AwardHomeController")
@RequestMapping("/award")
public class HomeController {

    @GetMapping
    public String index() {
        return "award/index";
    }

}
