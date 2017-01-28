package com.club.lza852.weatherforecast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ziang on 2017/1/28.
 */

public class MainWeatherViewPagerActivity extends FragmentActivity {

    //5个地方天气
    private static final int NUM_PAGES = 5;

    @BindView(R.id.weather_view_pager) public ViewPager mPager;

    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_main_layout);
        ButterKnife.bind(this);
        mPagerAdapter = new WeatherViewPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

    }

    private class WeatherViewPagerAdapter extends FragmentStatePagerAdapter {
        @Override
        public Fragment getItem(int position) {
            return new WeatherFragment();
        }

        public WeatherViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
