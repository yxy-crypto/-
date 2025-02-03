package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.Words;
import com.mapper.UpdateMapper;
import com.service.UpdateService;

@Service
public class UpdateServiceImpl implements UpdateService {
    @Autowired
    private UpdateMapper updateMapper;

    @Override
    public List<Words> searchByKeyword(String keyword) {
        return updateMapper.searchByKeyword(keyword);
    }

    @Override
    public void updateExplanation(String word, String additionalExplanation) {
        Words wordObj =  updateMapper.upsearchByKeyword(word);
        String originalExplanation = wordObj.getExplanation();
        if (originalExplanation == null || originalExplanation.isEmpty()) {
            originalExplanation = additionalExplanation;
        } else {
            originalExplanation = additionalExplanation;
        }
        updateMapper.updateExplanation(word, originalExplanation);
    }

 
    
    @Override
    public void updateDetail(String word, String additionalDetail) {
        Words wordObj =  updateMapper.upsearchByKeyword(word);
        String originalDetail = wordObj.getDetail();
        if (originalDetail == null || originalDetail.isEmpty()) {
            originalDetail = additionalDetail;
        } else {
            originalDetail = additionalDetail;
        }
        updateMapper.updateDetail(word, originalDetail);
        
    }

    @Override
    public void updateBelong(String word, String additionalBelong) {
        Words wordObj =  updateMapper.upsearchByKeyword(word);
        String originalBelong = wordObj.getBelong();
        if (originalBelong == null || originalBelong.isEmpty()) {
            originalBelong = additionalBelong;
        } else {
            originalBelong = additionalBelong;
        }
        updateMapper.updateBelong(word, originalBelong);
        
    }
    
    @Override
    public void updateIncapable(String word, String additionalIncapable) {
        Words wordObj =  updateMapper.upsearchByKeyword(word);
        String originalIncapable = wordObj.getIncapable();
        if (originalIncapable == null || originalIncapable.isEmpty()) {
            originalIncapable = additionalIncapable;
        } else {
            originalIncapable = additionalIncapable;
        }
        updateMapper.updateIncapable(word, originalIncapable);
        
    }


	@Override
	public Words upsearchByKeyword(String keyword) {
		return updateMapper.upsearchByKeyword(keyword);
	}
}