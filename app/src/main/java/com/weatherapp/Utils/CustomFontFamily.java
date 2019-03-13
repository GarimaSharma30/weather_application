package com.weatherapp.Utils;

import android.graphics.Typeface;
import android.util.Log;

import com.weatherapp.WeatherApp;

import java.util.HashMap;

public class CustomFontFamily
{
    static CustomFontFamily customFontFamily;
    HashMap<String,String> fontMap=new HashMap<>();
    public static CustomFontFamily getInstance()
    {
        if(customFontFamily==null)
            customFontFamily=new CustomFontFamily();
        return customFontFamily;
    }
    public void addFont(String alias, String fontName){
        fontMap.put(alias,fontName);
    }
    public Typeface getFont(String alias)
    {
        String fontFilename = fontMap.get(alias);
        if (fontFilename == null) {
            Log.e("", "Font not available with name " + alias);
            return null;
        }
        else
        {
            Typeface typeface = Typeface.createFromAsset(WeatherApp.getInstance().getAssets(), "fonts/" + fontFilename);
            return typeface;
        }
    }
}