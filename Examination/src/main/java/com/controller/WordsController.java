package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.Words;
import com.service.WordsService;

@Controller
public class WordsController {

    private WordsService wordsService;

    @Autowired
    public WordsController(WordsService wordsService) {
        this.wordsService = wordsService;
    }

    @GetMapping("/words")
    public String showWordsList(Model model) {
        model.addAttribute("wordsList", wordsService.getRandomWordsList());
        return "words";
    }
    
   
    @PostMapping("/words")
    public String generateRandomWordsList(@RequestParam("n") int n, @RequestParam(required = false) String belong, @RequestParam(required = false) String incapable, Model model) {
        wordsService.generateRandomWordsList(n, belong, incapable);
        return showWordsList(model);
        
    }
    
   
    
    @PostMapping("/words1")
    public String generateRandomWordsList1(@RequestParam("n") int n, @RequestParam("incapable") String incapable, Model model) {
        wordsService.generateRandomWordsList1(n,incapable);
        return showWordsList(model);
        
    }
    
    
    @PostMapping("/words2")
    public String generateRandomWordsList2(@RequestParam("n") int n, @RequestParam("belong") String belong,  Model model) {
        wordsService.generateRandomWordsList2(n, belong);
        return showWordsList(model);
        
    }
    
    @PostMapping("/words3")
    public String generateRandomWordsList3(@RequestParam("n") int n,Model model) {
        wordsService.generateRandomWordsList3(n);
        return showWordsList(model);
        
    }
    
}