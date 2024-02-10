package org.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Location {
    public String name;
    public String region;
    public String country;
    public double lat;
    public double lon;
    @SerializedName("tz_id")
    public String tzId;
    @SerializedName("localtime_epoch")
    public double localtimeEpoch;
    public String localtime;
}
