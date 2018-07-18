package com.china.group.vo.weather;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "天气更新时间")
public class WeatherUpdate {
	
	@ApiModelProperty(value = "当地时间(yyyy-MM-dd HH:mm)")
	private String loc;

	@ApiModelProperty(value = "OTC时间(yyyy-MM-dd HH:mm)")
	private String utc;

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getUtc() {
		return utc;
	}

	public void setUtc(String utc) {
		this.utc = utc;
	}
	
}
