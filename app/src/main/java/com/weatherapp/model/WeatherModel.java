
package com.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class  WeatherModel{
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("current")
    @Expose
    private Current current;
    @SerializedName("forecast")
    @Expose
    private Forecast forecast;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }


    public class Location {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("region")
        @Expose
        private String region;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lon")
        @Expose
        private Double lon;
        @SerializedName("tz_id")
        @Expose
        private String tzId;
        @SerializedName("localtime_epoch")
        @Expose
        private Integer localtimeEpoch;
        @SerializedName("localtime")
        @Expose
        private String localtime;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public String getTzId() {
            return tzId;
        }

        public void setTzId(String tzId) {
            this.tzId = tzId;
        }

        public Integer getLocaltimeEpoch() {
            return localtimeEpoch;
        }

        public void setLocaltimeEpoch(Integer localtimeEpoch) {
            this.localtimeEpoch = localtimeEpoch;
        }

        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

    }

    public class Current {

        @SerializedName("last_updated_epoch")
        @Expose
        private Integer lastUpdatedEpoch;
        @SerializedName("last_updated")
        @Expose
        private String lastUpdated;
        @SerializedName("temp_c")
        @Expose
        private Double tempC;
        @SerializedName("temp_f")
        @Expose
        private Double tempF;
        @SerializedName("is_day")
        @Expose
        private Integer isDay;
        @SerializedName("condition")
        @Expose
        private Condition condition;
        @SerializedName("wind_mph")
        @Expose
        private Double windMph;
        @SerializedName("wind_kph")
        @Expose
        private Double windKph;
        @SerializedName("wind_degree")
        @Expose
        private Integer windDegree;
        @SerializedName("wind_dir")
        @Expose
        private String windDir;
        @SerializedName("pressure_mb")
        @Expose
        private Double pressureMb;
        @SerializedName("pressure_in")
        @Expose
        private Double pressureIn;
        @SerializedName("precip_mm")
        @Expose
        private Double precipMm;
        @SerializedName("precip_in")
        @Expose
        private Double precipIn;
        @SerializedName("humidity")
        @Expose
        private Integer humidity;
        @SerializedName("cloud")
        @Expose
        private Integer cloud;
        @SerializedName("feelslike_c")
        @Expose
        private Double feelslikeC;
        @SerializedName("feelslike_f")
        @Expose
        private Double feelslikeF;
        @SerializedName("vis_km")
        @Expose
        private Double visKm;
        @SerializedName("vis_miles")
        @Expose
        private Double visMiles;
        @SerializedName("uv")
        @Expose
        private Double uv;

        public Integer getLastUpdatedEpoch() {
            return lastUpdatedEpoch;
        }

        public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
            this.lastUpdatedEpoch = lastUpdatedEpoch;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public Double getTempC() {
            return tempC;
        }

        public void setTempC(Double tempC) {
            this.tempC = tempC;
        }

        public Double getTempF() {
            return tempF;
        }

        public void setTempF(Double tempF) {
            this.tempF = tempF;
        }

        public Integer getIsDay() {
            return isDay;
        }

        public void setIsDay(Integer isDay) {
            this.isDay = isDay;
        }

        public Condition getCondition() {
            return condition;
        }

        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        public Double getWindMph() {
            return windMph;
        }

        public void setWindMph(Double windMph) {
            this.windMph = windMph;
        }

        public Double getWindKph() {
            return windKph;
        }

        public void setWindKph(Double windKph) {
            this.windKph = windKph;
        }

        public Integer getWindDegree() {
            return windDegree;
        }

        public void setWindDegree(Integer windDegree) {
            this.windDegree = windDegree;
        }

        public String getWindDir() {
            return windDir;
        }

        public void setWindDir(String windDir) {
            this.windDir = windDir;
        }

        public Double getPressureMb() {
            return pressureMb;
        }

        public void setPressureMb(Double pressureMb) {
            this.pressureMb = pressureMb;
        }

        public Double getPressureIn() {
            return pressureIn;
        }

        public void setPressureIn(Double pressureIn) {
            this.pressureIn = pressureIn;
        }

        public Double getPrecipMm() {
            return precipMm;
        }

        public void setPrecipMm(Double precipMm) {
            this.precipMm = precipMm;
        }

        public Double getPrecipIn() {
            return precipIn;
        }

        public void setPrecipIn(Double precipIn) {
            this.precipIn = precipIn;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public Integer getCloud() {
            return cloud;
        }

        public void setCloud(Integer cloud) {
            this.cloud = cloud;
        }

        public Double getFeelslikeC() {
            return feelslikeC;
        }

        public void setFeelslikeC(Double feelslikeC) {
            this.feelslikeC = feelslikeC;
        }

        public Double getFeelslikeF() {
            return feelslikeF;
        }

        public void setFeelslikeF(Double feelslikeF) {
            this.feelslikeF = feelslikeF;
        }

        public Double getVisKm() {
            return visKm;
        }

        public void setVisKm(Double visKm) {
            this.visKm = visKm;
        }

        public Double getVisMiles() {
            return visMiles;
        }

        public void setVisMiles(Double visMiles) {
            this.visMiles = visMiles;
        }

        public Double getUv() {
            return uv;
        }

        public void setUv(Double uv) {
            this.uv = uv;
        }

        public class Condition {

            @SerializedName("text")
            @Expose
            private String text;
            @SerializedName("icon")
            @Expose
            private String icon;
            @SerializedName("code")
            @Expose
            private Integer code;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Integer getCode() {
                return code;
            }

            public void setCode(Integer code) {
                this.code = code;
            }

        }

    }

    public class Forecast {

        @SerializedName("forecastday")
        @Expose
        private List<Forecastday> forecastday = null;

        public List<Forecastday> getForecastday() {
            return forecastday;
        }

        public void setForecastday(List<Forecastday> forecastday) {
            this.forecastday = forecastday;
        }

        public class Forecastday {

            @SerializedName("date")
            @Expose
            private String date;
            @SerializedName("date_epoch")
            @Expose
            private Integer dateEpoch;
            @SerializedName("day")
            @Expose
            private Day day;
            @SerializedName("astro")
            @Expose
            private Astro astro;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public Integer getDateEpoch() {
                return dateEpoch;
            }

            public void setDateEpoch(Integer dateEpoch) {
                this.dateEpoch = dateEpoch;
            }

            public Day getDay() {
                return day;
            }

            public void setDay(Day day) {
                this.day = day;
            }

            public Astro getAstro() {
                return astro;
            }

            public void setAstro(Astro astro) {
                this.astro = astro;
            }


            public class Day {

                @SerializedName("maxtemp_c")
                @Expose
                private Double maxtempC;
                @SerializedName("maxtemp_f")
                @Expose
                private Double maxtempF;
                @SerializedName("mintemp_c")
                @Expose
                private Double mintempC;
                @SerializedName("mintemp_f")
                @Expose
                private Double mintempF;
                @SerializedName("avgtemp_c")
                @Expose
                private Double avgtempC;
                @SerializedName("avgtemp_f")
                @Expose
                private Double avgtempF;
                @SerializedName("maxwind_mph")
                @Expose
                private Double maxwindMph;
                @SerializedName("maxwind_kph")
                @Expose
                private Double maxwindKph;
                @SerializedName("totalprecip_mm")
                @Expose
                private Double totalprecipMm;
                @SerializedName("totalprecip_in")
                @Expose
                private Double totalprecipIn;
                @SerializedName("avgvis_km")
                @Expose
                private Double avgvisKm;
                @SerializedName("avgvis_miles")
                @Expose
                private Double avgvisMiles;
                @SerializedName("avghumidity")
                @Expose
                private Double avghumidity;
                @SerializedName("condition")
                @Expose
                private Condition_ condition;
                @SerializedName("uv")
                @Expose
                private Double uv;

                public Double getMaxtempC() {
                    return maxtempC;
                }

                public void setMaxtempC(Double maxtempC) {
                    this.maxtempC = maxtempC;
                }

                public Double getMaxtempF() {
                    return maxtempF;
                }

                public void setMaxtempF(Double maxtempF) {
                    this.maxtempF = maxtempF;
                }

                public Double getMintempC() {
                    return mintempC;
                }

                public void setMintempC(Double mintempC) {
                    this.mintempC = mintempC;
                }

                public Double getMintempF() {
                    return mintempF;
                }

                public void setMintempF(Double mintempF) {
                    this.mintempF = mintempF;
                }

                public Double getAvgtempC() {
                    return avgtempC;
                }

                public void setAvgtempC(Double avgtempC) {
                    this.avgtempC = avgtempC;
                }

                public Double getAvgtempF() {
                    return avgtempF;
                }

                public void setAvgtempF(Double avgtempF) {
                    this.avgtempF = avgtempF;
                }

                public Double getMaxwindMph() {
                    return maxwindMph;
                }

                public void setMaxwindMph(Double maxwindMph) {
                    this.maxwindMph = maxwindMph;
                }

                public Double getMaxwindKph() {
                    return maxwindKph;
                }

                public void setMaxwindKph(Double maxwindKph) {
                    this.maxwindKph = maxwindKph;
                }

                public Double getTotalprecipMm() {
                    return totalprecipMm;
                }

                public void setTotalprecipMm(Double totalprecipMm) {
                    this.totalprecipMm = totalprecipMm;
                }

                public Double getTotalprecipIn() {
                    return totalprecipIn;
                }

                public void setTotalprecipIn(Double totalprecipIn) {
                    this.totalprecipIn = totalprecipIn;
                }

                public Double getAvgvisKm() {
                    return avgvisKm;
                }

                public void setAvgvisKm(Double avgvisKm) {
                    this.avgvisKm = avgvisKm;
                }

                public Double getAvgvisMiles() {
                    return avgvisMiles;
                }

                public void setAvgvisMiles(Double avgvisMiles) {
                    this.avgvisMiles = avgvisMiles;
                }

                public Double getAvghumidity() {
                    return avghumidity;
                }

                public void setAvghumidity(Double avghumidity) {
                    this.avghumidity = avghumidity;
                }

                public Condition_ getCondition() {
                    return condition;
                }

                public void setCondition(Condition_ condition) {
                    this.condition = condition;
                }

                public Double getUv() {
                    return uv;
                }

                public void setUv(Double uv) {
                    this.uv = uv;
                }

                public class Condition_ {

                    @SerializedName("text")
                    @Expose
                    private String text;
                    @SerializedName("icon")
                    @Expose
                    private String icon;
                    @SerializedName("code")
                    @Expose
                    private Integer code;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public Integer getCode() {
                        return code;
                    }

                    public void setCode(Integer code) {
                        this.code = code;
                    }

                }

            }

            public class Astro {

                @SerializedName("sunrise")
                @Expose
                private String sunrise;
                @SerializedName("sunset")
                @Expose
                private String sunset;
                @SerializedName("moonrise")
                @Expose
                private String moonrise;
                @SerializedName("moonset")
                @Expose
                private String moonset;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getMoonrise() {
                    return moonrise;
                }

                public void setMoonrise(String moonrise) {
                    this.moonrise = moonrise;
                }

                public String getMoonset() {
                    return moonset;
                }

                public void setMoonset(String moonset) {
                    this.moonset = moonset;
                }

            }

        }


    }


}


