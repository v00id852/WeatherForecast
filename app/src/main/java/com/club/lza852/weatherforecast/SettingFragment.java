package com.club.lza852.weatherforecast;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by lei on 17-1-31.
 */

public class SettingFragment extends PreferenceFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }
}
