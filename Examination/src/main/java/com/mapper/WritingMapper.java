package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.beans.Writing;


public interface WritingMapper {

    // 功能一：根据form, domain, register查询
    List<Writing> writingsearch(@Param("form") String form,
                                         @Param("domain") String domain,
                                         @Param("register") String register);

    // 功能二：查询最近n天内添加的元组
    List<Writing> writingrecent(@Param("days") int days);

    // 功能三：按照正则表达式查询content字段
    List<Writing> writingcontentregex(@Param("regex") String regex);

    // 功能四：按照正则表达式查询explanation字段
    List<Writing> writingexplanationregex(@Param("regex") String regex);
}
