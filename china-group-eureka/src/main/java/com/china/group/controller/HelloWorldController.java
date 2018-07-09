package com.china.group.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "HelloWorld")
@RequestMapping(value = "/helloWorld")
public class HelloWorldController {
	
	@RequestMapping(value = "/index")
	@ApiOperation(value = "Hello world", httpMethod = "POST")
	public String helloWorld(){
		return "Hello world";
	}
	
}
