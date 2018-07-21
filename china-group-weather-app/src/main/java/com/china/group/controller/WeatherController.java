package com.china.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.china.group.exception.BusinessException;
import com.china.group.service.WeatherService;
import com.china.group.vo.HTTPResut;
import com.china.group.vo.weather.WeatherForecast;
import com.china.group.vo.weather.WeatherNow;
import com.china.group.vo.weather.WeatherReq;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: WeatherController.java
 * @Description: 天气预报相关信息获取
 * @author: 张凯
 * @Date: 2018年7月21日 上午11:42:18
 * @parma <T>
 */
@RestController
@Api(tags = "天气")
@RequestMapping(value = "/weather")
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@ApiOperation(value = "获取当前天气")
	@RequestMapping(value = "/now", method = RequestMethod.POST)
	public HTTPResut<WeatherNow> getWeatherNow(@RequestBody WeatherReq req) throws BusinessException {
		WeatherNow weatherNow = weatherService.getWeatherNow(req);
		return HTTPResut.success(weatherNow);
	}
	
	@ApiOperation(value = "获取3-10日天气")
	@RequestMapping(value = "/forecast",method = RequestMethod.POST)
	public HTTPResut<WeatherForecast> getWeatherForecast(@RequestBody WeatherReq req) throws BusinessException{
		WeatherForecast weatherForecast = weatherService.getWeatherForecast(req);
		return HTTPResut.success(weatherForecast);
	}
	
}
