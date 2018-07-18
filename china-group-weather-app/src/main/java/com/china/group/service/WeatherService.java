package com.china.group.service;

import com.china.group.exception.BusinessException;
import com.china.group.vo.weather.WeatherNow;
import com.china.group.vo.weather.WeatherReq;

public interface WeatherService {

	WeatherNow getWeatherNow(WeatherReq req) throws BusinessException;

}
