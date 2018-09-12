package com.china.group.vo.weather.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "天气基础信息")
public class WeatherBasic {
	
	@ApiModelProperty(value = "城市名称")
	private String location;
	
	@ApiModelProperty(value = "城市ID")
	private String cid;
	
	@ApiModelProperty(value = "城市经度")
	private String lat;
	
	@ApiModelProperty(value = "城市纬度")
	private String lon;
	
	@ApiModelProperty(value = "上级城市")
	private String parent_city;
	
	@ApiModelProperty(value = "城市所属行政区域")
	private String admin_area;
	
	@ApiModelProperty(value = "城市所属国家名称")
	private String cnty;
	
	@ApiModelProperty(value = "城市所在时区")
	private String tz;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
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

	public String getParent_city() {
		return parent_city;
	}

	public void setParent_city(String parent_city) {
		this.parent_city = parent_city;
	}

	public String getAdmin_area() {
		return admin_area;
	}

	public void setAdmin_area(String admin_area) {
		this.admin_area = admin_area;
	}

	public String getCnty() {
		return cnty;
	}

	public void setCnty(String cnty) {
		this.cnty = cnty;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}
	
}
