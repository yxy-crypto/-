package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.Words;
import com.service.UpdateService;

@Controller
public class UpdateController {
    @Autowired
    private UpdateService updateService;

    
    @RequestMapping("/upsearch")
    public String toSearch() {
        
        return "update";
    }
    
    
    
    @GetMapping("/updatesearch")
    public String searchByKeyword(@RequestParam("keyword") String keyword, Model model) {
        List<Words> words = updateService.searchByKeyword(keyword);
        model.addAttribute("words", words);
        return "update";
    }

    @PostMapping("/updateExplanation")
    public String updateExplanation(@RequestParam("word") String word,
                                    @RequestParam("additionalExplanation") String additionalExplanation) {
        updateService.updateExplanation(word, additionalExplanation);
        return "update";
    }

    
    @PostMapping("/updateDetail")
    public String updateDetail(@RequestParam("word") String word,
                                    @RequestParam("additionalDetail") String additionalDetail) {
        updateService.updateDetail(word, additionalDetail);
        return "update";
    }

    @PostMapping("/updateBelong")
    public String updateBelong(@RequestParam("word") String word,
                                    @RequestParam("additionalBelong") String additionalBelong) {
        updateService.updateBelong(word, additionalBelong);
        return "update";
    }
    
    @PostMapping("/updateIncapable")
    public String updateIncapable(@RequestParam("word") String word,
                                    @RequestParam("additionalIncapable") String additionalIncapable) {
        updateService.updateIncapable(word, additionalIncapable);
        return "update";
    }
    
}