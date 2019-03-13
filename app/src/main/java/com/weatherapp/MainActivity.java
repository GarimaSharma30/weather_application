package com.weatherapp;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.weatherapp.Utils.AppUtils;
import com.weatherapp.databinding.ActivityMainBinding;
import com.weatherapp.model.WeatherModel;
import com.weatherapp.rest.IApiInterface;
import com.weatherapp.rest.Params;
import com.weatherapp.rest.RestClient;
import com.weatherapp.viewmodel.HomeViewModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements HomeViewModel.HomeClickListener {
    ActivityMainBinding activityMainBinding;
    LinearLayoutManager layoutManager;
    Animation aniRotateClk, aniSlideUp;
    Adapter adapter;
    HomeViewModel homeViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        startAnimation();

        layoutManager = new LinearLayoutManager(this);
        activityMainBinding.rvWeather.setLayoutManager(layoutManager);

        homeViewModel = new HomeViewModel(this, this);
        activityMainBinding.setViewmodel(homeViewModel);

        getCurrentWeather();
        getForecast();

    }

    private void startAnimation() {
        aniRotateClk = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise_anim);
        aniSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up_anim);
        activityMainBinding.ivLoader.startAnimation(aniRotateClk);
    }


    private void getForecast() {
        if (AppUtils.isInternetOn(this)) {
            IApiInterface iApiInterface = RestClient.provideInterface();
            final Call<WeatherModel> forecast = iApiInterface.forecast(Params.KEY_VALUE, "Bangalore", 4);

            forecast.enqueue(new Callback<WeatherModel>() {
                @Override
                public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {

                    if (response.isSuccessful()) {
                        homeViewModel.forecastdayArrayList.clear();
                        homeViewModel.forecastdayArrayList.addAll(response.body().getForecast().getForecastday());
                        adapter = new Adapter(MainActivity.this, MainActivity.this.homeViewModel);
                        activityMainBinding.rvWeather.setAdapter(adapter);
                    } else {
                        showErrorScreen();
                    }
                }

                @Override
                public void onFailure(Call<WeatherModel> call, Throwable t) {
                    showErrorScreen();
                }
            });
        } else {
            showNoInternetScreen();
        }
    }

    private void getCurrentWeather() {
        if (AppUtils.isInternetOn(this)) {
            IApiInterface iApiInterface = RestClient.provideInterface();
            Call<WeatherModel> currentTemp = iApiInterface.currentTemp(Params.KEY_VALUE, "Bangalore");

            currentTemp.enqueue(new Callback<WeatherModel>() {
                @Override
                public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {


                    if (response.isSuccessful()) {
                        getForecast();
                        homeViewModel.currentTemp.set(response.body().getCurrent().getTempC().toString());
                    } else {
                        showErrorScreen();
                    }
                    showResponseScreen();

                }

                @Override
                public void onFailure(Call<WeatherModel> call, Throwable t) {
                    showErrorScreen();
                }
            });
        } else {
            showNoInternetScreen();
        }
    }

    private void showNoInternetScreen() {
        activityMainBinding.groupAfterResp.setVisibility(View.GONE);
        activityMainBinding.groupError.setVisibility(View.VISIBLE);
        activityMainBinding.bgClMain.setBackgroundColor(getResources().getColor(R.color.colorBgRed));
        activityMainBinding.tvErrorMsg.setText(getResources().getString(R.string.check_your_internet));
    }

    private void showResponseScreen() {
        aniRotateClk.reset();
        activityMainBinding.bgClMain.setBackgroundColor(getResources().getColor(R.color.colorBgMain));
        activityMainBinding.groupError.setVisibility(View.GONE);
        activityMainBinding.ivLoader.clearAnimation();
        activityMainBinding.groupAfterResp.setVisibility(View.VISIBLE);
        activityMainBinding.ivLoader.setVisibility(View.GONE);
        activityMainBinding.rvWeather.startAnimation(aniSlideUp);
    }

    private void showErrorScreen() {
        activityMainBinding.bgClMain.setBackgroundColor(getResources().getColor(R.color.colorBgRed));
        activityMainBinding.groupError.setVisibility(View.VISIBLE);
        activityMainBinding.ivLoader.clearAnimation();
        activityMainBinding.groupAfterResp.setVisibility(View.GONE);
    }

    @Override
    public String getWeekday(String yourDate) {
        Date date = null;
        String goal = "";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = format.parse(yourDate);
            SimpleDateFormat outFormat = new SimpleDateFormat("EEEE");
            goal = outFormat.format(date);
            System.out.println(goal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return goal;
    }

    @Override
    public void retry() {
        Log.e("RETRY", "RETRY");
        startAnimation();
        getCurrentWeather();
        getForecast();
    }
}



