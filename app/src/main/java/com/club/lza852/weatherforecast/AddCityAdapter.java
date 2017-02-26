package com.club.lza852.weatherforecast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.club.lza852.weatherforecast.API.CaiYunRealTimeModel;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lei on 17-2-1.
 */

public class AddCityAdapter extends RecyclerView.Adapter<AddCityAdapter.AddCityViewHolder> {

    Context mContext;

    public AddCityAdapter(Context mContext) {
        super();
        this.mContext = mContext;
    }


    @Override
    public void onBindViewHolder(AddCityViewHolder holder, final int position) {

        if (holder instanceof AddCityViewHolder) {
            try {
                CaiYunRealTimeModel caiYunRealTimeModel = ModelList.getInstance().getRealTimeModel(position);
                holder.mCityName.setText(ModelList.getInstance().getLocationName(position));
                holder.mWeatherImg.setImageDrawable(Utils.string2WeatherDrawable(mContext, caiYunRealTimeModel.getResult().getSkycon()));
                holder.mTemp.setText(Utils.tempDouble2String(caiYunRealTimeModel.getResult().getTemperature()));

                Calendar calendar = Calendar.getInstance();
                holder.mAqi.setText(Utils.getAqiString(caiYunRealTimeModel.getResult().getAqi()));
                holder.mAqi.setTextColor(Utils.getAqiDrawable(mContext, caiYunRealTimeModel.getResult().getAqi()));
                holder.mHumidity.setText(String.format("%d%%",(int)(caiYunRealTimeModel.getResult().getHumidity() * 100)));
                //还没更新完
            } catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }

//            ((AddCityViewHolder)holder).mCardView.setCardBackgroundColor(ContextCompat.getColor(mContext, R.color.colorItemBackground));
        }

    }


    @Override
    public int getItemCount() {
        return ModelList.getInstance().getCitySize();
    }

    @Override
    public AddCityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_add_city, parent, false);
        return new AddCityViewHolder(v);
    }

    public class AddCityViewHolder extends RecyclerView.ViewHolder {

        //城市名称
        @BindView(R.id.add_city_location_name)
        TextView mCityName;
        //天气图标
        @BindView(R.id.add_city_weather_icon)
        ImageView mWeatherImg;
        //天气温度
        @BindView(R.id.add_city_weather_temp) TextView mTemp;
        //aqi
        @BindView(R.id.add_city_aqi_value) TextView mAqi;
        //humidity
        @BindView(R.id.add_city_water_value) TextView mHumidity;

        public AddCityViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
