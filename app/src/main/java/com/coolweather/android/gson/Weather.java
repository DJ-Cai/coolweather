package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    //预测是个数组来的，所以用list来装
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
