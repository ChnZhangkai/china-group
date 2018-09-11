package com.china.group.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.china.group.constant.WeatherAppPath;
import com.china.group.rest.FastJsonRestTemplate;
import com.china.group.service.WeatherService;
import com.china.group.vo.HTTPResut;
import com.china.group.vo.weather.WeatherForecast;
import com.china.group.vo.weather.WeatherHourly;
import com.china.group.vo.weather.WeatherNow;
import com.china.group.vo.weather.WeatherReq;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private FastJsonRestTemplate restTemplate;

	@Value("${weatherapp.path}")
	private String weatherAppPath;

	@Override
	public WeatherNow getWeatherNow(WeatherReq req) {

		HTTPResut<WeatherNow> httpResut = restTemplate.postForAnObjectResult(weatherAppPath + WeatherAppPath.WEATHERNOW,
				req, WeatherNow.class);

		return httpResut.getData();
	}

	@Override
	public WeatherForecast getWeatherForecast(WeatherReq req) {

		HTTPResut<WeatherForecast> httpResut = restTemplate
				.postForAnObjectResult(weatherAppPath + WeatherAppPath.WEATHEFORECAST, req, WeatherForecast.class);

		return httpResut.getData();
	}

	@Override
	public WeatherHourly getWeatherHourly(WeatherReq req) {

		HTTPResut<WeatherHourly> httpResut = restTemplate
				.postForAnObjectResult(weatherAppPath + WeatherAppPath.WEATHERHOURLY, req, WeatherHourly.class);

		return httpResut.getData();
	}

}
