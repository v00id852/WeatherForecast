package com.club.lza852.weatherforecast;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.club.lza852.weatherforecast.Database.DistrictsDbUtils;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lei on 17-1-31.
 */

public class SearchActivity extends AppCompatActivity{

    private static String LOG_TAG = "SearchActivity";
    public static String INTENT_LOCATION_NAME_LABEL = "SEARCH_LOCATION_NAME";
    public static String INTENT_LOCATION_STRING_LABEL = "SEARCH_LOCATION_STRING";

    @BindView(R.id.search_result)
    RecyclerView mSearchResultList;

    @BindView(R.id.search_rootview)
    LinearLayout rootView;

    SearchActivityListAdapter searchActivityListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        ModelList.getInstance().getSearchCityResultList().clear();
        searchActivityListAdapter = new SearchActivityListAdapter(SearchActivity.this);
        mSearchResultList.setAdapter(searchActivityListAdapter);
        mSearchResultList.setLayoutManager(new LinearLayoutManager(SearchActivity.this));
        mSearchResultList.addOnItemTouchListener(new SearchActivityItemClickListener(mSearchResultList, new SearchActivityItemClickListener.onItemClickListener() {
            @Override
            public void onSingleClick(View ChildView) {
                int position = mSearchResultList.getChildAdapterPosition(ChildView);
                String location = ModelList.getInstance().getSearchCityResultList().get(position).get("longitude") + ","+ModelList.getInstance().getSearchCityResultList().get(position).get("latitude");
                Intent locationIntent = new Intent(SearchActivity.this, MainWeatherViewPagerActivity.class);
                locationIntent.putExtra(INTENT_LOCATION_STRING_LABEL,location);
                locationIntent.putExtra(INTENT_LOCATION_NAME_LABEL,ModelList.getInstance().getSearchCityResultList().get(position).get("district"));
                //清除目标和之上所有Activity
                if (ModelList.getInstance().getCitySize() < 6) {
                    locationIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    locationIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(locationIntent);
                } else {
                    Snackbar.make(rootView, R.string.warning_full_city, Snackbar.LENGTH_LONG).show();
                }
            }
        }));

//        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
//            String query = intent.getStringExtra(SearchManager.QUERY);
//
//        }

    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        if (Intent.ACTION_SEARCH.equals(intent.getAction())){
            String query = intent.getStringExtra(SearchManager.QUERY);
            Log.e(LOG_TAG,query);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_actionbar,menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.search_searchview).getActionView();
//        SearchManager searchManager = (SearchManager)getSystemService(Context.SEARCH_SERVICE);
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconified(false);
        searchView.onActionViewExpanded();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //查询数据库
                ArrayList<HashMap<String,String>> result = DistrictsDbUtils.getInstance(SearchActivity.this).queryCityInfo(query);
                ModelList.getInstance().setSearchCityResultList(result);
                searchActivityListAdapter.notifyDataSetChanged();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
