package com.china.group.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.china.group.rest.RestHelper;
import com.china.group.service.WeatherService;
import com.china.group.vo.weather.WeatherNow;
import com.china.group.vo.weather.WeatherReq;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Value("${hf.weather.key}")
	private String hfWeatherKey;

	@Value("${hf.weather.now}")
	private String hfWeatherNow;
	
	@Autowired
	private RestHelper restHelper;
	
	@Override
	public WeatherNow getWeatherNow(WeatherReq req) {
		req.setKey(hfWeatherKey);
		JSONObject jsonParams = JSON.parseObject(JSON.toJSONString(req));
		WeatherNow result = restHelper.getRestRequet(hfWeatherNow, WeatherNow.class, jsonParams);
		return result;
	}

}
