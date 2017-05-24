/**
 * 
 */
package com.fyfeng.android.tools.view;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * @author YUZHENGWEI
 * @date 2013-4-22
 * @email yzw1007@gmail.com
 * @QQ 136025011
 * 
 */

public class ViewUtils {

	public static <T> T findViewById(Activity activity, int id, Class<T> clazz) {
		View view = activity.findViewById(id);
		if (null == view) {
			return null;
		}

		return clazz.cast(view);
	}

	public static <T> T findViewById(Fragment fragment, int id, Class<T> clazz) {
		View parent = fragment.getView();
		if (null == parent) {
			return null;
		}
		View view = parent.findViewById(id);
		if (null == view) {
			return null;
		}
		return clazz.cast(view);
	}

	public static <T> T findViewById(View view, int id, Class<T> clazz) {
		View v = view.findViewById(id);
		if (null == v) {
			return null;
		}
		return clazz.cast(v);
	}

	public static void setViewVisible(final Activity activity, final int viewId) {
		View view = activity.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setVisibility(View.VISIBLE);
	}

	public static void setViewVisible(final Fragment fragment, final int viewId) {
		View parent = fragment.getView();
		if (null == parent) {
			return;
		}

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setVisibility(View.VISIBLE);
	}

	public static void setViewVisible(final View parent, final int viewId) {

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setVisibility(View.VISIBLE);
	}

	public static void setViewInVisible(final Activity activity, final int viewId) {
		View view = activity.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setVisibility(View.INVISIBLE);
	}

	public static void setViewInVisible(final Fragment fragment, final int viewId) {

		View parent = fragment.getView();
		if (null == parent) {
			return;
		}

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}

		view.setVisibility(View.INVISIBLE);
	}

	public static void setViewInVisible(final View parent, final int viewId) {

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}

		view.setVisibility(View.INVISIBLE);
	}

	public static void setViewGone(final Activity activity, final int viewId) {
		View view = activity.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setVisibility(View.GONE);
	}

	public static void setViewGone(final Fragment fragment, final int viewId) {
		View parent = fragment.getView();
		if (null == parent) {
			return;
		}

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setVisibility(View.GONE);
	}

	public static void setViewGone(final View parent, final int viewId) {

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setVisibility(View.GONE);
	}

	public static void setBackgroundResource(final Activity activity, final int viewId, final int resid) {
		View view = activity.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setBackgroundResource(resid);
	}

	public static void setBackgroundResource(final Fragment fragment, final int viewId, final int resid) {
		View parent = fragment.getView();
		if (null == parent) {
			return;
		}

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setBackgroundResource(resid);
	}

	public static void setBackgroundColor(final Activity activity, final int viewId, final int resid) {
		View view = activity.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setBackgroundColor(resid);
	}

	public static void setBackgroundColor(final Fragment fragment, final int viewId, final int resid) {
		View parent = fragment.getView();
		if (null == parent) {
			return;
		}

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setBackgroundColor(resid);
	}

	public static void setBackgroundDrawable(final Activity activity, final int viewId, final Drawable background) {
		View view = activity.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setBackgroundDrawable(background);
	}

	public static void setBackgroundDrawable(final Fragment fragment, final int viewId, final Drawable background) {
		View parent = fragment.getView();
		if (null == parent) {
			return;
		}

		View view = parent.findViewById(viewId);
		if (null == view) {
			return;
		}
		view.setBackgroundDrawable(background);
	}

}
