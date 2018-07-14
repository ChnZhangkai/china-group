package com.china.group.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.china.group.constant.WeatherAppPath;
import com.china.group.exception.BusinessException;
import com.china.group.rest.FastJsonRestTemplate;
import com.china.group.service.TestService;
import com.china.group.vo.HTTPResut;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private FastJsonRestTemplate restTemplate;

	@Value("${weatherapp.path}")
	private String weatherAppServicePath;

	@Override
	public void error() throws BusinessException {

		throw BusinessException.newInstance("111", "错啦");

	}

	@Override
	public String getObjectForApp() {
		HTTPResut<String> result = restTemplate.postForAnObjectResult(weatherAppServicePath + WeatherAppPath.WEATHERTEST, "1", String.class);
		return result.getData();
	}

}
