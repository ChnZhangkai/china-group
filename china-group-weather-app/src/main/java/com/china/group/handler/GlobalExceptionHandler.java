package com.china.group.handler;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.group.exception.BaseException;

/**
 * @ClassName: GlobalExceptionHandler.java
 * @Description: 统一异常处理器
 * @author: 张凯
 * @Date: 2018年7月12日 下午11:56:25
 * @parma <T>
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 普通业务异常处理器
	 * 
	 * @param request
	 * @param response
	 * @param baseException
	 * @return
	 */
	public @ResponseBody <T> String baseException(ServletRequest request, ServletRequest response,
			BaseException baseException) {

		return "exception";

	}

	/**
	 * 未定义及未补获异常处理器
	 * 
	 * @param request
	 * @param response
	 * @param throwable
	 * @return
	 */
	@ExceptionHandler
	public @ResponseBody <T> String baseException(ServletRequest request, ServletResponse response,
			Throwable throwable) {

		return "exception";

	}

}
