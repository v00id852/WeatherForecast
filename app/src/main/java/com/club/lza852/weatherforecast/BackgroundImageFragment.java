package com.club.lza852.weatherforecast;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by ziang on 2017/1/28.
 */

public class BackgroundImageFragment extends Fragment {

    String LOG_TAG = "BackgroundImageFragment";
    public static String BUNDLE_NUMBER_LABEL = "RAND_IMAGE_NUMBER";

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.background_image,container,false);
        ImageView imageView = (ImageView)v.findViewById(R.id.img_background);
        int number = getArguments().getInt(BUNDLE_NUMBER_LABEL);
        imageView.setImageDrawable(getImageDrawable(number));
        return v;
    }

    private Drawable getImageDrawable(int number){
        switch (number){
            case 0:
                return ContextCompat.getDrawable(getContext(), R.drawable.img_background_1);
            case 1:
                return ContextCompat.getDrawable(getContext(), R.drawable.img_background_2);
            case 2:
                return ContextCompat.getDrawable(getContext(), R.drawable.img_background_3);
            case 3:
                return ContextCompat.getDrawable(getContext(), R.drawable.img_background_4);
            case 4:
                return ContextCompat.getDrawable(getContext(), R.drawable.img_background_5);
            case 5:
                return ContextCompat.getDrawable(getContext(), R.drawable.img_background_6);
            default:
                return ContextCompat.getDrawable(getContext(), R.drawable.background);
        }
    }

}
