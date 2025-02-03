package com.service;

import java.util.List;

import com.beans.Words;

public interface WordsService {
   
	void generateRandomWordsList(int n, String belong, String incapable);
	
	void generateRandomWordsList1(int n, String incapable);
	
	void generateRandomWordsList2(int n, String belong);
	
	void generateRandomWordsList3(int n);
	
    List<Words> getRandomWordsList();
}