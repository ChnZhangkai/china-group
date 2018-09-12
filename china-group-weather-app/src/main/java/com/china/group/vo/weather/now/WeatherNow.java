package com.china.group.vo.weather.now;

import com.china.group.vo.weather.base.WeatherBase;

import io.swagger.annotations.ApiModelProperty;

public class WeatherNow extends WeatherBase{

	@ApiModelProperty(value = "实况天气")
	private WeatherToday now;

	public WeatherToday getNow() {
		return now;
	}

	public void setNow(WeatherToday now) {
		this.now = now;
	}

}
