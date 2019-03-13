package com.weatherapp;

import android.app.Application;
import android.content.Context;

import com.weatherapp.Utils.CustomFontFamily;
import com.weatherapp.rest.OkClientFactory;

import okhttp3.OkHttpClient;


public class WeatherApp extends Application {

    public static Context context;
    public static WeatherApp mInstance;
    private static OkHttpClient mOkHttpClient;
    public CustomFontFamily customFontFamily;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
        context = getApplicationContext();
        mOkHttpClient = OkClientFactory.provideOkHttpClient(this);

        WeatherApp.context = this;
        customFontFamily = CustomFontFamily.getInstance();
        // add your custom fonts here with your own custom name.
        customFontFamily.addFont("roboto_black", "roboto.black.ttf");
        customFontFamily.addFont("roboto_regular", "roboto.regular.ttf");
        customFontFamily.addFont("roboto_thin", "roboto.thin.ttf");

    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }

    public static WeatherApp getInstance() {
        return mInstance;
    }

}
