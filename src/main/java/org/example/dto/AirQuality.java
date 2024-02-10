package org.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AirQuality {
    public double co;
    public double no2;
    public double o3;
    public double so2;
    public double pm2_5;
    public double pm10;
    @SerializedName("us-epa-index")
    public double usEpaIndex;
    @SerializedName("gb-defra-index")
    public double gbDefraIndex;
}
