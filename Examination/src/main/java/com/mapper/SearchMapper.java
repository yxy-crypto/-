package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.beans.Words;


public interface SearchMapper {
	
	List<Words> doublesearch(
            @Param("belong") String belong,
            @Param("incapable") String incapable);

	List<Words> searchc(String keyword);
	List<Words> searche(String keyword);
	List<Words> searchd(String keyword);
	List<Words> searchb(String keyword);
	List<Words> searchi(String keyword);
	List<Words> searcht(Integer days);
}
