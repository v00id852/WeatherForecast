package com.club.lza852.weatherforecast;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.club.lza852.weatherforecast.API.ForecastModel;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lei on 17-1-20.
 */

/*
主界面RecyclerView所使用的Adpater 2017-1-20
 */

public class WeatherListAdapter extends RecyclerView.Adapter {

    private ForecastModel mForecastModel;

    private static int FIVE_DAYS_FORECAST = 1;

    //预报的天数
    private static int FORECAST_DAYS = 5;

    private Context mContext;

    private String LOG_TAG = "WeatherListAdpater";

    public WeatherListAdapter(Context mContext, ForecastModel mForecastModel){
        this.mContext = mContext;
        this.mForecastModel = mForecastModel;
    }

    private String dayOfWeekInt2String(int dayOfWeek){
        if (dayOfWeek > 7) dayOfWeek-=7;
        switch (dayOfWeek){
            case 1:
                return "周日";
            case 2:
                return "周一";
            case 3:
                return "周二";
            case 4:
                return "周三";
            case 5:
                return "周四";
            case 6:
                return "周五";
            case 7:
                return "周六";
            default:
                return "";
        }
    }

    /*
    输入参数：天气状况字符串
    功能：由返回天气状况得到对应图标的drawable
    输出：对应天气状况图标的Drawable
    */
    @RequiresApi(21)
    private Drawable string2WeatherDrawableAPI21(String status){
        switch (status){
            case "CLEAR_DAY":
            case "CLEAR_NIGHT":
                //晴天
                return mContext.getDrawable(R.drawable.sun_black);
            case "PARTLY_CLOUDY_DAY":
            case "PARTLY_CLOUDY_NIGHT":
            case "CLOUDY":
                //多云
                return mContext.getDrawable(R.drawable.cloudy_black);
            case "RAIN":
                return mContext.getDrawable(R.drawable.big_rain_black);
            case "SNOW":
                return mContext.getDrawable(R.drawable.big_snow_black);
            case "WINDY":
                return mContext.getDrawable(R.drawable.wind_black);
            case "FOG":
                return null;
            default:
                //默认显示晴天
                return mContext.getDrawable(R.drawable.sun_black);
        }
    }

    private Drawable string2WeatherDrawable(String status){
        switch (status){
            case "CLEAR_DAY":
            case "CLEAR_NIGHT":
                //晴天
                return mContext.getResources().getDrawable(R.drawable.sun_black);
            case "PARTLY_CLOUDY_DAY":
            case "PARTLY_CLOUDY_NIGHT":
            case "CLOUDY":
                //多云
                return mContext.getResources().getDrawable(R.drawable.cloudy_black);
            case "RAIN":
                return mContext.getResources().getDrawable(R.drawable.big_rain_black);
            case "SNOW":
                return mContext.getResources().getDrawable(R.drawable.big_snow_black);
            case "WINDY":
                return mContext.getResources().getDrawable(R.drawable.wind_black);
            case "FOG":
                return null;
            default:
                //默认显示晴天
                return mContext.getResources().getDrawable(R.drawable.sun_black);
        }
    }



    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

