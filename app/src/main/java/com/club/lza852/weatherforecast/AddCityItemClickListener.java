package com.club.lza852.weatherforecast;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ziang on 2017/2/3.
 */

public class AddCityItemClickListener extends RecyclerView.SimpleOnItemTouchListener {
    private GestureDetectorCompat gestureDetectorCompat;
    private onItemClickListener mListener;

    public interface onItemClickListener {
        void onClick(View childView);
    }

    public AddCityItemClickListener(final RecyclerView recyclerView, final onItemClickListener listener) {
        mListener = listener;
        gestureDetectorCompat = new GestureDetectorCompat(recyclerView.getContext(), new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                if (listener != null) {
                    listener.onClick(recyclerView.findChildViewUnder(e.getX(), e.getY()));
                }
                return true;
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        gestureDetectorCompat.onTouchEvent(e);
        return false;
    }
}
