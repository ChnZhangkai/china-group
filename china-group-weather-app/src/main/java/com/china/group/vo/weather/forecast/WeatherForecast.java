package com.china.group.vo.weather.forecast;

import java.util.List;

import com.china.group.vo.weather.base.WeatherBase;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "3-10天天气预报")
public class WeatherForecast extends WeatherBase{
	
	@ApiModelProperty(value = "天气列表")
	private List<WeatherDaily> daily_forecast;

	public List<WeatherDaily> getDaily_forecast() {
		return daily_forecast;
	}

	public void setDaily_forecast(List<WeatherDaily> daily_forecast) {
		this.daily_forecast = daily_forecast;
	}

}
