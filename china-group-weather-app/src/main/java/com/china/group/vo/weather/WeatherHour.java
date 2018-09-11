package com.china.group.vo.weather;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "逐3小时天气")
public class WeatherHour {
	
	@ApiModelProperty(value = "预报时间，格式yyyy-MM-dd HH:mm")
	private String time;
	
	@ApiModelProperty(value = "温度")
	private String tmp;
	
	@ApiModelProperty(value = "天气状况代码")
	private String cond_code;
	
	@ApiModelProperty(value = "天气状况")
	private String cond_txt;
	
	@ApiModelProperty(value = "风向360角度")
	private String wind_deg;
	
	@ApiModelProperty(value = "风向")
	private String wind_dir;
	
	@ApiModelProperty(value = "风力")
	private String wind_sc;
	
	@ApiModelProperty(value = "风速，公里/小时")
	private String wind_spd;
	
	@ApiModelProperty(value = "相对湿度")
	private String hum;
	
	@ApiModelProperty(value = "大气压强")
	private String pres;
	
	@ApiModelProperty(value = "	降水概率，百分比")
	private String pop;
	
	@ApiModelProperty(value = "露点温度")
	private String dew;
	
	@ApiModelProperty(value = "云量，百分比")
	private String cloud;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTmp() {
		return tmp;
	}
	public void setTmp(String tmp) {
		this.tmp = tmp;
	}
	public String getCond_code() {
		return cond_code;
	}
	public void setCond_code(String cond_code) {
		this.cond_code = cond_code;
	}
	public String getCond_txt() {
		return cond_txt;
	}
	public void setCond_txt(String cond_txt) {
		this.cond_txt = cond_txt;
	}
	public String getWind_deg() {
		return wind_deg;
	}
	public void setWind_deg(String wind_deg) {
		this.wind_deg = wind_deg;
	}
	public String getWind_dir() {
		return wind_dir;
	}
	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}
	public String getWind_sc() {
		return wind_sc;
	}
	public void setWind_sc(String wind_sc) {
		this.wind_sc = wind_sc;
	}
	public String getWind_spd() {
		return wind_spd;
	}
	public void setWind_spd(String wind_spd) {
		this.wind_spd = wind_spd;
	}
	public String getHum() {
		return hum;
	}
	public void setHum(String hum) {
		this.hum = hum;
	}
	public String getPres() {
		return pres;
	}
	public void setPres(String pres) {
		this.pres = pres;
	}
	public String getPop() {
		return pop;
	}
	public void setPop(String pop) {
		this.pop = pop;
	}
	public String getDew() {
		return dew;
	}
	public void setDew(String dew) {
		this.dew = dew;
	}
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	
}
