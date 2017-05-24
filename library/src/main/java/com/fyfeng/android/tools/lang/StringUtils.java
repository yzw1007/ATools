/**
 * 
 */
package com.fyfeng.android.tools.lang;

/**
 * @author yuzw
 * @date 2014年2月14日
 * @email yzw1007@gmail.com
 * @QQ 136025011
 * 
 */

public class StringUtils {

	public static final String EMPTY = "";

	public static String trimToEmpty(String str) {
		return null == str ? EMPTY : str.trim();
	}

	public static String trimToNull(String str) {
		String tstr = trim(str);
		return isEmpty(tstr) ? null : tstr;
	}

	public static String trim(String str) {
		return null == str ? null : str.trim();
	}

	/**
	 * Checks if a CharSequence is empty ("") or null.
	 * 
	 * @param cs
	 * @return
	 */
	public static boolean isEmpty(CharSequence cs) {
		return null == cs || cs.length() == 0;
	}

	/**
	 * Checks if a CharSequence is not empty ("") and not null.
	 * 
	 * @param cs
	 * @return
	 */
	public static boolean isNotEmpty(CharSequence cs) {
		return !StringUtils.isEmpty(cs);
	}

	/**
	 * Checks if a CharSequence is whitespace, empty ("") or null.
	 * 
	 * @param cs
	 * @return
	 */
	public static boolean isBlank(CharSequence cs) {
		int strLen;
		if (cs == null || (strLen = cs.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if (Character.isWhitespace(cs.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if a CharSequence is not empty (""), not null and not whitespace
	 * only.
	 * 
	 */
	public static boolean isNotBlank(CharSequence cs) {
		return !StringUtils.isBlank(cs);
	}
}
