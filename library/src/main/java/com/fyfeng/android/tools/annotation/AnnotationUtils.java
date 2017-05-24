/**
 * 
 */
package com.fyfeng.android.tools.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

/**
 * @author YUZHENGWEI Date: 2013-4-3 Email: yzw1007@gmail.com QQ: 136025011
 * 
 */

public class AnnotationUtils {

	public static void inject(Activity activity) {

		AnnotationUtils.bind(activity);

	}

	public static void inject(Fragment fragment) {

		AnnotationUtils.bind(fragment);

	}

	private static void bind(final Activity activity) {
		Method[] methods = activity.getClass().getDeclaredMethods();
		for (int k = 0; k < methods.length; k++) {

			final Method method = methods[k];
			if (method.isAnnotationPresent(ClickMethod.class)) {
				click(activity, method);
			}
			if (method.isAnnotationPresent(LongClickMethod.class)) {
				longClick(activity, method);
			}
		}
	}

	private static void bind(final Fragment fragment) {
		Method[] methods = fragment.getClass().getDeclaredMethods();
		for (int k = 0; k < methods.length; k++) {

			final Method method = methods[k];
			if (method.isAnnotationPresent(ClickMethod.class)) {
				click(fragment, method);
			}
			if (method.isAnnotationPresent(LongClickMethod.class)) {
				longClick(fragment, method);
			}
		}
	}

	private static void longClick(final Fragment fragment, final Method method) {
		final LongClickMethod longClick = method.getAnnotation(LongClickMethod.class);
		final View view = fragment.getView().findViewById(longClick.id());

		longClick(fragment, view, method);
	}

	private static void click(final Fragment fragment, final Method method) {
		final ClickMethod click = method.getAnnotation(ClickMethod.class);
		final View view = fragment.getView().findViewById(click.id());

		click(fragment, view, method);

	}

	private static void longClick(final Activity activity, final Method method) {
		final LongClickMethod longClick = method.getAnnotation(LongClickMethod.class);
		final View view = activity.findViewById(longClick.id());

		longClick(activity, view, method);

		/*
		 * view.setOnLongClickListener(new OnLongClickListener(){
		 * 
		 * @Override public boolean onLongClick(View v) { try {
		 * method.invoke(activity, new Object[]{view}); } catch
		 * (IllegalArgumentException e) { e.printStackTrace(); } catch
		 * (IllegalAccessException e) { e.printStackTrace(); } catch
		 * (InvocationTargetException e) { e.printStackTrace(); } return
		 * longClick.consumed(); }});
		 */
	}

	private static void longClick(final Object object, final View view, final Method method) {
		final LongClickMethod longClick = method.getAnnotation(LongClickMethod.class);
		// final View view = activity.findViewById(longClick.id());
		view.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {
				try {
					method.invoke(object, new Object[] { view });
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				return longClick.consumed();
			}
		});
	}

	private static void click(final Activity activity, final Method method) {
		final ClickMethod click = method.getAnnotation(ClickMethod.class);
		final View view = activity.findViewById(click.id());

		click(activity, view, method);

		/*
		 * view.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { try { method.invoke(activity,
		 * new Object[] {view}); } catch (IllegalArgumentException e) {
		 * e.printStackTrace(); } catch (IllegalAccessException e) {
		 * e.printStackTrace(); } catch (InvocationTargetException e) {
		 * e.printStackTrace(); } } });
		 */
	}

	private static void click(final Object object, final View view, final Method method) {
		view.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				try {
					method.invoke(object, new Object[] { view });
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
