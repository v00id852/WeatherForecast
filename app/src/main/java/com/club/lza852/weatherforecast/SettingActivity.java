package com.club.lza852.weatherforecast;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lei on 17-1-30.
 */



public class SettingActivity extends AppCompatActivity {

    @BindView(R.id.actionbar_backbutton) ImageView mSettingBackButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);

        mSettingBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        getFragmentManager().beginTransaction()
                .replace(R.id.setting_fragment_container,new SettingFragment())
                .commit();
    }
}
