package com.dude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maksutspahi on 17/11/16.
 */
@Controller
public class MainController {

    @RequestMapping("/index")
    public String greeting(Model model) {
        model.addAttribute("name", "ANIL");
        return "index";
    }

    @RequestMapping("/boot")
    public String boot(Model model) {
        return "boot";
    }
}
