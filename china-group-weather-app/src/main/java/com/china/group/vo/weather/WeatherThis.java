package com.china.group.vo.weather;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "天气基础类")
public class WeatherThis {

	private String status;

	@ApiModelProperty(value = "基础信息")
	private WeatherBasic basic;

	@ApiModelProperty(value = "更新时间")
	private WeatherUpdate update;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public WeatherBasic getBasic() {
		return basic;
	}

	public void setBasic(WeatherBasic basic) {
		this.basic = basic;
	}

	public WeatherUpdate getUpdate() {
		return update;
	}

	public void setUpdate(WeatherUpdate update) {
		this.update = update;
	}

}
