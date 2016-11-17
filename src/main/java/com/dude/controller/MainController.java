package com.dude.controller;

import com.dude.bean.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maksutspahi on 17/11/16.
 */
@Controller
public class MainController {

    @Autowired
    private Database bean;

    @RequestMapping("/index")
    public String greeting(Model model) {
        model.addAttribute("name", bean.selectFromDual());
        return "index";
    }

    @RequestMapping("/boot")
    public String boot(Model model) {
        return "boot";
    }
}
