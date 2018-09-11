package com.china.group.service;

import com.china.group.exception.BusinessException;
import com.china.group.vo.weather.WeatherForecast;
import com.china.group.vo.weather.WeatherHourly;
import com.china.group.vo.weather.WeatherNow;
import com.china.group.vo.weather.WeatherReq;

public interface WeatherService {

	WeatherNow getWeatherNow(WeatherReq req) throws BusinessException;
	
	WeatherForecast getWeatherForecast(WeatherReq req) throws BusinessException;
	
	WeatherHourly getWeatherHourly(WeatherReq req) throws BusinessException;
	
}
