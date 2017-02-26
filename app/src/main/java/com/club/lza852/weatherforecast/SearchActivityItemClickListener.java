package com.club.lza852.weatherforecast;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ziang on 2017/2/21.
 */

public class SearchActivityItemClickListener extends RecyclerView.SimpleOnItemTouchListener{

    onItemClickListener mItemClickListener;
    GestureDetectorCompat gestureDetectorCompat;

    //点击事件
    interface onItemClickListener{
        void onSingleClick(View ChildView);
    }

    public SearchActivityItemClickListener(final RecyclerView recyclerView, final onItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
        gestureDetectorCompat = new GestureDetectorCompat(recyclerView.getContext(),new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                View childView = recyclerView.findChildViewUnder(e.getX(),e.getY());
                if (childView != null && mItemClickListener != null){
                    mItemClickListener.onSingleClick(childView);
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
