package com.code.util;
/**
 * @author km
 * @since 2019年1月17日
 *			自定义service异常类
 */
public class ServiceException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ServiceException(String message) {
		super(message);
	}
}
