package com.china.group.service;

import com.china.group.exception.BusinessException;

public interface TestService {

	void error() throws BusinessException;
	
	String getObjectForApp();
}
