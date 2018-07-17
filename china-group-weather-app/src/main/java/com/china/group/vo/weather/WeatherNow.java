package com.china.group.vo.weather;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "实况天气")
public class WeatherNow {

	private String status;

	@ApiModelProperty(value = "基础信息")
	private WeatherBasic basic;

	@ApiModelProperty(value = "更新时间")
	private WeatherUpdate update;

	@ApiModelProperty(value = "实况天气")
	private WeatherToday now;

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

	public WeatherToday getNow() {
		return now;
	}

	public void setNow(WeatherToday now) {
		this.now = now;
	}

}
