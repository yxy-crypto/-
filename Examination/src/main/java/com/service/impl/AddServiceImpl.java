package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Words;
import com.mapper.AddMapper;
import com.service.AddService;



@Service
public class AddServiceImpl implements AddService {

    private final AddMapper addMapper;

    @Autowired
    public AddServiceImpl(AddMapper addMapper) {
        this.addMapper = addMapper;
    }

    @Override
    public boolean addWords(Words words) {
       return addMapper.insertWords(words);
        
    }
}
