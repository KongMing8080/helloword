package com.code.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CheckObjectUtils {
	
	/**
	 * �?查map是否为null或�?�是否含有元�?
	 * @param map
	 * @return
	 */
	public static boolean mapIsNullOrEmpty(Map<?,?> map){
		if(map == null){
			return true;
		}
		if(map.isEmpty()){
			return true;
		}
		return false;
	}
	/**
	 * �?查list是否为null或�?�是否含有元�?
	 * @param list
	 * @return
	 */
	public static boolean listIsNullOrEmpty(List<?> list){
		if(list == null){
			return true;
		}
		if(list.isEmpty()){
			return true;
		}
		return false;
	}
	
	/**
	 * 将map中的value为空值的value换为null
	 * @param params
	 */
	public static void removeNullorEmptyKeys(Map<String, Object> params){
		Iterator<String> it = params.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			String v = params.getOrDefault(key, StringUtils.EMPTY_STRING).toString();
			if(StringUtils.isEmpty(v)){
				params.put(key, null);
			}
		}
	}
	
	private static String phoneNumberRegexp = "^1[3|4|5|7|8|9][0-9]{9}$";
	/**
	 * �?查手机号码是否正�?
	 * @param phone
	 * @return
	 */
	public static boolean checkPhoneNumber(String phone){
		if(!StringUtils.isEmpty(phone)){
			return phone.length()==11 && phone.matches(phoneNumberRegexp);
		}
		return false;
	}
	
}
