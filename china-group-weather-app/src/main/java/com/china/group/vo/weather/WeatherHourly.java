package com.china.group.vo.weather;

import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "逐3小时天气预报")
public class WeatherHourly extends WeatherThis{
	
	private List<WeatherHour> hourly;

	public List<WeatherHour> getHourly() {
		return hourly;
	}

	public void setHourly(List<WeatherHour> hourly) {
		this.hourly = hourly;
	}

}
