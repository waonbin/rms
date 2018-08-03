package com.zlsoft.rms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/award/awards")
public class AwardController {

    /**
     * GET  /awards : get awards' list page
     * @return awards' list page
     */
    @GetMapping
    public String awards() {
        return "award/awards";
    }

    /**
     * GET  /create : get create award page
     * @return create awards page
     */
    @GetMapping("/create")
    public String createAward() {
        return "award/create_award";
    }
}
