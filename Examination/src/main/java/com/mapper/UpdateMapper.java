package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.beans.Words;

public interface UpdateMapper {
	
	 List<Words> searchByKeyword(String keyword);
	 
	 Words upsearchByKeyword(String keyword);

	 
	 
	    void updateExplanation(@Param("word") String word,
	                           @Param("additionalExplanation") String additionalExplanation);
	    
	    
	    
	    
	    void updateDetail(@Param("word") String word,
	    				  @Param("additionalDetail") String additionalDetail);

	    void updateBelong(@Param("word") String word,
				  @Param("additionalBelong") String additionalBelong);
	    
	    
	    void updateIncapable(@Param("word") String word,
				  @Param("additionalIncapable") String additionalIncapable);
	    
	    
	}