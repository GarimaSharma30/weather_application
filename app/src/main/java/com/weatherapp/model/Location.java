package com.weatherapp.model;

public class Location {
    private String name;
    private String region;
    private String country;
    private float lat;
    private float lon;
    private String tz_id;
    private float localtime_epoch;
    private String localtime;


    // Getter Methods

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    public String getTz_id() {
        return tz_id;
    }

    public float getLocaltime_epoch() {
        return localtime_epoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public void setTz_id(String tz_id) {
        this.tz_id = tz_id;
    }

    public void setLocaltime_epoch(float localtime_epoch) {
        this.localtime_epoch = localtime_epoch;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }
}
