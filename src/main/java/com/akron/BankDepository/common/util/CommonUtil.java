package com.akron.BankDepository.common.util;

/**
 * <P>
 * 通用工具类
 * </p>
 */
public class CommonUtil {

	public static String hiddenMobile(String mobile) {
		return mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
	}

}
