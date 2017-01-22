package com.club.lza852.weatherforecast;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.club.lza852.weatherforecast.API.ForecastModel;
import com.club.lza852.weatherforecast.API.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

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

        Toolbar mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle("Test");

        final RecyclerView mRecyclerview = (RecyclerView)findViewById(R.id.recyclerview);
        mRecyclerview.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(linearLayoutManager);

        RetrofitClient mRetrofit = new RetrofitClient();
        RetrofitClient.getForecastInfo("114.26,33.25", new Callback<ForecastModel>() {
            @Override
            public void onResponse(Call<ForecastModel> call, Response<ForecastModel> response) {
                ForecastModel mNowForecastModel = response.body();
                WeatherListAdapter mAdapter = new WeatherListAdapter(MainActivity.this,mNowForecastModel);
                Log.d("RetrofitClient","Success");
                mRecyclerview.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<ForecastModel> call, Throwable t) {
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

    public class TestViewHolder extends RecyclerView.ViewHolder{

        TextView mTextView;

        public TestViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView)itemView.findViewById(R.id.textview);
        }
    }
}
