package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.beans.Dancishu;
import com.service.DancishuService;


@Controller
public class DancishuController {

        @Autowired
        private DancishuService dancishuService;


        
        
        @GetMapping("/dsearchto")
        public String searchDancishu(
                @RequestParam(value = "dkeywordc", required = false) String meaning,
                @RequestParam(value = "dkeyworde", required = false) String word,
                @RequestParam(value = "dkeywordco", required = false) String collocation,
                @RequestParam(value = "dkeywordbe", required = false) String belong,
                Model model) {

            List<Dancishu> results = dancishuService.searchDancishu(meaning, word, collocation, belong);
            model.addAttribute("results", results);

            // 返回视图名
            return "dancishu";
        }

}



