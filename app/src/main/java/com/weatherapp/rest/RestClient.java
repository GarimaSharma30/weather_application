package com.weatherapp.rest;

import com.weatherapp.WeatherApp;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    static Retrofit retrofit;
    private static WeatherApp mInstance = null;
    private static OkHttpClient mOkHttpClient;

    public int i = 0;

    public RestClient(int i) {
        i = this.i;
    }

    /**
     * This method will create a singleton object of class
     *
     * @return Retrofit object to initiate API call
     */
    private static Retrofit provideRestClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URLS.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(WeatherApp.getInstance().getOkHttpClient())
                    .build();
        }

        return retrofit;
    }

    public static IApiInterface provideInterface() {
        return provideRestClient().create(IApiInterface.class);
    }


}

