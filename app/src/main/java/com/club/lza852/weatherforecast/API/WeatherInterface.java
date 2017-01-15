package com.club.lza852.weatherforecast.API;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ziang on 2017/1/16.
 */

public class WeatherInterface {

    //天气预报token
    private static String wftoken = "H7jLXvax2F=x=AFW";

    //实时天气接口
    public static interface mRealTimeInterface {
        @GET("/v2/{token}/{location}/realtime.json")
        Call<List<RealTimeModel>> getRealTimeInfo(@Path("token") String token, @Path("location") String location);
    }

    //天气预报接口
    public static interface mForecastInterface{
        @GET("/v2/{token}/{location}/forecast.json")
        Call<List<ForecastModel>> getForecastInfo(@Path("token") String token, @Path("location") String location);
    }
}
