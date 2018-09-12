package com.china.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.china.group.annotation.CiticLog;
import com.china.group.exception.BusinessException;
import com.china.group.service.WeatherService;
import com.china.group.vo.HTTPResut;
import com.china.group.vo.weather.air.WeatherAirNow;
import com.china.group.vo.weather.forecast.WeatherForecast;
import com.china.group.vo.weather.hourly.WeatherHourly;
import com.china.group.vo.weather.life.WeatherLifeStyleNow;
import com.china.group.vo.weather.now.WeatherNow;
import com.china.group.vo.weather.req.WeatherReq;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: WeatherController.java
 * @Description: 天气预报相关信息获取
 * @author: 张凯
 * @Date: 2018年7月21日 上午11:42:18
 * @parma <T>
 */
@CiticLog
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
	@RequestMapping(value = "/forecast", method = RequestMethod.POST)
	public HTTPResut<WeatherForecast> getWeatherForecast(@RequestBody WeatherReq req) throws BusinessException {
		WeatherForecast weatherForecast = weatherService.getWeatherForecast(req);
		return HTTPResut.success(weatherForecast);
	}

	@ApiOperation(value = "获取逐3小时天气预报")
	@RequestMapping(value = "/hourly", method = RequestMethod.POST)
	public HTTPResut<WeatherHourly> getWeatherHourly(@RequestBody WeatherReq req) throws BusinessException {
		WeatherHourly weatherHourly = weatherService.getWeatherHourly(req);
		return HTTPResut.success(weatherHourly);
	}

	@ApiOperation(value = "获取今日生活指数")
	@RequestMapping(value = "/lifestyle", method = RequestMethod.POST)
	public HTTPResut<WeatherLifeStyleNow> getWeatherLifeStyle(@RequestBody WeatherReq req) throws BusinessException {
		WeatherLifeStyleNow weatherLifeStyle = weatherService.getWeatherLifeStyle(req);
		return HTTPResut.success(weatherLifeStyle);
	}

	@ApiOperation(value = "获取空气质量指数")
	@RequestMapping(value = "/air", method = RequestMethod.POST)
	public HTTPResut<WeatherAirNow> getWeatherAir(@RequestBody WeatherReq req) throws BusinessException {
		WeatherAirNow weatherAir = weatherService.getWeatherAir(req);
		return HTTPResut.success(weatherAir);
	}

}
