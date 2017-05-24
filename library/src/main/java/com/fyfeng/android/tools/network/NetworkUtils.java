/**
 * 
 */
package com.fyfeng.android.tools.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @author yzw1007@gmail.com
 * 
 */

public class NetworkUtils {

	public static boolean isConnected(Context context) {
		ConnectivityManager mg = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = mg.getActiveNetworkInfo();
		return null != networkInfo && networkInfo.isConnected();
	}
	
	public static int getConnectionType(Context context){
		ConnectivityManager mg = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = mg.getActiveNetworkInfo();
		return null != networkInfo && networkInfo.isConnected() ? networkInfo.getType() : -1;
	}
}
