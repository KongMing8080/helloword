package com.code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.service.selectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/select")
@Api("selectController相关的api")
public class selectController extends BaseController{

	private static Logger log = LoggerFactory.getLogger(selectController.class);
	
	@Autowired
	private selectService selectService;
	
	
	@ApiOperation(value = "查询表数据", notes = "查询数据库的表数据")
    @ApiImplicitParam(name = "id", value = "ID", paramType = "path", required = true, dataType = "Integer")
	@RequestMapping(value="/thisSelect", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> thisSelect() {
		Map<String, Object> m = null;
		Map<String, Object> params = new HashMap<>();
		List<Map<String, Object>> list = selectService.thisSelect(params);
		m = this.getResultMap(true, list, "查询成功！");
		log.debug("-->"+list);
		return m;
	}
	
}
