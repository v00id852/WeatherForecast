package com.club.lza852.weatherforecast;

import android.util.Log;

import com.club.lza852.weatherforecast.API.CaiYunForecastModel;
import com.club.lza852.weatherforecast.API.CaiYunRealTimeModel;

import java.util.ArrayList;
import java.util.HashMap;

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
    private static ArrayList<HashMap<String,String>> mLocationList = new ArrayList<>();
    private static ArrayList<HashMap<String,String>> mSearchCityResultList = new ArrayList<>();

    private static String LOG_TAG = "ModelList";

    public void setSearchCityResultList(ArrayList<HashMap<String,String>> searchCityResultList){
        mSearchCityResultList = searchCityResultList;
    }

    public ArrayList<HashMap<String,String>> getSearchCityResultList(){
        return mSearchCityResultList;
    }

    public void addForecastModel(CaiYunForecastModel caiYunForecastModel){
        mForecastModelList.add(caiYunForecastModel);
    }

    public void addForecastModel(int index, CaiYunForecastModel caiYunForecastModel){
        mForecastModelList.add(index, caiYunForecastModel);
    }

    public void clearAllList(){
        mLocationList.clear();
        mForecastModelList.clear();
        mRealModelList.clear();
    }

    public void removeCityInfo(int index){
        removeForecastModel(index);
        removeRealTimeModel(index);
        removeLocation(index);
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

    public void addRealTimeModel(int index, CaiYunRealTimeModel caiYunRealTimeModel){
        mRealModelList.add(index, caiYunRealTimeModel);
    }

    public void removeRealTimeModel(int index){
        mRealModelList.remove(index);
    }

    public CaiYunRealTimeModel getRealTimeModel(int index){
        return mRealModelList.get(index);
    }

    public int getCitySize(){
        return mLocationList.size();
    }

    public int getForecastModelSize(){
        return mForecastModelList.size();
    }

    public int getRealTimeModelSize(){
        return mRealModelList.size();
    }

    public boolean checkSizeSame(){
        if (mLocationList.size() == mForecastModelList.size() && mForecastModelList.size() == mRealModelList.size()){
            return true;
        } else{
            Log.d(LOG_TAG, "LOCATION_SIZE: " + mLocationList.size() + " FORECASTMODEL_SIZE: " + mForecastModelList.size() + " REALMODE_SIZE:" + mRealModelList.size());
            return false;
        }
    }

    public void updateForecastModel(int index, CaiYunForecastModel caiYunForecastModel){
        if (mForecastModelList.size() > index) {
            mForecastModelList.remove(index);
            mForecastModelList.add(index, caiYunForecastModel);
        } else {
            mForecastModelList.add(caiYunForecastModel);
        }
    }

    public void updateRealTimeModel(int index, CaiYunRealTimeModel caiYunRealTimeModel){
        if (mRealModelList.size() > index) {
            mRealModelList.remove(index);
            mRealModelList.add(index, caiYunRealTimeModel);
        } else {
            mRealModelList.add(caiYunRealTimeModel);
        }
    }

    public void updateLocation(int index, String locationName, String locationString){
        HashMap<String, String> node = new HashMap<>();
        node.put("locationName", locationName);
        node.put("locationString", locationString);
        if (mLocationList.size() > index) {
            mLocationList.remove(index);
            mLocationList.add(index, node);
        } else {
            mLocationList.add(node);
        }
    }

    //locationString为经纬度坐标，格式1222.44444,1333.33333
    public void addLocation(String locationName, String locationString,int index){
        HashMap<String,String> node = new HashMap<>();
        node.put("locationName",locationName);
        node.put("locationString", locationString);
        mLocationList.add(index,node);
    }

    public void addLocation(String locationName, String locationString){
        HashMap<String,String> node = new HashMap<>();
        node.put("locationName",locationName);
        node.put("locationString", locationString);
        mLocationList.add(node);
    }

    public void removeLocation(int index){
        mLocationList.remove(index);
    }

    public String getLocationName(int index){
        return mLocationList.get(index).get("locationName");
    }

    public String getLocationString(int index){
        return mLocationList.get(index).get("locationString");
    }

    public boolean hasLocation(String locationName) {
        for(HashMap<String,String> node:mLocationList){
            if(node.get("locationName").equals(locationName)){
                return true;
            }
        }
        return false;
    }

    public int getLocationPosition(String locationName){
        int i = 0;
        for (HashMap<String, String> location: mLocationList){
            if (location.get("locationName").equals(locationName)){
                return i;
            } else {
                i++;
            }
        }
        return i;
    }

    private ModelList() {
    }
}
