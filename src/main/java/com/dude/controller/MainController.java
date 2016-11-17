package com.dude.controller;

import com.dude.entity.User;
import com.dude.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by maksutspahi on 17/11/16.
 */
@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "anil");
        return "index";
    }

    @RequestMapping("/login")
    public String boot(Model model) {
        userRepository.save(new User("can", "123"));
        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        return "signup";
    }
}
