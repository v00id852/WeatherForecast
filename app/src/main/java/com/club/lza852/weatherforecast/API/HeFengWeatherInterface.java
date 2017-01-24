package com.club.lza852.weatherforecast.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ziang on 2017/1/24.
 */

public class HeFengWeatherInterface {

    public interface mHeFengWeatherInfoInterface {

        @GET("/v5/weather/")
        Call<HeFengForecastModel> getHeFengWeatherInfo(@Query("city") String cityLocation, @Query("token") String token);
    }

}
