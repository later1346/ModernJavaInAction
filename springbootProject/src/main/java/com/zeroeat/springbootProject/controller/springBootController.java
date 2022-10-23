package com.zeroeat.springbootProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class springBootController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        /* /Templates 안에 파일로 전송해줌.
        *  greeting.mustache 파일로 전송하려면 return "greeting"
        * */
        model.addAttribute("username", "영식");
        return "greeting";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "조영시기");
        return "goodbye";
    }
}