        //五天天气预报view
        if (holder instanceof FiveDaysItem){
            //获得当前周几 2017-1-20
            Calendar mCalendar = Calendar.getInstance();
            int dayOfWeekNow = mCalendar.get(Calendar.DAY_OF_WEEK);
            Log.d(LOG_TAG,String.valueOf(dayOfWeekNow));

            //修改周几标签 2017-1-20
            ((FiveDaysItem) holder).mOneDayTxt.setText("今天");
            ((FiveDaysItem) holder).mTwoDayTxt.setText(dayOfWeekInt2String(dayOfWeekNow + 1));
            ((FiveDaysItem) holder).mThreeDayTxt.setText(dayOfWeekInt2String(dayOfWeekNow + 2));
            ((FiveDaysItem) holder).mFourDayTxt.setText(dayOfWeekInt2String(dayOfWeekNow + 3));
            ((FiveDaysItem) holder).mFiveDayTxt.setText(dayOfWeekInt2String(dayOfWeekNow + 4));

            //设置天气图标 2017-1-20
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                //第一天
                ((FiveDaysItem) holder).mOneDayImg.setImageDrawable(string2WeatherDrawableAPI21(mForecastModel.getResult().getDaily().getSkycon().get(0).getValue()));
                //第二天
                ((FiveDaysItem) holder).mTwoDayImg.setImageDrawable(string2WeatherDrawableAPI21(mForecastModel.getResult().getDaily().getSkycon().get(1).getValue()));
                //第三天
                ((FiveDaysItem) holder).mThreeDayImg.setImageDrawable(string2WeatherDrawableAPI21(mForecastModel.getResult().getDaily().getSkycon().get(2).getValue()));
                //第四天
                ((FiveDaysItem) holder).mFourDayImg.setImageDrawable(string2WeatherDrawableAPI21(mForecastModel.getResult().getDaily().getSkycon().get(3).getValue()));
                //第五天
                ((FiveDaysItem) holder).mFiveDayImg.setImageDrawable(string2WeatherDrawableAPI21(mForecastModel.getResult().getDaily().getSkycon().get(4).getValue()));
            } else {
                //API21以下
                //第一天
                ((FiveDaysItem) holder).mOneDayImg.setImageDrawable(string2WeatherDrawable(mForecastModel.getResult().getDaily().getSkycon().get(0).getValue()));
                //第二天
                ((FiveDaysItem) holder).mTwoDayImg.setImageDrawable(string2WeatherDrawable(mForecastModel.getResult().getDaily().getSkycon().get(1).getValue()));
                //第三天
                ((FiveDaysItem) holder).mThreeDayImg.setImageDrawable(string2WeatherDrawable(mForecastModel.getResult().getDaily().getSkycon().get(2).getValue()));
                //第四天
                ((FiveDaysItem) holder).mFourDayImg.setImageDrawable(string2WeatherDrawable(mForecastModel.getResult().getDaily().getSkycon().get(3).getValue()));
                //第五天
                ((FiveDaysItem) holder).mFiveDayImg.setImageDrawable(string2WeatherDrawable(mForecastModel.getResult().getDaily().getSkycon().get(4).getValue()));
            }

