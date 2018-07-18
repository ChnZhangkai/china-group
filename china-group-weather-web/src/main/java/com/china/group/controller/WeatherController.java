package com.china.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.china.group.service.WeatherService;
import com.china.group.vo.HTTPResut;
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
	@RequestMapping(value = "/now")
	public HTTPResut<WeatherNow> getWeatherNow(@RequestBody WeatherReq req) {
		WeatherNow weatherNow = weatherService.getWeatherNow(req);
		return HTTPResut.success(weatherNow);
	}

}
