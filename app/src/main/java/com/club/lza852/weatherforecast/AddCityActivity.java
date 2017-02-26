package com.club.lza852.weatherforecast;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lei on 17-1-31.
 */

public class AddCityActivity extends AppCompatActivity{

    public static String LOG_TAG = "AddCityActivity";
    public static String UPDATE_LABEL = "ADD_CITY_UPDATE";
    public static String INTENT_CLICK_ITEM_POSITION_LABEL = "ADD_CITY_POSITION";
    private boolean isUpdateCityList = false;


    @BindView(R.id.add_city_recyclerview)
    RecyclerView mAddCityRecyclerView;
    RecyclerView.Adapter mAddCityAdpater;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("城市管理");
        final Scroller mScroller = new Scroller(AddCityActivity.this,new LinearInterpolator(AddCityActivity.this, null));
        mAddCityAdpater = new AddCityAdapter(AddCityActivity.this);

        ButterKnife.bind(this);

        mAddCityRecyclerView.setAdapter(mAddCityAdpater);
        mAddCityRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAddCityRecyclerView.addOnItemTouchListener(new AddCityItemClickListener(mAddCityRecyclerView, new AddCityItemClickListener.onItemClickListener() {
            @Override
            public void onClick(View childView) {
                int position = mAddCityRecyclerView.getChildAdapterPosition(childView);
                Intent intent = new Intent(AddCityActivity.this, MainWeatherViewPagerActivity.class);
                intent.putExtra(INTENT_CLICK_ITEM_POSITION_LABEL,position);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        }));

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP|ItemTouchHelper.DOWN, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                //找到滑动的viewHolder位置并删除
                int position = viewHolder.getAdapterPosition();
                if (ModelList.getInstance().getCitySize() == 1){
                    //只有一个城市时不能删除
                    View rootView = findViewById(R.id.add_city_root_view);
                    mAddCityAdpater.notifyDataSetChanged();
                    Snackbar.make(rootView,R.string.warning_only_one_city,Snackbar.LENGTH_LONG).show();
                } else {
                    if (position != 0) {
                        isUpdateCityList = true;
                        Log.d("position", position + "");
                        Intent data = new Intent();
                        data.putExtra(UPDATE_LABEL, isUpdateCityList);
                        setResult(MainWeatherViewPagerActivity.RESULT_CODE_ADD_CITY_OK, data);
                        ModelList.getInstance().removeCityInfo(position);
//                        MainWeatherViewPagerActivity.mPagerAdapter.notifyDataSetChanged();
                        //通知recyclerview的adapter更新
                        mAddCityAdpater.notifyItemRemoved(position);
                    } else {
                        mAddCityAdpater.notifyDataSetChanged();
                        View rootView = findViewById(R.id.add_city_root_view);
                        Snackbar.make(rootView,R.string.warning_location_city,Snackbar.LENGTH_LONG).show();
                    }
                }
            }

        });
        itemTouchHelper.attachToRecyclerView(mAddCityRecyclerView);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add_city_actionbar,menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","onDestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_city_search:
                Intent intent = new Intent(AddCityActivity.this,SearchActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            default:
                return true;
        }
        return true;
    }
}
