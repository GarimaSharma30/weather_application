package com.weatherapp;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.weatherapp.databinding.ItemWeatherForecastBinding;

public class Adapter extends RecyclerView.Adapter<Adapter.BindingHolder> {

//    private List<Article> mArticles;
    private Context mContext;

    public Adapter( Context mContext) {
//        this.mArticles = mArticles;
        this.mContext = mContext;
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
//        binding.setAvm(new ArticleViewModel(mArticles.get(position), mContext));
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ItemWeatherForecastBinding binding;

        public BindingHolder(ItemWeatherForecastBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}