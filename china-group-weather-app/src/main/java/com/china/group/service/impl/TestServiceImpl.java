package com.china.group.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.china.group.log.Loggers;
import com.china.group.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Value("${test}")
	private String test;
	
	@Override
	public String test() {
		Loggers.info("APP TestServiceImpl >>> test >>> test");
		return test;
	}

}
