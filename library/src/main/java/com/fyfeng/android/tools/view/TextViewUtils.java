/**
 * 
 */
package com.fyfeng.android.tools.view;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

/**
 * @author YUZHENGWEI Date: 2013-4-3 Email: yzw1007@gmail.com QQ: 136025011
 * 
 */

public class TextViewUtils {

	public static void setText(final Activity activity, int viewId, int resId) {
		TextView tview = (TextView) activity.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setText(resId);
	}

	public static void setText(final Fragment fragment, int viewId, int resId) {
		View view = fragment.getView();
		if (null == view) {
			return;
		}

		TextView tview = (TextView) view.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setText(resId);
	}

	public static void setText(final View parent, int viewId, int resId) {
		TextView tview = (TextView) parent.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setText(resId);
	}

	public static void setText(final Activity activity, int viewId, CharSequence text) {
		TextView tview = (TextView) activity.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setText(text);
	}

	public static void setText(final Fragment fragment, int viewId, CharSequence text) {
		View view = fragment.getView();
		if (null == view) {
			return;
		}

		TextView tview = (TextView) view.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setText(text);
	}

	public static void setText(final View parent, int viewId, CharSequence text) {
		TextView tview = (TextView) parent.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setText(text);
	}

	public static CharSequence getText(final Activity activity, int viewId) {
		TextView tview = (TextView) activity.findViewById(viewId);
		if (null == tview) {
			return null;
		}
		return tview.getText();
	}

	public static CharSequence getText(final View parent, int viewId) {
		TextView tview = (TextView) parent.findViewById(viewId);
		if (null == tview) {
			return null;
		}
		return tview.getText();
	}

	public static void setTextColor(final Activity activity, final int viewId, final int color) {

		TextView tview = (TextView) activity.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setTextColor(color);

	}

	public static void setTextColor(final View parent, final int viewId, final int color) {

		TextView tview = (TextView) parent.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setTextColor(color);

	}

}
