package com.code.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class StringUtils {
	
	public static final String EMPTY_STRING = "";

	/**
	 * 判断字符串对象是否位null或是空字符串
	 * @param s
	 * @return true-为空，false-不为空
	 */
	public static boolean isEmpty(String s){
		if(s==null){
			return true;
		}
		s = s.trim();
		return EMPTY_STRING.equals(s);
	}
	
	/**
	 * 对于多个string类型参数的判断
	 * @param s 要判断是否为空的字符串数组
	 * @return
	 */
	public static boolean isEmpty(String... s){
		boolean isEmpty = false;
		for (int i = 0; i < s.length; i++) {
			if(isEmpty(s[i])){
				isEmpty = true;
				break;
			}
		}
		return isEmpty;
	}
	
	
	/**
	 * 将clob类型转为String
	 * @param data
	 * @return
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws Exception
	 */
	public static String Clob2String(Clob data) throws SQLException, IOException {
		Reader reader = data.getCharacterStream();
		BufferedReader br = new BufferedReader(reader);
		String s = null;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine())!=null){
			sb.append(s);
		}
		return sb.toString();
	}
	/**
	 * 主要用于将数据库读出的数据，把同一列的数据使用逗号链接起来
	 * @param params
	 * @param key
	 * @return
	 */
	public static String getString(List<Map<String, Object>> params, String key){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < params.size(); i++) {
			Object o = params.get(i).get(key);
			if(o != null){
				sb.append(o.toString()).append(i==params.size()-1?"":",");
			}
		}
		return sb.toString();
	}
	/**
	 * 判读originalStr 是否包含字符串 tail，不区分大小写，当任一参数为空时返回false
	 * @param originalStr
	 * @param tail
	 * @return
	 */
	public static boolean containsIgnoreCase(String originalStr, String tail){
		boolean result = false;
		if(!isEmpty(originalStr) && !isEmpty(tail) 
				&& originalStr.toLowerCase().contains(tail.toLowerCase())){
			result = true;
		}
		return result;
	}
	
	/**
	 * 判断一个字符串是否是一个数字
	 * @param s 要判断的字符串
	 * @return true-是，false-否
	 */
	public static boolean isNumber(String s){
		boolean isNumber = false;
		if(!isEmpty(s)){
			try {
				Integer.parseInt(s);
				isNumber = true;
			} catch (Exception e) {
				//ignore
			}
		}
		return isNumber;
	}
	
	/**
	 * 以下为AESEncryptUtil中的方法，主要是字符串与16进制之间的转换
	 */
	private final static String HEX = "0123456789ABCDEF";
	/**
	 * 字节数组转16进制字符串
	 * @param byteArray
	 * @return
	 */
	public static String toHex(byte[] byteArray){
		if(byteArray == null){
			return "";
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteArray.length; i++) {
			sb.append(HEX.charAt((byteArray[i] >> 4) & 0x0f)).append(HEX.charAt(byteArray[i] & 0x0f));
		}
		return sb.toString();
	}
	/**
	 * 16进制字符串转字符串
	 * @param hex
	 * @return
	 */
	public static String fromHex(String hex){
		return new String(toByte(hex));
	}
	/**
	 * 16进制字符串转为字节数组
	 * @param hexString
	 * @return
	 */
	public static byte[] toByte(String hexString){
		int len = hexString.length() / 2;
		byte[] result = new byte[len];
		for (int i = 0; i < len; i++)
			result[i] = Integer.valueOf(hexString.substring(2 * i, 2 * i + 2), 16).byteValue();
		return result;
	}
	/**
	 * 字符串转为16进制字符串
	 * @param txt
	 * @return
	 */
	public static String toHex(String txt){
		return toHex(txt.getBytes());
	}
	
}
