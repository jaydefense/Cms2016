
package com.application.cms.web.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplyController {

    @RequestMapping("/apply")
    public String apply(@RequestParam(value="username", required=false) String name, Model model) {
        String result;
        model.addAttribute("name", name);

        return "education/apply";
    }

}
