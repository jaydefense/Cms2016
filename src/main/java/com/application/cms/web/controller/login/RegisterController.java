
package com.application.cms.web.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String login(@RequestParam(value="username", required=false) String name, @RequestParam(value="password", required=false) String password, Model model) {
        String result;
        model.addAttribute("name", name);

        return "education/register";
    }

}
