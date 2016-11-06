
package com.application.cms.web.controller.login;

import com.application.cms.service.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login( Model model) {
        model.addAttribute("userDto", new UserDTO());
        model.addAttribute("password", "");
        return "education/login";
    }
    
    @PostMapping("/login")
    public String login(@ModelAttribute UserDTO userDto, @ModelAttribute String password, Model model) {
        String result;

        
        //authentication
        if (userDto==null || userDto.getLogin() == null) {
            result="education/login";
        } else {
            result ="education/home";
        }
        return result;
    }
}
