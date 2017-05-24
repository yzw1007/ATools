/**
 * 
 */
package com.fyfeng.android.tools.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 长按事件处理方法注解
 * @author YUZHENGWEI
 * Date: 2013-4-3
 * Email: yzw1007@gmail.com
 * QQ: 136025011
 *
 */

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface LongClickMethod {

	/**
	 * View ID
	 * @return View ID
	 */
	int id();
	boolean consumed() default true;
}
