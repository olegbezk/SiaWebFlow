package com.sia.pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String redirectToFlow() {
        return "redirect:/pizza";
    }

}
