package com.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.beans.Dancishu;

import java.util.List;

@Mapper
public interface DancishuMapper {
    List<Dancishu> searchDancishu(@Param("meaning") String meaning,
                                  @Param("word") String word,
                                  @Param("collocation") String collocation,
                                  @Param("belong") String belong);
}
