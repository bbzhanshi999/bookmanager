package com.neuedu.bm.util;

public class StringUtils {
	
	public static boolean isBlank(String target) {
		return target==null ||"".equals(target);
	}
	
	public static boolean isNotBlank(String target) {
		return target!=null && !"".equals(target);
	}
	
	public static boolean isEmpty(String target) {
		return target==null;
	}
	
	public static boolean isNotEmpty(String target) {
		return target!=null;
	}
}
