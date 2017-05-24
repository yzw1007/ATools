/**
 * 
 */
package com.fyfeng.android.tools.view;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * @author YUZHENGWEI
 * @date 2013-4-19
 * @email yzw1007@gmail.com
 * @QQ 136025011
 *
 */

public class ImageViewUtils {

	public static void setImageBitmap(final Activity activity, final int viewId, final Bitmap bm){
		ImageView view = (ImageView)activity.findViewById(viewId); 
		if(null == view){
			return;
		}
		view.setImageBitmap(bm);
	}
	public static void setImageDrawable(final Activity activity, final int viewId, final Drawable drawable){
		ImageView view = (ImageView)activity.findViewById(viewId);
		if(null == view){
			return;
		}
		view.setImageDrawable(drawable);
	}
	public static void setImageResource(final Activity activity, final int viewId, final int resId){
		ImageView view = (ImageView)activity.findViewById(viewId);
		if(null == view){
			return;
		}
		view.setImageResource(resId);
	}
	
	public static void setBackgroundResource(final Activity activity, final int viewId, final int resId){
		ImageView view = (ImageView)activity.findViewById(viewId);
		if(null == view){
			return;
		}
		view.setBackgroundResource(resId);
	}
	
	public static void setBackgroundDrawable(final Activity activity, final int viewId, final Drawable background){
		ImageView view = (ImageView)activity.findViewById(viewId);
		if(null == view){
			return;
		}
		view.setBackgroundDrawable(background);
	}
	
	public static void setBackgroundColor(final Activity activity, final int viewId, final int color){
		ImageView view = (ImageView)activity.findViewById(viewId);
		if(null == view){
			return;
		}
		view.setBackgroundColor(color);
	}
	
}
