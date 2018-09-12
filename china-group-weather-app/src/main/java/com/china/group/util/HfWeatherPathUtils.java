package com.china.group.util;

/**
 * @ClassName: HfWeatherPathUtils.java
 * @Description: 和风天气webservice接口请求路径
 * @author: 张凯
 * @Date: 2018年9月10日 下午1:51:01
 * @parma <T>
 */
public final class HfWeatherPathUtils {
	
	/**
	 * 和风天气实时天气
	 */
	public static final String  HFWEATHERNOW = "https://free-api.heweather.com/s6/weather/now";
	
	/**
	 * 和风天气3-10日天气
	 */
	public static final String HFWEATHERFORECAST = "https://free-api.heweather.com/s6/weather/forecast";
	
	/**
	 * 和风天气逐3小时天气(未来24小时)
	 */
	public static final String HFWEATHERHOURLY = "https://free-api.heweather.com/s6/weather/hourly";
	
	/**
	 * 和风生活指数
	 */
	public static final String HFWEATHERLIFESTYLE = "https://free-api.heweather.com/s6/weather/lifestyle";
	
	/**
	 * 和风空气指数
	 */
	public static final String HFWEATHERAIR = "https://free-api.heweather.com/s6/air/now";
	
}
