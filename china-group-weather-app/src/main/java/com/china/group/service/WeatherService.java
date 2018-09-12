package com.china.group.service;

import com.china.group.exception.BusinessException;
import com.china.group.vo.weather.air.WeatherAirNow;
import com.china.group.vo.weather.forecast.WeatherForecast;
import com.china.group.vo.weather.hourly.WeatherHourly;
import com.china.group.vo.weather.life.WeatherLifeStyleNow;
import com.china.group.vo.weather.now.WeatherNow;
import com.china.group.vo.weather.req.WeatherReq;

public interface WeatherService {

	WeatherNow getWeatherNow(WeatherReq req) throws BusinessException;
	
	WeatherForecast getWeatherForecast(WeatherReq req) throws BusinessException;
	
	WeatherHourly getWeatherHourly(WeatherReq req) throws BusinessException;
	
	WeatherLifeStyleNow getWeatherLifeStyle(WeatherReq req) throws BusinessException;
	
	WeatherAirNow getWeatherAir(WeatherReq req) throws BusinessException;
	
}
