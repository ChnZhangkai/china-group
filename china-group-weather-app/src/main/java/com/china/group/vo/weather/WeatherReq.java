package com.china.group.vo.weather;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "天气查询入参")
public class WeatherReq {

	@ApiModelProperty(value = "城市名称")
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
