package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.Words;
import com.service.AddService;

@Controller
public class AddController {

    private final AddService addService;
    
    
    

    @Autowired
    public AddController(AddService addService) {
        this.addService = addService;
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "add"; // 返回 add.html 视图
    }

    @PostMapping("/add")
    public String addWords(@RequestParam("word") String word,
                           @RequestParam("explanation") String explanation,
    						
                           //@RequestParam("detail") String detail,
                           @RequestParam(value = "detail", required = false) String detail,
                           
                           //@RequestParam("belong") String belong,
                           @RequestParam(value = "belong", required = false) String belong,
                           
                           //@RequestParam("incapable") String incapable)
    						@RequestParam(value = "incapable", required = false) String incapable)

    
    {
        Words words = new Words();
        words.setWord(word);
        words.setExplanation(explanation);
        words.setDetail(detail);
        words.setBelong(belong);
        words.setIncapable(incapable);

//        addService.addWords(words);
//
//        return "add"; // 返回 success.html 视图，或者其他适合的页面
        
        boolean success = addService.addWords(words);

        if (success) {
            return "add"; // 添加成功后返回 success.html 视图或其他适合的页面
        } else {
            return "error"; // 添加失败时返回 errorupdate.html 视图或其他适合的页面
        }
        
       
        
    }
}