package com.club.lza852.weatherforecast.API;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ziang on 2017/1/16.
 */

public class RetrofitClient {

    private static String BASE_URL = "https://api.caiyunapp.com";
    //天气预报token
    private static String wftoken = "H7jLXvax2F=x=AFW";
    private static String lokey = "e998272a2c9692254075af57b88ce157";

    //获取天气预报信息
    public static void getForecastInfo(String cityLocation, Callback<ForecastModel> mCallback){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        WeatherInterface.mForecastInterface mForecastAPI = retrofit.create(WeatherInterface.mForecastInterface.class);

        Call<ForecastModel> mForecastCall = mForecastAPI.getForecastInfo(wftoken,cityLocation);

        if (mCallback==null) {
            mCallback = new Callback<ForecastModel>() {
                @Override
                public void onResponse(Call<ForecastModel> call, Response<ForecastModel> response) {
                    if (response.isSuccessful()) {
                        ForecastModel mForecastModel = response.body();
                        Log.d("ForecastInfo", mForecastModel.toString());
                    }
                }

                @Override
                public void onFailure(Call<ForecastModel> call, Throwable t) {
                    t.printStackTrace();
                }
            };
        }

        mForecastCall.enqueue(mCallback);
    }

    //获取实时天气信息
    public static void getRealTimeInfo(String cityLocation, Callback<RealTimeModel> mCallback){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        final WeatherInterface.mRealTimeInterface mRealTimeAPI = retrofit.create(WeatherInterface.mRealTimeInterface.class);

        Call<RealTimeModel> mRealTimeCall = mRealTimeAPI.getRealTimeInfo(wftoken,cityLocation);

        if (mCallback==null){
            mCallback = new Callback<RealTimeModel>() {
                @Override
                public void onResponse(Call<RealTimeModel> call, Response<RealTimeModel> response) {
                    if (response.isSuccessful()){
                        RealTimeModel mRealTimeList = response.body();
                        Log.d("RealTimeInfo",mRealTimeList.toString());
                    }
                }

                @Override
                public void onFailure(Call<RealTimeModel> call, Throwable t) {
                    t.printStackTrace();
                }
            };
        }
        mRealTimeCall.enqueue(mCallback);
    }
}
