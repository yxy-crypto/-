package com.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Dancishu;
import com.mapper.DancishuMapper;
import com.service.DancishuService;

import java.util.List;

@Service
public class DancishuServiceImpl implements DancishuService {

    @Autowired
    private DancishuMapper dancishuMapper;

    @Override
    public List<Dancishu> searchDancishu(String meaning, String word, String collocation, String belong) {
        return dancishuMapper.searchDancishu(meaning, word, collocation, belong);
    }
}
