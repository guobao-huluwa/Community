package com.lsg.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-08-27  15:13
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index (){
        return "index";
    }
}
