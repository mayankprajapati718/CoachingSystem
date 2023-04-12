package com.example.coachingsystem.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    @GetMapping("welcome")
    public String gotoWelcomePage(ModelMap modelMap) {
        modelMap.addAttribute("name","Mayank");

        return "welcome";
    }
}
