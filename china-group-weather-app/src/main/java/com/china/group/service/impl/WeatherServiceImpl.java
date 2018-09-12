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
import com.china.group.vo.weather.air.WeatherAirNow;
import com.china.group.vo.weather.forecast.WeatherDaily;
import com.china.group.vo.weather.forecast.WeatherForecast;
import com.china.group.vo.weather.hourly.WeatherHour;
import com.china.group.vo.weather.hourly.WeatherHourly;
import com.china.group.vo.weather.life.WeatherLifeStyleNow;
import com.china.group.vo.weather.now.WeatherNow;
import com.china.group.vo.weather.req.WeatherReq;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Value("${hf.weather.key}")
	private String hfWeatherKey;

	@Value("${hf.weather.imgPrefix}")
	private String hfWeatherImgPrefix;

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

		WeatherForecast forecast = list.get(0);

		List<WeatherDaily> list2 = forecast.getDaily_forecast();

		for (WeatherDaily weatherDaily : list2) {
			String dayCode = weatherDaily.getCond_code_d();
			String nightCode = weatherDaily.getCond_code_n();
			String dayImgUrl = hfWeatherImgPrefix.concat(dayCode).concat(".png");
			String nightImgUrl = hfWeatherImgPrefix.concat(nightCode).concat(".png");
			weatherDaily.setDayImgUrl(dayImgUrl);
			weatherDaily.setNightImgUrl(nightImgUrl);
		}

		return forecast;
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

		WeatherHourly hourly = list.get(0);

		List<WeatherHour> list2 = hourly.getHourly();

		for (WeatherHour weatherHour : list2) {
			String code = weatherHour.getCond_code();
			String imgUrl = hfWeatherImgPrefix.concat(code).concat(".png");
			weatherHour.setImgUrl(imgUrl);
		}

		return hourly;
	}

	@Override
	public WeatherLifeStyleNow getWeatherLifeStyle(WeatherReq req) throws BusinessException {

		req.setKey(hfWeatherKey);
		JSONObject jsonParams = JSON.parseObject(JSON.toJSONString(req));
		JSONObject jsonResult = restHelper.getRestRequet(HfWeatherPathUtils.HFWEATHERHOURLY, JSONObject.class,
				jsonParams);
		CheckResultUtils.checkResult(jsonResult);
		JSONArray jsonArray = jsonResult.getJSONArray("HeWeather6");

		List<WeatherLifeStyleNow> list = jsonArray.toJavaList(WeatherLifeStyleNow.class);

		return list.get(0);
	}

	@Override
	public WeatherAirNow getWeatherAir(WeatherReq req) throws BusinessException {

		req.setKey(hfWeatherKey);
		JSONObject jsonParams = JSON.parseObject(JSON.toJSONString(req));
		JSONObject jsonResult = restHelper.getRestRequet(HfWeatherPathUtils.HFWEATHERHOURLY, JSONObject.class,
				jsonParams);
		CheckResultUtils.checkResult(jsonResult);
		JSONArray jsonArray = jsonResult.getJSONArray("HeWeather6");

		List<WeatherAirNow> list = jsonArray.toJavaList(WeatherAirNow.class);
		return list.get(0);
	}

}
