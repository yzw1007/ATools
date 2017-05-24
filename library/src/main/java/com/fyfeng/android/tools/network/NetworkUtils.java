package com.fyfeng.android.tools.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @author yzw1007@gmail.com
 */

public class NetworkUtils {

    /**
     * 判断是否是wifi网络连接
     *
     * @param context Context
     * @return true : wifi网络， false： 非wifi网络
     */
    public static boolean isWifiConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return null != networkInfo && networkInfo.isConnected() && ConnectivityManager.TYPE_WIFI == networkInfo.getType();
    }

    /**
     * 判断是否有网络连接
     *
     * @param context Context
     * @return true: 有网络连接， false：无网络链接
     */
    public static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return null != networkInfo && networkInfo.isConnected();
    }

    /**
     * 获取网络连接类型
     *
     * @param context Context
     * @return 返回网络类型
     */
    public static int getConnectionType(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return null != networkInfo && networkInfo.isConnected() ? networkInfo.getType() : -1;
    }
}
