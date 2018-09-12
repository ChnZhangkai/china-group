package com.china.group.vo.weather.air;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "空气质量站点情况")
public class WeatherAirStation {
	
	@ApiModelProperty(value = "数据发布时间")
	private String pub_time;
	
	@ApiModelProperty(value = "站点名称")
	private String air_sta;
	
	@ApiModelProperty(value = "站点ID")
	private String asid;
	
	@ApiModelProperty(value = "站点纬度")
	private String lat;
	
	@ApiModelProperty(value = "站点经度")
	private String lon;
	
	@ApiModelProperty(value = "空气质量指数")
	private String air;
	
	@ApiModelProperty(value = "主要污染物")
	private String main;
	
	@ApiModelProperty(value = "空气质量描述")
	private String qity;
	
	@ApiModelProperty(value = "pm10")
	private String pm10;
	
	@ApiModelProperty(value = "pm25")
	private String pm25;
	
	@ApiModelProperty(value = "二氧化氮")
	private String no2;
	
	@ApiModelProperty(value = "二氧化硫")
	private String so2;
	
	@ApiModelProperty(value = "一氧化碳")
	private String co;
	
	@ApiModelProperty(value = "臭氧")
	private String o3;

	public String getPub_time() {
		return pub_time;
	}

	public void setPub_time(String pub_time) {
		this.pub_time = pub_time;
	}

	public String getAir_sta() {
		return air_sta;
	}

	public void setAir_sta(String air_sta) {
		this.air_sta = air_sta;
	}

	public String getAsid() {
		return asid;
	}

	public void setAsid(String asid) {
		this.asid = asid;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getAir() {
		return air;
	}

	public void setAir(String air) {
		this.air = air;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getQity() {
		return qity;
	}

	public void setQity(String qity) {
		this.qity = qity;
	}

	public String getPm10() {
		return pm10;
	}

	public void setPm10(String pm10) {
		this.pm10 = pm10;
	}

	public String getPm25() {
		return pm25;
	}

	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}

	public String getNo2() {
		return no2;
	}

	public void setNo2(String no2) {
		this.no2 = no2;
	}

	public String getSo2() {
		return so2;
	}

	public void setSo2(String so2) {
		this.so2 = so2;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getO3() {
		return o3;
	}

	public void setO3(String o3) {
		this.o3 = o3;
	}
	
}
