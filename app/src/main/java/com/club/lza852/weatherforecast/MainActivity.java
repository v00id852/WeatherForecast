package com.club.lza852.weatherforecast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.club.lza852.weatherforecast.API.CaiYunForecastModel;
import com.club.lza852.weatherforecast.API.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter mAdapter;
    private ArrayList<String> stringArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView mRecyclerview = (RecyclerView)findViewById(R.id.recyclerview);
        mRecyclerview.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(linearLayoutManager);

        RetrofitClient mRetrofit = new RetrofitClient();
        RetrofitClient.getForecastInfo("114.26,33.25", new Callback<CaiYunForecastModel>() {
            @Override
            public void onResponse(Call<CaiYunForecastModel> call, Response<CaiYunForecastModel> response) {
                CaiYunForecastModel mNowCaiYunForecastModel = response.body();
                WeatherListAdapter mAdapter = new WeatherListAdapter(MainActivity.this, mNowCaiYunForecastModel);
                Log.d("RetrofitClient","Success");
                mRecyclerview.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<CaiYunForecastModel> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

    private void setData() {
        stringArrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stringArrayList.add("Item " + (i + 1));
        }
    }
}
