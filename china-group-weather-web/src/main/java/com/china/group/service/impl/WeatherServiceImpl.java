package com.china.group.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.china.group.rest.FastJsonRestTemplate;
import com.china.group.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	@Autowired
	private FastJsonRestTemplate restTemplate;
	
	@Value("${weatherapp.path}")
	private String weatherAppPath;

	@Override
	public void getWeatherNow() {
		
		
		
	}
	
}
