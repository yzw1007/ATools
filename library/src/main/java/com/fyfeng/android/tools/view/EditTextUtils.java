/**
 * 
 */
package com.fyfeng.android.tools.view;

import android.app.Activity;
import android.widget.EditText;

/**
 * @author YUZHENGWEI Date: 2013-4-3 Email: yzw1007@gmail.com QQ: 136025011
 * 
 */

public class EditTextUtils {

	public static void setText(final Activity activity, int viewId, int resId) {
		EditText tview = (EditText) activity.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setText(resId);
	}

	public static void setText(final Activity activity, int viewId, CharSequence text) {
		EditText tview = (EditText) activity.findViewById(viewId);
		if (null == tview) {
			return;
		}
		tview.setText(text);
	}

	public static CharSequence getText(final Activity activity, int viewId) {
		EditText tview = (EditText) activity.findViewById(viewId);
		if (null == tview) {
			return null;
		}
		return tview.getText();
	}
}
