package com.club.lza852.weatherforecast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

/**
 * Created by ziang on 2017/1/25.
 */

public class Utils {

    public static String dayOfWeekInt2String(int dayOfWeek){
        if (dayOfWeek > 7) dayOfWeek-=7;
        switch (dayOfWeek){
            case 1:
                return "周日";
            case 2:
                return "周一";
            case 3:
                return "周二";
            case 4:
                return "周三";
            case 5:
                return "周四";
            case 6:
                return "周五";
            case 7:
                return "周六";
            default:
                return "";
        }
    }

    public static Drawable string2WeatherDrawable(Context mContext, String status){
        switch (status){
            case "CLEAR_DAY":
            case "CLEAR_NIGHT":
                //晴天
                return ContextCompat.getDrawable(mContext,R.drawable.sun);
            case "PARTLY_CLOUDY_DAY":
            case "PARTLY_CLOUDY_NIGHT":
                return ContextCompat.getDrawable(mContext,R.drawable.partly_cloudy);
            case "CLOUDY":
                //多云
                return ContextCompat.getDrawable(mContext,R.drawable.cloudy);
            case "RAIN":
                return ContextCompat.getDrawable(mContext,R.drawable.rain);
            case "SNOW":
                return ContextCompat.getDrawable(mContext,R.drawable.snow);
            case "WINDY":
                return ContextCompat.getDrawable(mContext,R.drawable.wind);
            case "FOG":
                return ContextCompat.getDrawable(mContext,R.drawable.fog);
            case "HAZE":
                return ContextCompat.getDrawable(mContext,R.drawable.haze);
            case "SLEET":
                return ContextCompat.getDrawable(mContext,R.drawable.sleet);
            default:
                //默认显示晴天
                return ContextCompat.getDrawable(mContext,R.drawable.sun);
        }
    }

    public static String weatherCode2String(String weatherCode){
        switch (weatherCode){
            case "CLEAR_DAY":
            case "CLEAR_NIGHT":return "晴";
            case "PARTLY_CLOUDY_DAY":
            case "PARTLY_CLOUDY_NIGHT":return "多云";
            case "CLOUDY":return "阴";
            case "RAIN":return "雨";
            case "SNOW":return "雪";
            case "WIND":return "风";
            case "FOG":return "雾";
            case "HAZE":return "霾";
            default:return "";
        }
    }
}
