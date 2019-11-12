package com.lsg.community.controller;

import com.lsg.community.dto.PaginationDTO;
import com.lsg.community.model.Question;
import com.lsg.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size) {
        PaginationDTO pagination= questionService.list(page,size);
        model.addAttribute("pagination", pagination);
        return "index";
    }
}
