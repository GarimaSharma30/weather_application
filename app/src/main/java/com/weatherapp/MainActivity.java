package com.weatherapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.weatherapp.databinding.ActivityMainBinding;
import com.weatherapp.model.WeatherModel;
import com.weatherapp.rest.IApiInterface;
import com.weatherapp.rest.RestClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    LinearLayoutManager layoutManager;
    String key = "f799c328901e48ccaad145430190903";
    final Handler handler = new Handler();
    Animation aniRotateClk,aniSlideUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        aniRotateClk = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise_anim);
        aniSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up_anim);
        activityMainBinding.ivLoader.startAnimation(aniRotateClk);

        layoutManager = new LinearLayoutManager(this);
        activityMainBinding.rvWeather.setLayoutManager(layoutManager);



        getCurrentWeather();

    }

    private void getCurrentWeather() {

        IApiInterface iApiInterface = RestClient.provideInterface();
        Call<ResponseBody> currentTemp = iApiInterface.currentTemp(key, "Bangalore");

        currentTemp.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {


                if (response.isSuccessful()) {
                    Log.e("RESP->", "" + response.body());

//                    activityMainBinding.groupAfterResp.setVisibility(View.VISIBLE);
                    try {
                        String jsonStr = new String(response.body().bytes());
                        JSONObject jsonObject = new JSONObject(jsonStr);
                        JSONObject current = jsonObject.getJSONObject("current");
                        current.getString("temp_c");

                        activityMainBinding.setCurrentTemperature(current.getString("temp_c"));

                    } catch (JSONException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                } else {
                    //error screen
                }
                aniRotateClk.reset();
                activityMainBinding.ivLoader.clearAnimation();
                activityMainBinding.groupAfterResp.setVisibility(View.VISIBLE);
                activityMainBinding.ivLoader.setVisibility(View.GONE);

                activityMainBinding.rvWeather.startAnimation(aniSlideUp);
                Adapter adapter = new Adapter(MainActivity.this);
                activityMainBinding.rvWeather.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}



