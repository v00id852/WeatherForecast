package com.club.lza852.weatherforecast.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;

/**
 * Created by ziang on 2017/1/16.
 */

public class RetrofitClient {

    private static String BASE_URL = "https://api.caiyunapp.com";

    public void start(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(Gson)
    }
}
