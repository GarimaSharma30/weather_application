package com.weatherapp;

import android.app.Application;
import android.content.Context;

import com.weatherapp.rest.OkClientFactory;

import okhttp3.OkHttpClient;



public class WeatherApp extends Application {

    private static Context context;
    private static WeatherApp mInstance;
    private static OkHttpClient mOkHttpClient;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
        context = getApplicationContext();
        mOkHttpClient = OkClientFactory.provideOkHttpClient(this);



    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }

    public static WeatherApp getInstance() {
        return mInstance;
    }

}
