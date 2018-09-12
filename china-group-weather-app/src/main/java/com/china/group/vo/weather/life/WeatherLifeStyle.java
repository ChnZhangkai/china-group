package com.china.group.vo.weather.life;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "生活指数")
public class WeatherLifeStyle {

	@ApiModelProperty(value = "指数类型")
	private String type;

	@ApiModelProperty(value = "指数简介")
	private String brf;

	@ApiModelProperty(value = "指数详细描述")
	private String txt;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrf() {
		return brf;
	}

	public void setBrf(String brf) {
		this.brf = brf;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

}
