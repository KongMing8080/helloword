package com.code.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface selectDao {

	List<Map<String, Object>> thisSelect(Map<String, Object> params);

}
