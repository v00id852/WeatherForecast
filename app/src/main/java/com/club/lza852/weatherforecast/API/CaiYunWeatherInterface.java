package com.club.lza852.weatherforecast.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ziang on 2017/1/16.
 */

public class CaiYunWeatherInterface {


    //实时天气接口
    public static interface mRealTimeInterface {
        @GET("/v2/{token}/{location}/realtime.json")
        Call<CaiYunRealTimeModel> getCaiYunRealTimeInfo(@Path("token") String token, @Path("location") String location);
    }

    //天气预报接口
    public static interface mForecastInterface{
        @GET("/v2/{token}/{location}/forecast.json?hourlysteps=384&alert=true&span=16")
        Call<CaiYunForecastModel> getCaiYunForecastInfo(@Path("token") String token,@Path("location") String location);
    }

    //高德定位接口                                                                               
}
