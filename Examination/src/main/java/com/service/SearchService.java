package com.service;

import java.util.List;

import com.beans.Words;
import com.beans.Writing;

public interface SearchService {
	
	
	List<Words> doublesearch(String belong, String incapable);

	List<Words> searche(String keyword);

	List<Words> searchc(String keyword);

	List<Words> searchd(String keyword);
	
	List<Words> searchb(String keyword);
	
	List<Words> searchi(String keyword);
	
	List<Words> searcht(Integer days); 
    
}
