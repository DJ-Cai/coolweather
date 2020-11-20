package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    /**
     * 发起http请求
     * @param address 传入URL地址
     * @param callback 注册回调来处理服务器响应
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        //创建Request对象：用Builder创建，build之前可以连缀很多方法来丰富他，这里传入地址
        Request request = new Request.Builder().url(address).build();
        //创建call对象，排队准备执行
        client.newCall(request).enqueue(callback);
    }
}
