package com.china.group.vo.weather;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "天气查询入参")
public class WeatherReq {

	@ApiModelProperty(value = "用户认证Key")
	private String key;

	@ApiModelProperty(value = "城市名称")
	private String location;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
