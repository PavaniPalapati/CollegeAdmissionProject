package com.thinkchamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CollegeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/admission")
    public String admission(@ModelAttribute("student") CollegeStudent student,
                            Model model) {

        model.addAttribute("student", student);
        return "success";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "College Controller Working";
    }
}