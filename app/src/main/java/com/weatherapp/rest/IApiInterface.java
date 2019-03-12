package com.weatherapp.rest;

import com.weatherapp.model.WeatherModel;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IApiInterface {

    @POST(URLS.CURRENT)
    Call<ResponseBody> currentTemp(@Query(Params.KEY) String key, @Query("q") String place);

    @POST(URLS.FORECAST)
    Call<WeatherModel> forecast(@Query(Params.KEY) String key, @Query("q") String place);


}