package com.china.group.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.china.group.log.Loggers;
import com.china.group.mapper.UserMapper;
import com.china.group.model.User;
import com.china.group.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Value("${test}")
	private String test;
	
	@Override
	public String test() {
		Loggers.info("APP TestServiceImpl >>> test >>> test");
		return test;
	}

	@Override
	public List<User> getUser() {
		List<User> list = userMapper.getUserList();
		return list;
	}

}
