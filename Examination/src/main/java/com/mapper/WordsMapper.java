package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.beans.Words;



public interface WordsMapper {
    
  
	List<Words> getRandomWordsList(@Param("n") int n, @Param("belong") String belong, @Param("incapable") String incapable);
	
	List<Words> getRandomWordsList1(@Param("n") int n,@Param("incapable") String incapable);
	
	List<Words> getRandomWordsList2(@Param("n") int n, @Param("belong") String belong);
	
	List<Words> getRandomWordsList3(@Param("n") int n);
	
	
}