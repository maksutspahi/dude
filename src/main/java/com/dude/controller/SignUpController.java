package com.dude.controller;

import com.dude.entity.User;
import com.dude.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    private ShaPasswordEncoder passwordEncoder;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signUp(@RequestParam String email, @RequestParam String password, Model model) {
        User user = new User(email, passwordEncoder.encodePassword(password, null));
        model.addAttribute("registered", true);
        userRepository.save(user);
        return "redirect:login";
    }
}
