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
public class selectController {

	private static Logger log = LoggerFactory.getLogger(selectController.class);
	
	@Autowired
	private selectService selectService;
	
	@RequestMapping(value="/thisSelect")
	public String thisSelect() {
		Map<String, Object> params = new HashMap<String, Object>();
		List<Map<String, Object>> list = selectService.thisSelect(params);
		System.out.println(list);
		System.out.println("修改提交GIT测试");
		return "login/login";
	}
	
}
