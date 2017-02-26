package com.club.lza852.weatherforecast;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArraySet;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
import java.util.Random;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import me.relex.circleindicator.CircleIndicator;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ziang on 2017/1/28.
 */

public class MainWeatherViewPagerActivity extends AppCompatActivity {

    //5个地方天气
    private int NUM_PAGES = 1;
    private final int MAX_PAGES = 6;
    //更新标志
    private static int LOCATE_FLAG = 0;
    public static PagerAdapter mPagerAdapter;

    @BindView(R.id.img_background_view_pager) public ViewPager mPager;
    //天气状况
    @BindView(R.id.weather_status)
    TextView weatherStatus;
    //最高气温
    @BindView(R.id.max_temp) TextView maxTemp;
    //最低气温
    @BindView(R.id.min_temp) TextView minTemp;
    //当前气温
    @BindView(R.id.temp) TextView temp;
    //定位图标
    @BindView(R.id.img_locate) ImageView mLocateIcon;
    //城市名
    @BindView(R.id.city_name) TextView mCityNameText;
    //天气预警按钮
    @BindView(R.id.button_weather_alert) Button mWeatherAlertButton;

    //day of week
    @BindViews({R.id.txt_one,R.id.txt_two,R.id.txt_three,R.id.txt_four,R.id.txt_five,R.id.txt_six,R.id.txt_seven})
    List<TextView> daysTextList;
    //weather icon
    @BindViews({R.id.img_one,R.id.img_two,R.id.img_three,R.id.img_four,R.id.img_five,R.id.img_six,R.id.img_seven})
    List<ImageView> daysIconList;

    @BindViews({R.id.max_temp_one,R.id.max_temp_two,R.id.max_temp_three,R.id.max_temp_four,R.id.max_temp_five,R.id.max_temp_six,R.id.max_temp_seven})
    List<TextView> daysMaxTemp;

    @BindViews({R.id.min_temp_one,R.id.min_temp_two,R.id.min_temp_three,R.id.min_temp_four,R.id.min_temp_five,R.id.min_temp_six,R.id.min_temp_seven})
    List<TextView> daysMinTemp;

    @BindView(R.id.hour_temp_chart) LineChart mHourChart;
    @BindView(R.id.actionbar_add_city) ImageView mAddCityButton;
    @BindView(R.id.refresh) ImageView mRefreshButton;

    RetrofitClient retrofitClient = new RetrofitClient();
    CaiYunForecastModel mCaiYunForecastModel;
    CaiYunRealTimeModel mCaiYunRealTimeModel;
    AMapLocationClient mapLocationClient;

    public static String LOG_TAG = "MainActivity";
    private static String PREFES_CITY_LIST_NAME = "CityInfoList";
    private static String PREFES_CITY_LIST_STRING_SET_NAME = "CityInfoStringSet";
    private static String PREFES_IMAGE_NUMBERS_LIST = "BACKGROUND_IMAGE_NUMBERS_LIST";
    private static String PREFES_CITY_LIST_PART = "PREFS_CITY_NAME_";
    public static String INTENT_CURRENT_PAGE_LABEL = "CurrentPage";

    public static final int REQUEST_CODE_ADD_CITY = 1;
    public static final int RESULT_CODE_ADD_CITY_OK = 0;
    public static final int REQUEST_CODE_PERMISSION = 1;

    final RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

    int mCurrentPage = 0;

    private ArrayList<Integer> mRandomImageNumberList = new ArrayList<>();


