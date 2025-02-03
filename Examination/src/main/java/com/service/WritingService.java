package com.service;


import java.util.List;

import com.beans.Writing;

public interface WritingService {

    // 功能一：根据form, domain, register查询content和translation
    List<Writing> writingsearch(String form, String domain, String register);

    // 功能二：查询最近n天内添加的元组
    List<Writing> writingrecent(int days);

    // 功能三：按照正则表达式查询content字段
    List<Writing> writingcontentregex(String regex);

    // 功能四：按照正则表达式查询explanation字段
    List<Writing> writingexplanationregex(String regex);
}
