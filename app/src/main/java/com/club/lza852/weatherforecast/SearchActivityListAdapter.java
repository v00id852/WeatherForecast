package com.club.lza852.weatherforecast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ziang on 2017/2/21.
 */

public class SearchActivityListAdapter extends RecyclerView.Adapter<SearchActivityListAdapter.SearchResultViewHolder>{

    private Context context;

    public SearchActivityListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public void onBindViewHolder(SearchResultViewHolder holder, int position) {
        HashMap<String,String> resultNode = ModelList.getInstance().getSearchCityResultList().get(position);
        String district = resultNode.get("district");
        String city = resultNode.get("city");
        String province = resultNode.get("province");
        String resultString = String.format("%s %s %s",province,city,district);
        holder.mSearchResultDistrict.setText(district);
        holder.mSearchResultInfo.setText(resultString);
    }

    @Override
    public SearchResultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_search_result, parent, false);
        return new SearchResultViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return ModelList.getInstance().getSearchCityResultList().size();
    }

    public class SearchResultViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.item_search_result_district)
        public TextView mSearchResultDistrict;

        @BindView(R.id.item_search_result_info)
        public TextView mSearchResultInfo;

        public SearchResultViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
