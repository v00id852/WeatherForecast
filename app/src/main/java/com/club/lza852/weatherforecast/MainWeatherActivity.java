package com.club.lza852.weatherforecast;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.club.lza852.weatherforecast.API.CaiYunForecastModel;
import com.club.lza852.weatherforecast.API.CaiYunRealTimeModel;
import com.club.lza852.weatherforecast.API.RetrofitClient;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ziang on 2017/1/15.
 */

public class MainWeatherActivity extends AppCompatActivity {


    //天气状况
    @BindView(R.id.weather_status) TextView weatherStatus;
    //最高气温
    @BindView(R.id.max_temp) TextView maxTemp;
    //最低气温
    @BindView(R.id.min_temp) TextView minTemp;
    //当前气温
    @BindView(R.id.temp) TextView temp;

    @BindView(R.id.img_background) ImageView background;

    //城市名
    @BindView(R.id.city_name) TextView mCityNameText;

    //day of week
    @BindViews({R.id.txt_one,R.id.txt_two,R.id.txt_three,R.id.txt_four,R.id.txt_five,R.id.txt_six,R.id.txt_seven})
    List<TextView> daysTextList;
    //weather icon
    @BindViews({R.id.img_one,R.id.img_two,R.id.img_three,R.id.img_four,R.id.img_five,R.id.img_six,R.id.img_seven})
    List<ImageView> daysIconList;

    @BindView(R.id.hour_temp_chart) LineChart mHourChart;

    Map<String, String> query = new ArrayMap<>();

    RetrofitClient retrofitClient = new RetrofitClient();

    CaiYunForecastModel mCaiYunForecastModel;
    CaiYunRealTimeModel mCaiYunRealTimeModel;

    AMapLocationClient mapLocationClient;


    String LOG_TAG = "MainWeatherActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        query.put("hourlysteps","384");
        query.put("alert","true");

        //Todo:申请定位权限

        getLocation(new AMapLocationListener() {
            @Override
            public void onLocationChanged(AMapLocation aMapLocation) {
                if (aMapLocation != null){
                    if (aMapLocation.getErrorCode() == 0){
                        String latitude = String.valueOf(aMapLocation.getLatitude());
                        String longitude = String.valueOf(aMapLocation.getLongitude());
                        String cityName = aMapLocation.getDistrict();
                        updateLayout(longitude+','+latitude, cityName);
                        stopLocate();
                        Log.d(LOG_TAG,"Amp Success");
                    } else {
                        //定位失败
                        Log.e("AmapError","location Error, ErrCode:"
                                + aMapLocation.getErrorCode() + ", errInfo:"
                                + aMapLocation.getErrorInfo());
                        stopLocate();
                    }
                }
            }
        });

