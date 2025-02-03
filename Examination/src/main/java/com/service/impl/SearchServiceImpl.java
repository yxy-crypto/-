package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Words;
import com.beans.Writing;
import com.mapper.SearchMapper;
import com.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

    private final SearchMapper searchMapper;

    @Autowired
    public SearchServiceImpl(SearchMapper searchMapper) {
        this.searchMapper = searchMapper;
    }

    
    @Override
    public List<Words> doublesearch(String belong, String incapable) {
        return searchMapper.doublesearch(belong, incapable);
    }
    
    
    
    
    @Override
    public List<Words> searchc(String keyword) {
        return searchMapper.searchc(keyword);
    }
    
    
    @Override
    public List<Words> searche(String keyword) {
        return searchMapper.searche(keyword);
    }
    
    @Override
    public List<Words> searchd(String keyword) {
        return searchMapper.searchd(keyword);
    }
    
    @Override
    public List<Words> searchb(String keyword) {
        return searchMapper.searchb(keyword);
    }
    
    @Override
    public List<Words> searchi(String keyword) {
        return searchMapper.searchi(keyword);
    }
    
    public List<Words> searcht(Integer days) {
        return searchMapper.searcht(days);
    }

	
}