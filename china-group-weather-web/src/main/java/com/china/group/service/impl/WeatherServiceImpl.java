package com.china.group.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.china.group.rest.FastJsonRestTemplate;
import com.china.group.service.WeatherService;
import com.china.group.vo.HTTPResut;
import com.china.group.vo.weather.WeatherNow;
import com.china.group.vo.weather.WeatherReq;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	@Autowired
	private FastJsonRestTemplate restTemplate;
	
	@Value("${weatherapp.path}")
	private String weatherAppPath;

	@Override
	public WeatherNow getWeatherNow(WeatherReq req) {
		
		HTTPResut<WeatherNow> httpResut = restTemplate.postForAnObjectResult(weatherAppPath, req, WeatherNow.class);
		
		return httpResut.getData();
	}
	
}
