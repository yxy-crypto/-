package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Words;
import com.mapper.WordsMapper;
import com.service.WordsService;

@Service
public class WordsServiceImpl implements WordsService {

    private WordsMapper wordsMapper;
    private List<Words> randomWordsList;

    @Autowired
    public WordsServiceImpl(WordsMapper wordsMapper) {
        this.wordsMapper = wordsMapper;
        this.randomWordsList = null;
    }

    @Override
    public void generateRandomWordsList(int n,String belong, String incapable) {
        randomWordsList = wordsMapper.getRandomWordsList(n,belong,incapable);
    }
    
    @Override
    public void generateRandomWordsList1(int n,String incapable) {
        randomWordsList = wordsMapper.getRandomWordsList1(n,incapable);
    }
    
    @Override
    public void generateRandomWordsList2(int n,String belong) {
        randomWordsList = wordsMapper.getRandomWordsList2(n,belong);
    }

    @Override
    public void generateRandomWordsList3(int n) {
        randomWordsList = wordsMapper.getRandomWordsList3(n);
    }
    
   
    @Override
    public List<Words> getRandomWordsList() {
        return randomWordsList;
    }
}