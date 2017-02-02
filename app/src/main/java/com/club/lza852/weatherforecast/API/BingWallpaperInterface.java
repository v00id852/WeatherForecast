package com.club.lza852.weatherforecast.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lei on 17-1-30.
 */

public interface BingWallpaperInterface {

    @GET("/v1")
    Call<BingWallpaperModel> getBingWallpaperInfo(@Query("d") int day);
}
