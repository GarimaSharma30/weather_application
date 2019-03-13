package com.weatherapp.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;

import com.weatherapp.model.WeatherModel;

import java.util.ArrayList;

public class HomeViewModel {

    HomeClickListener homeClickListener;
    Context context;
    public ArrayList<WeatherModel.Forecast.Forecastday> forecastdayArrayList = new ArrayList<>();
    public ObservableField<String> currentTemp = new ObservableField<>();
    public ObservableField<String> countryCode = new ObservableField<>();

    public HomeViewModel(Context context, HomeClickListener homeClickListener) {
        this.homeClickListener = homeClickListener;
        this.context = context;
    }

    public String getWeekday(String date) {
        return homeClickListener.getWeekday(date);
    }

    public void retry() {
        homeClickListener.retry();
    }

    public interface HomeClickListener {
        public String getWeekday(String date);

        public void retry();
    }


}
