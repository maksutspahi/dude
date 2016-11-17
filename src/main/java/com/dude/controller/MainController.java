package com.dude.controller;

import com.dude.repository.UserRepository;
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
    private UserRepository userRepository;

    @RequestMapping("/")
    public String greeting(Model model) {
        return "index";
    }

    @RequestMapping("/login")
    public String boot(Model model) {
        return "login";
    }

}
