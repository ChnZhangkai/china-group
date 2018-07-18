package com.china.group.vo.weather;

import io.swagger.annotations.ApiModelProperty;

public class WeatherNow extends WeatherThis{

	@ApiModelProperty(value = "实况天气")
	private WeatherToday now;

	public WeatherToday getNow() {
		return now;
	}

	public void setNow(WeatherToday now) {
		this.now = now;
	}

}
