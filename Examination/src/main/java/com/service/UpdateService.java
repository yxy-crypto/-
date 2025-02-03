package com.service;

import java.util.List;

import com.beans.Words;

public interface UpdateService {
	
	 List<Words> searchByKeyword(String keyword);
	 
     Words upsearchByKeyword(String keyword);
     
	    void updateExplanation(String word, String additionalExplanation);

	    void updateDetail(String word, String additionalDetail);
	    
	    void updateBelong(String word, String additionalBelong);
	    
	    void updateIncapable(String word, String additionalIncapable);
}