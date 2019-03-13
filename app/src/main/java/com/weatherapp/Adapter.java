package com.weatherapp;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.weatherapp.databinding.ItemWeatherForecastBinding;
import com.weatherapp.model.WeatherModel;
import com.weatherapp.viewmodel.HomeViewModel;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.BindingHolder> {

    private ArrayList<WeatherModel.Forecast.Forecastday> forecastdayArrayList;
    private Context mContext;
    HomeViewModel homeViewModel;

    public Adapter(Context mContext,  HomeViewModel homeViewModel) {
        this.forecastdayArrayList = forecastdayArrayList;
        this.mContext = mContext;
        this.homeViewModel = homeViewModel;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemWeatherForecastBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_weather_forecast, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        ItemWeatherForecastBinding binding = holder.binding;
        binding.tvWeekday.setText(""+homeViewModel.getWeekday(homeViewModel.forecastdayArrayList.get(position).getDate()));
        binding.tvWeekdayTemp.setText(homeViewModel.forecastdayArrayList.get(position).getDay().getAvgtempC().toString() + " C");
    }

    @Override
    public int getItemCount() {
        Log.e("SIZE",""+ homeViewModel.forecastdayArrayList.size());
        return homeViewModel.forecastdayArrayList.size();
    }


    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ItemWeatherForecastBinding binding;

        public BindingHolder(ItemWeatherForecastBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}