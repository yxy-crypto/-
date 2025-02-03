package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.beans.Writing;
import com.service.WritingService;

import java.util.List;

@RestController
public class WritingController {

    @Autowired
    private WritingService writingService;
    
    
    @GetMapping("/writingsearch")
    public List<Writing> search(
            @RequestParam(required = false) String form,
            @RequestParam(required = false) String domain,
            @RequestParam(required = false) String register) {
        return writingService.writingsearch(form, domain, register);
    }
    
    
    
    
    

    // 功能一：根据form, domain, register查询
 //   @GetMapping("/writingsearch")
 //   public List<Writing> search(@RequestParam String form,
 //                             @RequestParam String domain,
 //                             @RequestParam String register) {
 //       return writingService.writingsearch(form, domain, register);
 //   }

    // 功能二：查询最近n天内添加的元组
    @GetMapping("/writingrecent")
    public List<Writing> findRecent(@RequestParam int days) {
        return writingService.writingrecent(days);
    }

    // 功能三：按照正则表达式查询content字段
    @GetMapping("/writingcontentregex")
    public List<Writing> searchContent(@RequestParam String regex) {
        return writingService.writingcontentregex(regex);
    }

    // 功能四：按照正则表达式查询explanation字段
    @GetMapping("/writingexplanationregex")
    public List<Writing> searchExplanation(@RequestParam String regex) {
        return writingService.writingexplanationregex(regex);
    }
    
    
 
}
