package com.weatherapp.rest;

import android.app.Application;
import android.support.annotation.NonNull;

import com.weatherapp.BuildConfig;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 *
 */
public class OkClientFactory {
    // Cache size for the OkHttpClient

    /**
     * This method returns the object of OkHttpClient which is used to cache data returned from the API call.
     *
     * @param app is the application context
     * @return OkHttpClient object
     */
    @NonNull
    public static OkHttpClient provideOkHttpClient(Application app) {
        // Install an HTTP cache in the application cache directory.
        File cacheDir = new File(app.getCacheDir(), "http");

        OkHttpClient.Builder builder = new OkHttpClient.Builder().cache(null).readTimeout(10, TimeUnit.MINUTES).connectTimeout(10, TimeUnit.MINUTES);

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.interceptors().add(loggingInterceptor);
        }
        return builder.build();
    }

}
