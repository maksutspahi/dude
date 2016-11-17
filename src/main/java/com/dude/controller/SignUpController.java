package com.dude.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by maksutspahi on 17/11/16.
 */
@Controller
public class SignUpController {

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void signUp(@RequestParam String userName, @RequestParam String password) {

    }
}
