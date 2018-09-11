package com.china.group.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.china.group.exception.BusinessException;
import com.china.group.rest.RestHelper;
import com.china.group.service.WeatherService;
import com.china.group.util.CheckResultUtils;
import com.china.group.util.HfWeatherPathUtils;
import com.china.group.vo.weather.WeatherForecast;
import com.china.group.vo.weather.WeatherHourly;
import com.china.group.vo.weather.WeatherNow;
import com.china.group.vo.weather.WeatherReq;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Value("${hf.weather.key}")
	private String hfWeatherKey;

	@Autowired
	private RestHelper restHelper;

	@Override
	public WeatherNow getWeatherNow(WeatherReq req) throws BusinessException {
		req.setKey(hfWeatherKey);
		JSONObject jsonParams = JSON.parseObject(JSON.toJSONString(req));
		JSONObject jsonResult = restHelper.getRestRequet(HfWeatherPathUtils.HFWEATHERNOW, JSONObject.class, jsonParams);
		CheckResultUtils.checkResult(jsonResult);
		List<WeatherNow> list = JSONObject.parseArray(JSONObject.toJSONString(jsonResult.get("HeWeather6")),
				WeatherNow.class);
		return list.get(0);
	}

	@Override
	public WeatherForecast getWeatherForecast(WeatherReq req) throws BusinessException {
		req.setKey(hfWeatherKey);
		JSONObject jsonParams = JSON.parseObject(JSON.toJSONString(req));
		JSONObject jsonResult = restHelper.getRestRequet(HfWeatherPathUtils.HFWEATHERFORECAST, JSONObject.class,
				jsonParams);
		CheckResultUtils.checkResult(jsonResult);
		JSONArray jsonArray = jsonResult.getJSONArray("HeWeather6");
		List<WeatherForecast> list = jsonArray.toJavaList(WeatherForecast.class);
		return list.get(0);
	}

	@Override
	public WeatherHourly getWeatherHourly(WeatherReq req) throws BusinessException {

		req.setKey(hfWeatherKey);
		JSONObject jsonParams = JSON.parseObject(JSON.toJSONString(req));
		JSONObject jsonResult = restHelper.getRestRequet(HfWeatherPathUtils.HFWEATHERHOURLY, JSONObject.class,
				jsonParams);
		CheckResultUtils.checkResult(jsonResult);
		JSONArray jsonArray = jsonResult.getJSONArray("HeWeather6");

		List<WeatherHourly> list = jsonArray.toJavaList(WeatherHourly.class);
		return list.get(0);
	}

}
