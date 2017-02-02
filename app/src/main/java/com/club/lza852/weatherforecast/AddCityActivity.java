package com.club.lza852.weatherforecast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lei on 17-1-31.
 */

public class AddCityActivity extends AppCompatActivity{

    @BindView(R.id.add_city_recyclerview)
    RecyclerView mAddCityRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcity);

        ButterKnife.bind(this);

        mAddCityRecyclerView.setAdapter(new AddCityAdapter(AddCityActivity.this));
        mAddCityRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
