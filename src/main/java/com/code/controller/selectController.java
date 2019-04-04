package com.code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.service.selectService;


@Controller
@RequestMapping("/select")
public class selectController extends BaseController{

	private static Logger log = LoggerFactory.getLogger(selectController.class);
	
	@Autowired
	private selectService selectService;
	
	@RequestMapping(value="/thisSelect")
	@ResponseBody
	public Map<String, Object> thisSelect() {
		Map<String, Object> m = null;
		Map<String, Object> params = new HashMap<>();
		List<Map<String, Object>> list = selectService.thisSelect(params);
		m = this.getResultMap(true, list, "查询成功！");
		System.out.println(list);
		return m;
	}
	
}
