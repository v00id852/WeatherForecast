package com.club.lza852.weatherforecast.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.club.lza852.weatherforecast.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ziang on 2017/2/20.
 */

public class DistrictsDbUtils {

    private static Context context;
    //数据库存储路径
    private static String SD_PATH = android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/weatherForecast";
    //数据库名称
    private static String DB_FILENAME = "districts.db";
    //表名称
    private static String TB_NAME = "districts";
    //省字段名称
    private static String PROVINVE_NAME = "province_name";
    //城市字段名称
    private static String CITY_NAME = "city_name";
    //市县字段名称
    private static String DISTRICT_NAME = "district_name";

    private static DistrictsDbUtils ourInstance = new DistrictsDbUtils();

    private SQLiteDatabase districtsDb;

    public static DistrictsDbUtils getInstance(Context mContext) {
        context = mContext;
        return ourInstance;
    }

    private DistrictsDbUtils() {
    }

    public SQLiteDatabase opensqlDatabase() {

        File dir = new File(SD_PATH);
        //如果目录不存在
        if (!dir.exists()){
            //创建目录
            dir.mkdir();
        }
        String databaseFilename = SD_PATH + "/" + DB_FILENAME;
        File filepath = new File(databaseFilename);
        //如果文件不存在
        if (! filepath.exists()){
            try{
                InputStream inputStream = context.getResources().openRawResource(R.raw.districts);
                FileOutputStream fileOutputStream = new FileOutputStream(databaseFilename);
                byte[] buff = new byte[8192];
                int len = 0;
                while ((len = inputStream.read(buff)) > 0){
                    fileOutputStream.write(buff,0,len);
                }
                fileOutputStream.close();
                inputStream.close();
            } catch (Exception e){
                Log.e("DatabaseError","无法复制数据库");
                e.printStackTrace();
            }
        }
        Log.i("filepath"," " + filepath);
        SQLiteDatabase database = SQLiteDatabase.openDatabase(filepath.getPath(), null, SQLiteDatabase.OPEN_READWRITE);
        return database;
    }

    public ArrayList<HashMap<String,String>> queryCityInfo(String queryString){

        String query_province = "SELECT * FROM " + TB_NAME + " WHERE " + PROVINVE_NAME + " LIKE '%" + queryString + "%' " + "AND level='district'";
        String query_city = "SELECT * FROM " + TB_NAME + " WHERE " + CITY_NAME + " LIKE '%" + queryString + "%' " + "AND level='district'";
        String query_district = "SELECT * FROM " + TB_NAME + " WHERE " + DISTRICT_NAME + " LIKE '%" + queryString + "%' " + "AND level='district'";

        ArrayList<HashMap<String,String>> info_list = new ArrayList<>();

        if (districtsDb == null){
            districtsDb = opensqlDatabase();
        }

        Cursor cursor = districtsDb.rawQuery(query_province,null);
        while (cursor.moveToNext()){
            HashMap<String,String> info = new HashMap<>();
            info.put("district", cursor.getString(1));
            info.put("city", cursor.getString(2));
            info.put("province", cursor.getString(3));
            info.put("longitude", cursor.getString(5));
            info.put("latitude", cursor.getString(6));
            info_list.add(info);
        }
        if (info_list.size() == 0) {
            cursor = districtsDb.rawQuery(query_city, null);
            //
            while (cursor.moveToNext()) {
                HashMap<String, String> info = new HashMap<>();
                info.put("district", cursor.getString(1));
                info.put("city", cursor.getString(2));
                info.put("province", cursor.getString(3));
                info.put("longitude", cursor.getString(5));
                info.put("latitude", cursor.getString(6));
                info_list.add(info);
            }
            if (info_list.size() == 0){
                cursor = districtsDb.rawQuery(query_district, null);
                while (cursor.moveToNext()){
                    HashMap<String,String> info = new HashMap<>();
                    info.put("district", cursor.getString(1));
                    info.put("city", cursor.getString(2));
                    info.put("province", cursor.getString(3));
                    info.put("longitude", cursor.getString(5));
                    info.put("latitude", cursor.getString(6));
                    info_list.add(info);
                }
            }
        }


        return info_list;
    }
}
