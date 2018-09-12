package com.china.group.vo.weather.life;

import java.util.List;

import com.china.group.vo.weather.base.WeatherBase;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "今日生活指数")
public class WeatherLifeStyleNow extends WeatherBase {

	@ApiModelProperty(value = "生活指数")
	private List<WeatherLifeStyle> lifestyle;

	public List<WeatherLifeStyle> getLifestyle() {
		return lifestyle;
	}

	public void setLifestyle(List<WeatherLifeStyle> lifestyle) {
		this.lifestyle = lifestyle;
	}

}
