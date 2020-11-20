package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    //update里的loc代表天气更新的时间
    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