        //检测是否存在地名数据库
        SQLiteDatabase placeDB = openOrCreateDatabase("place.db",MODE_PRIVATE,null);



    }

    public void storePlaceData(){
        SQLiteDatabase placeDB = openOrCreateDatabase("place.db",MODE_PRIVATE,null);

    }

    public void updateLayout(String cityLocation,String cityName){

        query.put("alert","true");
        query.put("hourlysteps","384");

        final Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        //设置星期
        for (int i = 0; i < 7; i++){
            daysTextList.get(i).setText(Utils.dayOfWeekInt2String(week + i));
        }

        //城市地址
        mCityNameText.setText(cityName);
        //得到实时温度数据

        retrofitClient.getRealTimeInfo(cityLocation,new Callback<CaiYunRealTimeModel>() {
            @Override
            public void onResponse(Call<CaiYunRealTimeModel> call, Response<CaiYunRealTimeModel> response) {
                mCaiYunRealTimeModel = response.body();
                Log.d(LOG_TAG, "Get RealTimeModel Success:\n" + response.body().toString());
                //更新天气
                double nowTemp = mCaiYunRealTimeModel.getResult().getTemperature();
                temp.setText(String.format("%d°", Math.round(nowTemp)));
                String weatherCode = mCaiYunRealTimeModel.getResult().getSkycon();
                //天气状况
                weatherStatus.setText(Utils.weatherCode2String(weatherCode));
            }

            @Override
            public void onFailure(Call<CaiYunRealTimeModel> call, Throwable t) {
                t.printStackTrace();
                Log.e(LOG_TAG,"Get RealInfoModel Failed");
            }
        } );

        //得到预报数据
        retrofitClient.getForecastInfo(cityLocation, query, new Callback<CaiYunForecastModel>() {
            @Override
            public void onResponse(Call<CaiYunForecastModel> call, Response<CaiYunForecastModel> response) {
                mCaiYunForecastModel = response.body();
                Log.d(LOG_TAG, "Get ForecastModel Success");

                //当前最高最低温度
                Double maxNowTemp = mCaiYunForecastModel.getResult().getDaily().getTemperature().get(0).getMax();
                Double minNowTemp = mCaiYunForecastModel.getResult().getDaily().getTemperature().get(0).getMin();
                Log.d(LOG_TAG, "maxNowTemp: " + String.valueOf(maxNowTemp) + "\nminNowTemp: " + String.valueOf(minNowTemp));
                maxTemp.setText(String.format("%d°", Math.round(maxNowTemp)));
                minTemp.setText(String.format("%d°", Math.round(minNowTemp)));

                for (int i = 0; i < 7; i++) {

                    String status = mCaiYunForecastModel.getResult().getDaily().getSkycon().get(i).getValue();
                    daysIconList.get(i).setImageDrawable(Utils.string2WeatherDrawable(MainWeatherActivity.this, status));
                }

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
                List<Entry> mHourEntrySet = new ArrayList<>();
                final List<String> xLabels = new ArrayList<String>();
                //图表绘制
                for (int i = 0; i < 24; i++) {
                    float hourlyTemp = (float) mCaiYunForecastModel.getResult().getHourly().getTemperature().get(i).getValue();
                    mHourEntrySet.add(new Entry(i, hourlyTemp));

                    try {
                        Date date = simpleDateFormat.parse(mCaiYunForecastModel.getResult().getHourly().getTemperature().get(i).getDatetime());
                        calendar.setTime(date);
                        //横坐标的名称
                        if (i == 0) {
                            //防止x标签与y标签重合
                            xLabels.add("");
                        } else {
                            xLabels.add(String.valueOf(calendar.get(Calendar.HOUR_OF_DAY)) + ":00");
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                LineDataSet lineDataSet = new LineDataSet(mHourEntrySet, "");
                XAxis xAxis = mHourChart.getXAxis();
                YAxis yLeftAxis = mHourChart.getAxisLeft();
                YAxis yRightAxis = mHourChart.getAxisRight();
                xAxis.setValueFormatter(new IAxisValueFormatter() {
                    @Override
                    public String getFormattedValue(float value, AxisBase axis) {
                        return xLabels.get((int) value);
                    }
                });
                xAxis.setDrawAxisLine(false);
                xAxis.setDrawGridLines(false);
                xAxis.setTextColor(ContextCompat.getColor(MainWeatherActivity.this, R.color.white));
                //实际最大显示数为x-1
                xAxis.setLabelCount(5);
                xAxis.setPosition(XAxis.XAxisPosition.BOTTOM_INSIDE);

                yLeftAxis.setDrawGridLines(false);
                yLeftAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
                yLeftAxis.setTextColor(ContextCompat.getColor(MainWeatherActivity.this, R.color.white));
                yRightAxis.setEnabled(false);

                //圆滑曲线
                lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
                //取消数值显示
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setColor(ContextCompat.getColor(MainWeatherActivity.this, R.color.colorChartValue));
                lineDataSet.setFillColor(ContextCompat.getColor(MainWeatherActivity.this, R.color.colorChartValue));
                //透明曲线
                lineDataSet.setFillAlpha(200);

                LineData lineData = new LineData(lineDataSet);

                Legend legend = mHourChart.getLegend();
                legend.setEnabled(false);
                Description description = mHourChart.getDescription();
                description.setEnabled(false);

                mHourChart.setViewPortOffsets(0f, 0f, 0f, 0f);
                mHourChart.setTouchEnabled(false);
                mHourChart.setData(lineData);
                mHourChart.invalidate();

            }

            @Override
            public void onFailure(Call<CaiYunForecastModel> call, Throwable t) {
                t.printStackTrace();
                Log.e(LOG_TAG,"Get RealTimeInfo Failed");
            }
        });

        background.setImageDrawable(ContextCompat.getDrawable(MainWeatherActivity.this,R.drawable.background));
    }

    //定位函数，获得经纬度
    public void getLocation(AMapLocationListener mapLocationListener){

        AMapLocationClientOption mapLocationClientOption = new AMapLocationClientOption();
        mapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        mapLocationClientOption.setOnceLocation(true);

        mapLocationClient = new AMapLocationClient(getApplicationContext());
        mapLocationClient.setLocationOption(mapLocationClientOption);
        mapLocationClient.setLocationListener(mapLocationListener);
        mapLocationClient.startLocation();
    }

    public void stopLocate(){
        mapLocationClient.startLocation();
        mapLocationClient.onDestroy();
    }

}
