package com.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Writing;
import com.mapper.WritingMapper;
import com.service.WritingService;

import java.util.List;

@Service
public class WritingServiceImpl implements WritingService {

    @Autowired
    private WritingMapper writingMapper;

    @Override
    public List<Writing> writingsearch(String form, String domain, String register) {
        return writingMapper.writingsearch(form, domain, register);
    }

    @Override
    public List<Writing> writingrecent(int days) {
        return writingMapper.writingrecent(days);
    }

    @Override
    public List<Writing> writingcontentregex(String regex) {
        return writingMapper.writingcontentregex(regex);
    }

    @Override
    public List<Writing> writingexplanationregex(String regex) {
        return writingMapper.writingexplanationregex(regex);
    }
}

