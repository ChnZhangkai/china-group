package com.china.group.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController.java
 * @Description: 天气工程创建测试Controller,测试配置中心是否可读取配置文件
 * @author: 张凯
 * @Date: 2018年7月12日 下午9:41:21
 * @parma <T>
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Value("${test}")
	private String test;

	@RequestMapping(value = "/test")
	public String test() {
		return test;
	}

}
