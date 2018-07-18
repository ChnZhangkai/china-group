package com.china.group.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.china.group.rest.RestHelper;

/**
 * @ClassName: BeansConfiguration.java
 * @Description: 初始化定义配置类
 * @author: 张凯
 * @Date: 2018年7月18日 上午12:31:27
 * @parma <T>
 */
@Configuration
public class BeansConfiguration {
	
	@Bean
	public RestHelper rest(){
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setReadTimeout(5000);
		requestFactory.setConnectTimeout(10000);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		return new RestHelper(restTemplate);
	}
	
}
