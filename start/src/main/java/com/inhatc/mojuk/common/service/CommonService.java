package com.inhatc.mojuk.common.service;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CommonService {
	
	public Map<String, Object> selectFileInfo(int bno) throws Exception;

}



