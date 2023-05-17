package com.UserAuth.Controller;

import com.UserAuth.Model.UserDetails;
import com.UserAuth.Service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/signin")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/createUser")
    public String createUser(@ModelAttribute UserDetails userDetails, HttpSession session) {

            //System.out.println(userDetails.getEmail() + " already exists");
            boolean check = userService.checkEmail(userDetails.getEmail());
            if (check) {
                session.setAttribute("msg","Email id already exist");

            } else {
                UserDetails user = userService.createUser(userDetails);
                if (user != null) {
                    session.setAttribute("msg","registration successful");
                } else {
                    session.setAttribute("msg","user not registered");
                }
            }
        return "redirect:/register";
    }
}
