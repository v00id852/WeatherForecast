package com.club.lza852.weatherforecast;

import android.util.Log;

import com.club.lza852.weatherforecast.API.CaiYunForecastModel;
import com.club.lza852.weatherforecast.API.CaiYunRealTimeModel;

import java.util.ArrayList;

/**
 * Created by lei on 17-2-1.
 */
public class ModelList {

    private static ModelList ourInstance = new ModelList();

    public static ModelList getInstance() {
        return ourInstance;
    }

    private static ArrayList<CaiYunForecastModel> mForecastModelList = new ArrayList<>();
    private static ArrayList<CaiYunRealTimeModel> mRealModelList = new ArrayList<>();
    private static ArrayList<String> mLocationList = new ArrayList<>();

    private static String LOG_TAG = "ModelList";

    public void addForecastModel(CaiYunForecastModel caiYunForecastModel){
        mForecastModelList.add(caiYunForecastModel);
    }

    public void removeForecastModel(int index){
        mForecastModelList.remove(index);
    }

    public CaiYunForecastModel getForecastModel(int index){
        return mForecastModelList.get(index);
    }

    public void addRealTimeModel(CaiYunRealTimeModel caiYunRealTimeModel){
        mRealModelList.add(caiYunRealTimeModel);
    }

    public void removeRealTimeModel(CaiYunRealTimeModel caiYunRealTimeModel){
        mRealModelList.remove(caiYunRealTimeModel);
    }

    public CaiYunRealTimeModel getRealTimeModel(int index){
        return mRealModelList.get(index);
    }

    public int getSize(){
        if (mForecastModelList.size() == mRealModelList.size() && mRealModelList.size() == mLocationList.size()){
            return mForecastModelList.size();
        } else {
            Log.e(LOG_TAG, "ModelList Size Error");
            return 0;
        }
    }

    public void addLocation(String location){
        mLocationList.add(location);
    }

    public void removeLocation(int index){
        mLocationList.remove(index);
    }

    public String getLocation(int index){
        return mLocationList.get(index);
    }

    private ModelList() {
    }
}
