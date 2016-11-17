package com.dude.controller;

import com.dude.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by maksutspahi on 17/11/16.
 */
@Controller
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void signUp(@RequestParam String userName, @RequestParam String password) {

    }
}