            //温度图表切换按钮 2017-1-23
            ((FiveDaysItem) holder).mTempButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //设置格式
                    ((FiveDaysItem) holder).mTempButton.setTextColor(ContextCompat.getColor(mContext,R.color.colorButtonFontSelected));
                    ((FiveDaysItem) holder).mTempButton.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorButtonSelected));
                    ((FiveDaysItem) holder).mHumiButton.setTextColor(ContextCompat.getColor(mContext,R.color.colorButtonFontUnselected));
                    ((FiveDaysItem) holder).mHumiButton.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorButtonUnselected));
                    //阻止重复点击
                    ((FiveDaysItem) holder).mTempButton.setClickable(false);
                    ((FiveDaysItem) holder).mHumiButton.setClickable(true);
                    //更新图表数据
                    ((FiveDaysItem) holder).mLineChart.setData(makeTempDataSet());
                    ((FiveDaysItem) holder).mLineChart.invalidate();

                }
            });

            //湿度图表切换按钮
            ((FiveDaysItem) holder).mHumiButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //设置格式
                    ((FiveDaysItem) holder).mHumiButton.setTextColor(ContextCompat.getColor(mContext,R.color.colorButtonFontSelected));
                    ((FiveDaysItem) holder).mHumiButton.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorButtonSelected));
                    ((FiveDaysItem) holder).mTempButton.setTextColor(ContextCompat.getColor(mContext,R.color.colorButtonFontUnselected));
                    ((FiveDaysItem) holder).mTempButton.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorButtonUnselected));
                    //阻止重复点击
                    ((FiveDaysItem) holder).mHumiButton.setClickable(false);
                    ((FiveDaysItem) holder).mTempButton.setClickable(true);
                    //更新图表数据
                    ((FiveDaysItem) holder).mLineChart.setData(makeHumDataSet());
                    ((FiveDaysItem) holder).mLineChart.invalidate();
                }
            });

            //图表绘制 2017-1-21
            //取消显示刻度
            XAxis xAxis = ((FiveDaysItem) holder).mLineChart.getXAxis();
            xAxis.setEnabled(false);
            YAxis yAxis = ((FiveDaysItem) holder).mLineChart.getAxisLeft();
            YAxis yAxis1 = ((FiveDaysItem) holder).mLineChart.getAxisRight();
            yAxis.setEnabled(false);
            yAxis1.setEnabled(false);
            xAxis.setDrawGridLines(false);
            yAxis.setDrawGridLines(false);
            yAxis1.setDrawGridLines(false);
            Description description = ((FiveDaysItem) holder).mLineChart.getDescription();
            description.setEnabled(false);
            Legend legend = ((FiveDaysItem) holder).mLineChart.getLegend();
            legend.setEnabled(false);

            //添加温度数据
            ((FiveDaysItem) holder).mLineChart.setData(makeHumDataSet());
            ((FiveDaysItem) holder).mLineChart.invalidate();

            //关闭触摸功能
            ((FiveDaysItem) holder).mLineChart.setTouchEnabled(false);



        }
    }

    //构建温度折线图数据集
    private LineData makeTempDataSet(){
        ArrayList<Entry> mMaxValue = new ArrayList<>();
        ArrayList<Entry> mMinValue = new ArrayList<>();

        for (int i = 0; i < FORECAST_DAYS; i++){
            float mMaxPointValue = (float)mForecastModel.getResult().getDaily().getTemperature().get(i).getMax();
            float mMinPointValue = (float)mForecastModel.getResult().getDaily().getTemperature().get(i).getMin();
            mMaxValue.add(new Entry(i,mMaxPointValue));
            mMinValue.add(new Entry(i,mMinPointValue));
        }

        LineDataSet mMaxChartData = new LineDataSet(mMaxValue,"");
        LineDataSet mMinChartData = new LineDataSet(mMinValue,"");

        ArrayList<ILineDataSet> mTempChartData = new ArrayList<>();
        mTempChartData.add(mMaxChartData);
        mTempChartData.add(mMinChartData);

        //美化图表
        //设置颜色
        mMaxChartData.setColor(ContextCompat.getColor(mContext,R.color.colorChartMaxValue));
        mMaxChartData.setCircleColor(ContextCompat.getColor(mContext,R.color.colorChartMaxValue));
        mMaxChartData.setCircleColorHole(ContextCompat.getColor(mContext,R.color.colorChartMaxValue));
        mMinChartData.setColor(ContextCompat.getColor(mContext,R.color.colorChartMinValue));
        mMinChartData.setCircleColor(ContextCompat.getColor(mContext,R.color.colorChartMinValue));
        mMinChartData.setCircleColorHole(ContextCompat.getColor(mContext,R.color.colorChartMinValue));
        //加粗线条
        mMaxChartData.setLineWidth(3f);
        mMinChartData.setLineWidth(3f);
        //增大字体
        mMaxChartData.setValueTextSize(14);
        mMinChartData.setValueTextSize(14);
        //设置point半径
        mMaxChartData.setCircleRadius(4f);
        mMinChartData.setCircleRadius(4f);

        //设置数据显示格式
        IValueFormatter iValueFormatter = new IValueFormatter() {
            @Override
            public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
                return String.format("%d°",Math.round(value));
            }
        };
        mMaxChartData.setValueFormatter(iValueFormatter);
        mMinChartData.setValueFormatter(iValueFormatter);

        return new LineData(mTempChartData);
    }

    //构建湿度折线图数据集
    private LineData makeHumDataSet(){
        ArrayList<Entry> mMaxValue = new ArrayList<>();
        ArrayList<Entry> mMinValue = new ArrayList<>();

        for (int i = 0; i < FORECAST_DAYS; i++){
            float mMaxPointValue = (float)mForecastModel.getResult().getDaily().getHumidity().get(i).getMax();
            float mMinPointValue = (float)mForecastModel.getResult().getDaily().getHumidity().get(i).getMin();
            mMaxValue.add(new Entry(i,mMaxPointValue));
            mMinValue.add(new Entry(i,mMinPointValue));
        }

        LineDataSet mMaxChartData = new LineDataSet(mMaxValue,"");
        LineDataSet mMinChartData = new LineDataSet(mMinValue,"");

        ArrayList<ILineDataSet> mTempChartData = new ArrayList<>();
        mTempChartData.add(mMaxChartData);
        mTempChartData.add(mMinChartData);

        mMaxChartData.setColor(ContextCompat.getColor(mContext,R.color.colorChartMaxValue));
        mMaxChartData.setCircleColor(ContextCompat.getColor(mContext,R.color.colorChartMaxValue));
        mMaxChartData.setCircleColorHole(ContextCompat.getColor(mContext,R.color.colorChartMaxValue));
        mMinChartData.setColor(ContextCompat.getColor(mContext,R.color.colorChartMinValue));
        mMinChartData.setCircleColor(ContextCompat.getColor(mContext,R.color.colorChartMinValue));
        mMinChartData.setCircleColorHole(ContextCompat.getColor(mContext,R.color.colorChartMinValue));
        //加粗线条
        mMaxChartData.setLineWidth(3f);
        mMinChartData.setLineWidth(3f);
        //增大字体
        mMaxChartData.setValueTextSize(14);
        mMinChartData.setValueTextSize(14);
        //设置point半径
        mMaxChartData.setCircleRadius(4f);
        mMinChartData.setCircleRadius(4f);

        //设置数据显示格式
        IValueFormatter iValueFormatter = new IValueFormatter() {
            @Override
            public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
                return String.valueOf((int)(value * 100)) + "%";
            }
        };
        mMaxChartData.setValueFormatter(iValueFormatter);
        mMinChartData.setValueFormatter(iValueFormatter);

        return new LineData(mTempChartData);

    }

    //待定构建空气质量数据集

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == FIVE_DAYS_FORECAST){
            View v = LayoutInflater.from(mContext).inflate(R.layout.item_five_days,parent,false);
            FiveDaysItem mFiveDaysViewHolder = new FiveDaysItem(v);
            return mFiveDaysViewHolder;
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        switch(position){
            case 0:
                return FIVE_DAYS_FORECAST;
            default:
                return super.getItemViewType(position);
        }
    }

    @Override
    public int getItemCount() {
        //返回列表item个数 2017-1-20
        return 1;
    }

    //五天天气预报ViewHolder 2017-1-20
    public class FiveDaysItem extends RecyclerView.ViewHolder{

        //显示周几的文本
        @BindView(R.id.txt_one) public TextView mOneDayTxt;
        @BindView(R.id.txt_two) public TextView mTwoDayTxt;
        @BindView(R.id.txt_three) public TextView mThreeDayTxt;
        @BindView(R.id.txt_four) public TextView mFourDayTxt;
        @BindView(R.id.txt_five) public TextView mFiveDayTxt;

        @BindView(R.id.img_one) public ImageView mOneDayImg;
        @BindView(R.id.img_two) public ImageView mTwoDayImg;
        @BindView(R.id.img_three) public ImageView mThreeDayImg;
        @BindView(R.id.img_four) public ImageView mFourDayImg;
        @BindView(R.id.img_five) public ImageView mFiveDayImg;

        //图表
        @BindView(R.id.line_chart) LineChart mLineChart;

        //温度图表按钮
        @BindView(R.id.button_bar_temperature) Button mTempButton;
        //湿度图表按钮
        @BindView(R.id.button_bar_humidity) Button mHumiButton;

        public FiveDaysItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
