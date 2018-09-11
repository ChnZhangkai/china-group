package com.china.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.china.group.exception.BusinessException;
import com.china.group.service.WeatherService;
import com.china.group.vo.HTTPResut;
import com.china.group.vo.weather.WeatherForecast;
import com.china.group.vo.weather.WeatherHourly;
import com.china.group.vo.weather.WeatherNow;
import com.china.group.vo.weather.WeatherReq;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "天气")
@RequestMapping(value = "/weather")
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@ApiOperation(value = "获取当前天气")
	@RequestMapping(value = "/now", method = RequestMethod.GET)
	public HTTPResut<WeatherNow> getWeatherNow(String location) {
		WeatherReq req = new WeatherReq();
		req.setLocation(location);
		WeatherNow weatherNow = weatherService.getWeatherNow(req);
		return HTTPResut.success(weatherNow);
	}

	@ApiOperation(value = "获取3-10日天气")
	@RequestMapping(value = "/forecast", method = RequestMethod.GET)
	public HTTPResut<WeatherForecast> getWeatherForecast(String location) throws BusinessException {
		WeatherReq req = new WeatherReq();
		req.setLocation(location);
		WeatherForecast weatherForecast = weatherService.getWeatherForecast(req);
		return HTTPResut.success(weatherForecast);
	}

	@ApiOperation(value = "获取逐3小时天气(24小时内)")
	@RequestMapping(value = "/hourly", method = RequestMethod.GET)
	public HTTPResut<WeatherHourly> getWeatherHourly(String location) throws BusinessException {
		WeatherReq req = new WeatherReq();
		req.setLocation(location);
		WeatherHourly weatherHourly = weatherService.getWeatherHourly(req);
		return HTTPResut.success(weatherHourly);
	}

}