    //需要申请的权限
    String[] perms = {
            android.Manifest.permission.ACCESS_COARSE_LOCATION,
            android.Manifest.permission.ACCESS_NETWORK_STATE,
            android.Manifest.permission.ACCESS_WIFI_STATE,
            android.Manifest.permission.CHANGE_WIFI_STATE,
            android.Manifest.permission.READ_PHONE_STATE,
            android.Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    //检查权限
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        EasyPermissions.onRequestPermissionsResult(requestCode,permissions,grantResults,this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        final RelativeLayout rootView = (RelativeLayout)findViewById(R.id.main_weather_rootview);
        CircleIndicator circleIndicator = (CircleIndicator)findViewById(R.id.actionbar_indicator);
        ImageView mSettingIcon = (ImageView)findViewById(R.id.setting);

        ButterKnife.bind(this);

        SharedPreferences settingPref = PreferenceManager.getDefaultSharedPreferences(this);
        //读取列表list
        SharedPreferences mCityInfoPref = getSharedPreferences(PREFES_CITY_LIST_NAME,0);
        //设置默认值
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);

        mPagerAdapter = new WeatherViewPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        circleIndicator.setViewPager(mPager);
        mPagerAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                    Log.d(LOG_TAG + "_Selected", position + " ");
                    mCurrentPage = position;
                    updateLayoutFromList(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mAddCityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ModelList.getInstance().checkSizeSame()) {
                    Intent intent = new Intent(MainWeatherViewPagerActivity.this, AddCityActivity.class);
                    startActivityForResult(intent, REQUEST_CODE_ADD_CITY);
                }
            }
        });

        mRefreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRefreshButton.setAnimation(rotateAnimation);
                rotateAnimation.setDuration(400);
                rotateAnimation.setRepeatCount(Animation.INFINITE);
                rotateAnimation.setRepeatMode(Animation.RESTART);
                mRefreshButton.startAnimation(rotateAnimation);
                updateLayoutFromWeb(ModelList.getInstance().getLocationString(mCurrentPage), ModelList.getInstance().getLocationString(mCurrentPage), mCurrentPage, true);
            }
        });

        mWeatherAlertButton.setVisibility(View.GONE);
        mLocateIcon.setVisibility(View.GONE);

        //设置界面监听器
        mSettingIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainWeatherViewPagerActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });

        //检查定位权限
        if (!EasyPermissions.hasPermissions(this, perms)){
            //申请定位权限
            Log.d(LOG_TAG,"Do Not Have Permission");
            EasyPermissions.requestPermissions(this,getString(R.string.permission),REQUEST_CODE_PERMISSION, perms);
        }

        final Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        //设置星期
        for (int i = 0; i < 7; i++){
            daysTextList.get(i).setText(Utils.dayOfWeekInt2String(week + i));
        }

        //是否开启定位
        Boolean isLocate = settingPref.getBoolean(SettingActivity.SET_OPEN_LOCATE, true);

        ModelList.getInstance().clearAllList();
        //如果之前有记录
        if (mCityInfoPref.contains(PREFES_CITY_LIST_PART + "0")){
            Log.d(LOG_TAG, "Have Pref");
            //获取城市数量
            int length = mCityInfoPref.getInt(PREFES_CITY_LIST_PART +"length", 0);
            NUM_PAGES = length;
            for (int i = 0; i < length; i++) {
                    //将信息添加到LocationList中
                    String info = mCityInfoPref.getString(PREFES_CITY_LIST_PART + i,"");
                    if (!info.equals("")) {
                        String[] sepreatedString = info.split(" ");
                        String locationName = sepreatedString[0];
                        String locationString = sepreatedString[1];
                        //将城市名添加到locationList中
                        ModelList.getInstance().addLocation(locationName, locationString, i);
                    }
                }
            //更新界面
            //先单独更新城市名，防止网络断开不能获得数据
            //先更新第一个城市名
            updateCityName(ModelList.getInstance().getLocationName(0), ModelList.getInstance().getLocationString(0), 0,true, true);
            //更新第一个城市数据并显示
            updateLayoutFromWeb(ModelList.getInstance().getLocationString(0),ModelList.getInstance().getLocationName(0),0,true);
                for (int i = 1; i < ModelList.getInstance().getCitySize(); i++) {
                    Log.d(LOG_TAG + "_UPDATE", "" + "update" + " " + i);
                    //更新之后的城市数据，不显示
                    updateLayoutFromWeb(ModelList.getInstance().getLocationString(i), ModelList.getInstance().getLocationName(i),i,false);
                }
            //通知消息改变
            mPagerAdapter.notifyDataSetChanged();
        }

        //如果拥有定位权限，则更新定位信息，如果没有，则等待获得权限后再申请
        if (EasyPermissions.hasPermissions(MainWeatherViewPagerActivity.this, perms)) {
            if (isLocate && LOCATE_FLAG == 0) {
                getLocation(new AMapLocationListener() {
                    @Override
                    public void onLocationChanged(AMapLocation aMapLocation) {
                        if (aMapLocation != null) {
                            if (aMapLocation.getErrorCode() == 0) {
                                String latitude = String.valueOf(aMapLocation.getLatitude());
                                String longitude = String.valueOf(aMapLocation.getLongitude());
                                String locationString = longitude + "," + latitude;
                                String cityName = aMapLocation.getDistrict();
                                //如果当前页是第一页
                                if (mCurrentPage == 0){
                                    //更新城市名称
                                    updateCityName(cityName, locationString, 0,true, true);
                                    //更新定位城市信息
                                    updateLayoutFromWeb(longitude + "," + latitude, cityName, 0, true);
                                } else {
                                    //不是第一页则只更新不显示
                                    updateCityName(cityName, locationString, 0 ,false, true);
                                    updateLayoutFromWeb(longitude + "," + latitude, cityName, 0, false);
                                }
                                //mPagerAdapter.notifyDataSetChanged();
                                //本次应用开启，城市已定位，设置flag
                                LOCATE_FLAG = 1;
                                stopLocate();
                                Log.d(LOG_TAG, "Amp Success");
                            } else {
                                //定位失败
                                Log.e("AmapError", "location Error, ErrCode:"
                                        + aMapLocation.getErrorCode() + ", errInfo:"
                                        + aMapLocation.getErrorInfo());
                                stopLocate();
                                View rootView = findViewById(R.id.main_weather_rootview);
                                Snackbar.make(rootView, R.string.locate_failed, Snackbar.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }
        } //TODO:申请定位权限
    }

    @AfterPermissionGranted(REQUEST_CODE_PERMISSION)
    private void locate(){
            getLocation(new AMapLocationListener() {
                @Override
                public void onLocationChanged(AMapLocation aMapLocation) {
                    if (aMapLocation != null) {
                        if (aMapLocation.getErrorCode() == 0) {
                            String latitude = String.valueOf(aMapLocation.getLatitude());
                            String longitude = String.valueOf(aMapLocation.getLongitude());
                            String locationString = longitude + "," + latitude;
                            String cityName = aMapLocation.getDistrict();
                            //如果当前页是第一页
                            if (mCurrentPage == 0){
                                //更新城市名称
                                updateCityName(cityName, locationString, mCurrentPage,true, true);
                                //更新定位城市信息
                                updateLayoutFromWeb(longitude + "," + latitude, cityName, 0, true);
                            } else {
                                //不是第一页则只更新不显示
                                updateCityName(cityName, locationString,mCurrentPage, false, true);
                                updateLayoutFromWeb(longitude + "," + latitude, cityName, 0, false);
                            }
                            //mPagerAdapter.notifyDataSetChanged();
                            //本次应用开启，城市已定位，设置flag
                            LOCATE_FLAG = 1;
                            stopLocate();
                            Log.d(LOG_TAG, "Amp Success");
                        } else {
                            //定位失败
                            Log.e("AmapError", "location Error, ErrCode:"
                                    + aMapLocation.getErrorCode() + ", errInfo:"
                                    + aMapLocation.getErrorInfo());
                            stopLocate();
                            View rootView = findViewById(R.id.main_weather_rootview);
                            Snackbar.make(rootView, R.string.locate_failed, Snackbar.LENGTH_LONG).show();
                        }
                    }
                }
            });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE_ADD_CITY){
            if (resultCode == RESULT_CODE_ADD_CITY_OK){
                //数据更新
                if (data != null) {
                    if (data.getBooleanExtra(AddCityActivity.UPDATE_LABEL, false)) {
                        Log.d(LOG_TAG,"getBooleanExtra");
                        mPagerAdapter.notifyDataSetChanged();
                        mPager.setCurrentItem(0);
                    }
                }
            }
        }
    }

    @Override
    protected void onPause() {
        SharedPreferences mCityListPref = getSharedPreferences(PREFES_CITY_LIST_NAME,0);
        SharedPreferences.Editor mCityListEditor = mCityListPref.edit();
        ArraySet<String> cityInfo = new ArraySet<>();
        for (int i = 0; i < ModelList.getInstance().getCitySize(); i ++){
            String cityName = PREFES_CITY_LIST_PART + i;
            String cityInfoString = ModelList.getInstance().getLocationName(i) + " " + ModelList.getInstance().getLocationString(i);
            mCityListEditor.putString(cityName,cityInfoString);
        }
        mCityListEditor.putInt(PREFES_CITY_LIST_PART + "length",ModelList.getInstance().getCitySize());
        mCityListEditor.apply();
        getOrProduceAndSaveRandomNumberList();

        super.onPause();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        //从AddCityActivity打开
        if (intent.hasExtra(AddCityActivity.INTENT_CLICK_ITEM_POSITION_LABEL)){
            mCurrentPage = intent.getIntExtra(AddCityActivity.INTENT_CLICK_ITEM_POSITION_LABEL,0);
            mPager.setCurrentItem(mCurrentPage);
            mPagerAdapter.notifyDataSetChanged();
        } else if (intent.hasExtra(SearchActivity.INTENT_LOCATION_NAME_LABEL)){
            //从SearchActivity打开,添加新的城市
            String locationString = intent.getStringExtra(SearchActivity.INTENT_LOCATION_STRING_LABEL);
            String locationName = intent.getStringExtra(SearchActivity.INTENT_LOCATION_NAME_LABEL);
            Log.d(LOG_TAG,locationName);
            if (!ModelList.getInstance().hasLocation(locationName)) {
                NUM_PAGES += 1;
                mCurrentPage = NUM_PAGES - 1;

                updateCityName(locationName, locationString, mCurrentPage, true, false);
                updateLayoutFromWeb(locationString, locationName, mCurrentPage, true);

                mPagerAdapter.notifyDataSetChanged();
                mPager.setCurrentItem(mCurrentPage, false);
            }
        }
    }

    //ViewPager Adapter
    private class WeatherViewPagerAdapter extends FragmentStatePagerAdapter {
        @Override
        public Fragment getItem(int position) {
            Bundle bundle = new Bundle();
            BackgroundImageFragment backgroundImageFragment = new BackgroundImageFragment();
            getOrProduceAndSaveRandomNumberList();
            if (mRandomImageNumberList.size() != 0) {
                Log.d(LOG_TAG+"_Adapter", "position: " + position + "");
                int number = mRandomImageNumberList.get(position);
                bundle.putInt(BackgroundImageFragment.BUNDLE_NUMBER_LABEL,number);
                backgroundImageFragment.setArguments(bundle);
                return backgroundImageFragment;
            } else {
                bundle.putInt(BackgroundImageFragment.BUNDLE_NUMBER_LABEL, 0);
                backgroundImageFragment.setArguments(bundle);
                return backgroundImageFragment;
            }
        }

        public WeatherViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            if (ModelList.getInstance().getCitySize() == 0){
                return 1;
            } else {
                return ModelList.getInstance().getCitySize();
            }
        }
    }

    public void getOrProduceAndSaveRandomNumberList(){
        //读取设置状态参数
        SharedPreferences sharedPreferences = getSharedPreferences(PREFES_CITY_LIST_NAME,0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        mRandomImageNumberList.clear();
        if (sharedPreferences.contains("PREFES_IMAGE_NUMBER_1")){
            for (int i = 0; i< MAX_PAGES; i++){
                String label = "PREFES_IMAGE_NUMBER_"+ i;
                mRandomImageNumberList.add(sharedPreferences.getInt(label,0));
            }
        } else {
            //产生一组随机数
            int count = 0;
            int flag = 0;
            Random random = new Random();
            while ( count < MAX_PAGES){
                int num = random.nextInt(MAX_PAGES);
                Log.d(LOG_TAG, "random" + " " + num);
                for (int number: mRandomImageNumberList){
                    if (num == number){
                        flag = 1;
                    }
                }
                if (flag == 1){
                    flag = 0;
                } else {
                    mRandomImageNumberList.add(num);
                    Log.d(LOG_TAG, "produce" + " " + num);
                    count++;
                    flag = 0;
                }
            }
            //保存
            for (int i = 0; i < mRandomImageNumberList.size(); i ++){
                String label = "PREFES_IMAGE_NUMBER_" + i;
                editor.putInt(label,mRandomImageNumberList.get(i));
            }
            editor.apply();
        }
    }

    public void updateLayoutFromWeb(final String cityLocation, final String cityName, final int index, final Boolean updateLayout){

        //解决bug：更新的数据和当前页面不符
        Log.d(LOG_TAG, "Update Layout From Web");

        //得到实时数据
        retrofitClient.getRealTimeInfo(cityLocation,new Callback<CaiYunRealTimeModel>() {
            @Override
            public void onResponse(Call<CaiYunRealTimeModel> call, Response<CaiYunRealTimeModel> response) {
                mCaiYunRealTimeModel = response.body();
                Log.d(LOG_TAG,"Get" + cityName + "RealInfoModel Succeed");
                //根界面
                View rootView = findViewById(R.id.main_weather_rootview);
                //如果是从searchActivity添加的新的城市
                //更新或者插入
                ModelList.getInstance().updateRealTimeModel(index, mCaiYunRealTimeModel);
                if (updateLayout) {
                    //如果是在当前页
                    if (mCurrentPage == index) {
                        //更新页面显示
                        updateRealTimeLayout(mCaiYunRealTimeModel);
                        //弹出提醒
                        Snackbar.make(rootView, R.string.tip_update_success, Snackbar.LENGTH_SHORT).show();
                    }
                }
                //停止刷新动画
                mRefreshButton.clearAnimation();
            }
            @Override
            public void onFailure(Call<CaiYunRealTimeModel> call, Throwable t) {
                t.printStackTrace();
                Log.e(LOG_TAG,"Get " + cityName + "RealInfoModel Failed");
                View rootView = findViewById(R.id.main_weather_rootview);
                Snackbar.make(rootView, R.string.warning_network_error, Snackbar.LENGTH_LONG).show();
                mRefreshButton.clearAnimation();
            }
        } );
        //得到预报数据
        retrofitClient.getForecastInfo(cityLocation, new Callback<CaiYunForecastModel>() {
            @Override
            public void onResponse(Call<CaiYunForecastModel> call, Response<CaiYunForecastModel> response) {
                mCaiYunForecastModel = response.body();
                Log.d(LOG_TAG, "Get" + cityName + " ForecastInfo Succeed");
                //更新或插入Model
                ModelList.getInstance().updateForecastModel(index, mCaiYunForecastModel);
                if (updateLayout) {
                    //更新显示界面
                    //如果是在当前页
                    if (mCurrentPage == index) {
                        //更新页面显示
                        updateForecastLayout(mCaiYunForecastModel);
                    }
                }
                mRefreshButton.clearAnimation();
            }
            @Override
            public void onFailure(Call<CaiYunForecastModel> call, Throwable t) {
                t.printStackTrace();
                Log.e(LOG_TAG,"Get" + cityName +  " ForecastInfo Failed");
                View rootView = findViewById(R.id.main_weather_rootview);
                Snackbar.make(rootView, R.string.warning_network_error, Snackbar.LENGTH_LONG).show();
                mRefreshButton.clearAnimation();
            }
        });
    }

    //滑动的时候更新函数（从本地更新）
    public void updateLayoutFromList(int indexInList){
        Log.d(LOG_TAG, "Update Layout From List");
        try {
            CaiYunForecastModel caiYunForecastModel = ModelList.getInstance().getForecastModel(indexInList);
            CaiYunRealTimeModel caiYunRealTimeModel = ModelList.getInstance().getRealTimeModel(indexInList);
            String cityName = ModelList.getInstance().getLocationName(indexInList);
            String locationString = ModelList.getInstance().getLocationString(indexInList);
            if (indexInList == 0) {
                //如果更新的是第一个,显示定位图标
                updateCityName(cityName, locationString, indexInList, true, true);
            } else {
                //如果更新的不是第一个,不显示定位图标
                updateCityName(cityName, locationString, indexInList, true, false);
            }
            updateLayout(caiYunForecastModel, caiYunRealTimeModel);
            mRefreshButton.clearAnimation();
        } catch (IndexOutOfBoundsException e){
            //之前从服务器更新的数据还没下载完成
            Log.d(LOG_TAG+"_UPDATE", indexInList + " " + "NULL");
            String cityName = ModelList.getInstance().getLocationName(indexInList);
            String locationString = ModelList.getInstance().getLocationString(indexInList);
            //更新空界面
            updateNullLayout(cityName, locationString, indexInList);
            //停止所有请求
            retrofitClient.cancelCall();
            updateLayoutFromWeb(locationString, cityName, mCurrentPage, true);
        }
    }

    public void updateLayout(CaiYunForecastModel forecastModel, CaiYunRealTimeModel realTimeModel){
        updateForecastLayout(forecastModel);
        updateRealTimeLayout(realTimeModel);
    }

    public void updateNullLayout(String cityName, String cityLocation, int index){
        if (index == 0) {
            updateCityName(cityName, cityLocation, index, true, true);
        } else {
            updateCityName(cityName, cityLocation, index, true, false);
        }
        updateForecastNullLayout();
        updateRealTimeNullLayout();
    }

    public void updateCityName(String cityName, String locationString, int index, Boolean updateLayout, Boolean isLocate){
        //如果是定位城市显示定位标志, 并更新城市名，如果是新添加的城市
        if (isLocate) ModelList.getInstance().updateLocation(0, cityName, locationString);
        else ModelList.getInstance().updateLocation(index, cityName, locationString);
        if (updateLayout) {
            mCityNameText.setText(cityName);
            mRefreshButton.setAnimation(rotateAnimation);
            rotateAnimation.setDuration(400);
            rotateAnimation.setRepeatCount(Animation.INFINITE);
            rotateAnimation.setRepeatMode(Animation.RESTART);
            mRefreshButton.startAnimation(rotateAnimation);
            Log.d("CityName", cityName);
            if (isLocate){
                mLocateIcon.setVisibility(View.VISIBLE);
            } else {
                mLocateIcon.setVisibility(View.GONE);
            }
        }
    }

//    public void updateRealTimeLayout(CaiYunRealTimeModel realTimeModel, Boolean putInList, Boolean updateLayout, Boolean isLocate, int index){
//
//        if (putInList) {
//            if (isLocate){
//                ModelList.getInstance().updateRealTimeModel(0,realTimeModel);
//            } else {
//                ModelList.getInstance().addRealTimeModel(index,realTimeModel);
//            }
//        }
//        if (updateLayout) {
//            //更新实时天气
//            double nowTemp = realTimeModel.getResult().getTemperature();
//            temp.setText(String.format("%d°", Math.round(nowTemp)));
//            String weatherCode = realTimeModel.getResult().getSkycon();
//            //天气状况
//            weatherStatus.setText(Utils.weatherCode2String(weatherCode));
//            Log.d(LOG_TAG, "Update ForecastModel Success");
//        }
//    }

    public void updateRealTimeLayout(CaiYunRealTimeModel realTimeModel){

        //更新实时天气
        double nowTemp = realTimeModel.getResult().getTemperature();
        temp.setText(String.format("%d°", Math.round(nowTemp)));
        String weatherCode = realTimeModel.getResult().getSkycon();
        //天气状况
        weatherStatus.setText(Utils.weatherCode2String(weatherCode));
        Log.d(LOG_TAG, "Update ForecastModel Success");

    }

    public void updateRealTimeNullLayout(){
        temp.setText("N/A°");
        //天气状况
        weatherStatus.setText("晴");
    }

    public void updateForecastNullLayout(){
        maxTemp.setText("--°");
        minTemp.setText("--°");
        //更新预测天气
        for (int i = 0; i < 7; i++) {
            daysIconList.get(i).setImageDrawable(Utils.string2WeatherDrawable(MainWeatherViewPagerActivity.this, ""));
            //更新7天天气数据
            daysMaxTemp.get(i).setText("--°");
            daysMinTemp.get(i).setText("--°");
        }
        mHourChart.clear();
    }

    public void updateForecastLayout(CaiYunForecastModel forecastModel){
            //当前最高最低温度
            Double maxNowTemp = forecastModel.getResult().getDaily().getTemperature().get(0).getMax();
            Double minNowTemp = forecastModel.getResult().getDaily().getTemperature().get(0).getMin();
            Log.d(LOG_TAG, "maxNowTemp: " + String.valueOf(maxNowTemp) + "\nminNowTemp: " + String.valueOf(minNowTemp));
            maxTemp.setText(String.format("%d°", Math.round(maxNowTemp)));
            minTemp.setText(String.format("%d°", Math.round(minNowTemp)));

            //更新预测天气
            for (int i = 0; i < 7; i++) {
                String status = forecastModel.getResult().getDaily().getSkycon().get(i).getValue();
                daysIconList.get(i).setImageDrawable(Utils.string2WeatherDrawable(MainWeatherViewPagerActivity.this, status));
                //更新7天天气数据
                daysMaxTemp.get(i).setText(String.format("%d°", Math.round(forecastModel.getResult().getDaily().getTemperature().get(i).getMax())));
                daysMinTemp.get(i).setText(String.format("%d°", Math.round(forecastModel.getResult().getDaily().getTemperature().get(i).getMin())));
            }

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
            List<Entry> mHourEntrySet = new ArrayList<>();
            final List<String> xLabels = new ArrayList<String>();
            //小时图表绘制
            for (int i = 0; i < 24; i++) {
                float hourlyTemp = (float) forecastModel.getResult().getHourly().getTemperature().get(i).getValue();
                mHourEntrySet.add(new Entry(i, hourlyTemp));
                try {
                    Calendar calendar = Calendar.getInstance();
                    Date date = simpleDateFormat.parse(forecastModel.getResult().getHourly().getTemperature().get(i).getDatetime());
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
            xAxis.setTextColor(ContextCompat.getColor(MainWeatherViewPagerActivity.this, R.color.white));
            //实际最大显示数为x-1
            xAxis.setLabelCount(5);
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM_INSIDE);
            yLeftAxis.setDrawGridLines(false);
            yLeftAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
            yLeftAxis.setTextColor(ContextCompat.getColor(MainWeatherViewPagerActivity.this, R.color.white));
            yLeftAxis.setValueFormatter(new IAxisValueFormatter() {
                @Override
                public String getFormattedValue(float value, AxisBase axis) {
                    return (int)value + "℃";
                }
            });
            yRightAxis.setEnabled(false);
            yLeftAxis.setLabelCount(5);
            yLeftAxis.setSpaceBottom(0.05f);
            yLeftAxis.setSpaceTop(0.05f);
            //圆滑曲线
            lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
            //取消数值显示
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawFilled(true);
            lineDataSet.setColor(ContextCompat.getColor(MainWeatherViewPagerActivity.this, R.color.colorChartValue));
            lineDataSet.setFillColor(ContextCompat.getColor(MainWeatherViewPagerActivity.this, R.color.colorChartValue));
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

    //定位函数，获得经纬度
    public void getLocation(AMapLocationListener mapLocationListener){

        AMapLocationClientOption mapLocationClientOption = new AMapLocationClientOption();
        mapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        mapLocationClientOption.setOnceLocation(true);

        mapLocationClient = new AMapLocationClient(MainWeatherViewPagerActivity.this.getApplicationContext());
        mapLocationClient.setLocationOption(mapLocationClientOption);
        mapLocationClient.setLocationListener(mapLocationListener);
        mapLocationClient.startLocation();
    }

    public void stopLocate(){
        mapLocationClient.startLocation();
        mapLocationClient.onDestroy();
    }
}
