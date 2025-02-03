package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.Words;
import com.beans.Writing;
import com.service.SearchService;

@Controller
public class SearchController {

    private final SearchService searchService;
    

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }
    
    @RequestMapping("/tosearch")
    public String toSearch() {
        
        return "search";
    }
    @RequestMapping("/toadd")
    public String toadd() {
        
        return "add";
    }
    
    @RequestMapping("/towords")
    public String towords() {
        
        return "words";
    }
    @RequestMapping("/toupdate")
    public String toupdate() {
        
        return "update";
    }
    @RequestMapping("/towriting")
    public String towriting() {
        
        return "writing";
    }
    @RequestMapping("/todancishu")
    public String todancishu() {
        
        return "dancishu";
    }
    
    
//   @GetMapping("/doublesearch")
//    public String doublesearch(@RequestParam String belong,
//                               @RequestParam String incapable,
//                               Model model) {
//        // 调用服务层获取查询结果
//        List<Words> results = searchService.doublesearch(belong, incapable);
//        // 将查询结果添加到模型中
//       model.addAttribute("results", results);
//        return "search"; // 返回原来的模板页面
//   }
    
    @GetMapping("/doublesearch")
    public String doublesearch(
            @RequestParam(required = false) String belong,
            @RequestParam(required = false) String incapable,
            Model model) {
        List<Words> results = searchService.doublesearch(belong, incapable);
        model.addAttribute("results", results);
        return "search"; // 返回到HTML页面
    }
  
    
   
    @GetMapping("/searchc")
    public String searchc(@RequestParam("keywordc") String keyword, Model model) {
        List<Words> searchResults = searchService.searchc(keyword);
        model.addAttribute("results", searchResults);
        return "search";
    }
    
    
    @GetMapping("/searche")
    public String searche(@RequestParam("keyworde") String keyword, Model model) {
        List<Words> searchResults = searchService.searche(keyword);
        model.addAttribute("results", searchResults);
        return "search";
    }
    
    
    
    @GetMapping("/searchd")
    public String searchd(@RequestParam("keywordd") String keyword, Model model) {
        List<Words> searchResults = searchService.searchd(keyword);
        model.addAttribute("results", searchResults);
        return "search";
    } 
    
    @GetMapping("/searchb")
    public String searchb(@RequestParam("keywordb") String keyword, Model model) {
        List<Words> searchResults = searchService.searchb(keyword);
        model.addAttribute("results", searchResults);
        return "search";
    }  
    
    @GetMapping("/searchi")
    public String searchi(@RequestParam("keywordi") String keyword, Model model) {
        List<Words> searchResults = searchService.searchi(keyword);
        model.addAttribute("results", searchResults);
        return "search";
    } 
    
    
    @GetMapping("/searcht")
    public String searcht(@RequestParam("days") Integer days, Model model) {
        List<Words> results = searchService.searcht(days);
        model.addAttribute("results", results);
        return "search";
    }
    
}