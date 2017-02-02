package com.club.lza852.weatherforecast;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.CompoundButtonCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.club.lza852.weatherforecast.API.CaiYunForecastModel;
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
    public void onBindViewHolder(AddCityViewHolder holder, int position) {

        CaiYunForecastModel caiYunForecastModel = ModelList.getInstance().getForecastModel(position);
        CaiYunRealTimeModel caiYunRealTimeModel = ModelList.getInstance().getRealTimeModel(position);

        //隐藏取消Button
        //holder.mDeleteButton.setVisibility(View.GONE);
        holder.mCityName.setText(ModelList.getInstance().getLocation(position));
        holder.mWeatherImg.setImageDrawable(Utils.string2WeatherDrawable(mContext, caiYunRealTimeModel.getResult().getSkycon()));
        holder.mWeatherCode.setText(Utils.weatherCode2String(caiYunRealTimeModel.getResult().getSkycon()));
        holder.mTemp.setText(Utils.tempDouble2String(caiYunRealTimeModel.getResult().getTemperature()));
        holder.mMaxTemp.setText(Utils.tempDouble2String(caiYunForecastModel.getResult().getDaily().getTemperature().get(0).getMax()));
        holder.mMinTemp.setText(Utils.tempDouble2String(caiYunForecastModel.getResult().getDaily().getTemperature().get(0).getMin()));

        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        holder.mDayOfWeek.setText(Utils.dayOfWeekInt2String(dayOfWeek + 1));
        holder.mWeatherTomorrowImg.setImageDrawable(Utils.string2WeatherDrawable(mContext, caiYunForecastModel.getResult().getDaily().getSkycon().get(1).getValue()));
        holder.mMaxTempTomorrow.setText(Utils.tempDouble2String(caiYunForecastModel.getResult().getDaily().getTemperature().get(1).getMax()));
        holder.mMinTempTomorrow.setText(Utils.tempDouble2String(caiYunForecastModel.getResult().getDaily().getTemperature().get(1).getMin()));
        holder.mAqi.setText(Utils.getAqiString(caiYunRealTimeModel.getResult().getAqi()));
        holder.mAqi.setBackground(Utils.getAqiDrawable(mContext, caiYunRealTimeModel.getResult().getAqi()));
        holder.mMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Todo:点击跳转
            }
        });

        holder.mCardView.setCardBackgroundColor(ContextCompat.getColor(mContext,R.color.colorItemBackground));


    }

    @Override
    public int getItemCount() {
        return ModelList.getInstance().getSize();
    }

    @Override
    public AddCityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_add_city, parent, false);
        return new AddCityViewHolder(v);
    }

    public class AddCityViewHolder extends RecyclerView.ViewHolder {

        //城市名称
        @BindView(R.id.item_city_name)
        TextView mCityName;
        //天气图标
        @BindView(R.id.item_img_weather)
        ImageView mWeatherImg;
        //天气汉字
        @BindView(R.id.item_weather_status_code) TextView mWeatherCode;
        //天气温度
        @BindView(R.id.item_temp) TextView mTemp;
        //最高气温
        @BindView(R.id.item_max_temp) TextView mMaxTemp;
        //明天最高气温
        @BindView(R.id.item_max_temp_tomorrow) TextView mMaxTempTomorrow;
        //最低气温
        @BindView(R.id.item_min_temp) TextView mMinTemp;
        //明天最低气温
        @BindView(R.id.item_min_temp_tomorrow) TextView mMinTempTomorrow;
        //明天星期几
        @BindView(R.id.item_day_of_week) TextView mDayOfWeek;
        //更多
        @BindView(R.id.more) TextView mMore;
        //明天天气图标`
        @BindView(R.id.item_img_tomerrow) ImageView mWeatherTomorrowImg;
        //取消按钮
        @BindView(R.id.item_delete_button) ImageView mDeleteButton;
        //aqi
        @BindView(R.id.item_aqi) TextView mAqi;
        //cardview根节点
        @BindView(R.id.item_cardview) CardView mCardView;

        public AddCityViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
