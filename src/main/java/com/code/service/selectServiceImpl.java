package com.code.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.dao.selectDao;

import com.code.util.ServiceException;

@Service
@Transactional
public class selectServiceImpl implements selectService {

private static Logger log = LoggerFactory.getLogger(selectServiceImpl.class);
	
	@Autowired
	private selectDao selectDao;
	
	public List<Map<String, Object>> thisSelect(Map<String, Object> params) {
		List<Map<String, Object>> list = null ;
		try {
			
			list = selectDao.thisSelect(params);
			
			
		} catch (Exception e) {
			log.error("[测试查询出错,请检查错误信息:{}]",e);
			throw new ServiceException("[测试查询出错,请检查错误信息]: "+e.getMessage());
		}
		return list;
	}

}
