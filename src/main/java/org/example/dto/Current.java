package org.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Current {
    @SerializedName("last_updated_epoch")
    public double lastUpdatedEpoch;
    @SerializedName("last_updated")
    public String lastUpdated;
    @SerializedName("temp_c")
    public double tempC;
    @SerializedName("temp_f")
    public double tempF;
    @SerializedName("is_day")
    public double isDay;
    public Condition condition;
    @SerializedName("wind_mph")
    public double windMph;
    @SerializedName("wind_kph")
    public double windKph;
    @SerializedName("wind_degree")
    public double windDegree;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("pressure_mb")
    public double pressureMb;
    @SerializedName("pressure_in")
    public double pressureIn;
    @SerializedName("precip_mm")
    public double precipMm;
    @SerializedName("precip_in")
    public double precipIn;

    public double humidity;

    public double cloud;
    @SerializedName("feelslike_c")
    public double feelslikeC;
    @SerializedName("feelslike_f")
    public double feelslikeF;
    @SerializedName("vis_km")
    public double visKm;
    @SerializedName("vis_miles")
    public double visMiles;
    public double uv;
    @SerializedName("gust_mph")
    public double gustMph;
    @SerializedName("gust_kph")
    public double gustKph;
    @SerializedName("air_quality")
    public AirQuality airQuality;
}
