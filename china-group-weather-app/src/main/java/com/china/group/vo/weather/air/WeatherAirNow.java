package com.china.group.vo.weather.air;

import java.util.List;

import com.china.group.vo.weather.base.WeatherBase;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "空气质量实况")
public class WeatherAirNow extends WeatherBase {

	@ApiModelProperty(value = "城市空气质量")
	private WeatherAirCity air_now_city;

	@ApiModelProperty(value = "站点空气质量")
	private List<WeatherAirStation> air_now_station;

	public WeatherAirCity getAir_now_city() {
		return air_now_city;
	}

	public void setAir_now_city(WeatherAirCity air_now_city) {
		this.air_now_city = air_now_city;
	}

	public List<WeatherAirStation> getAir_now_station() {
		return air_now_station;
	}

	public void setAir_now_station(List<WeatherAirStation> air_now_station) {
		this.air_now_station = air_now_station;
	}

}
