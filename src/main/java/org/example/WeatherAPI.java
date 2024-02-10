package org.example;

import org.example.dto.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.WeakHashMap;

public interface WeatherAPI {
    @GET("/v1/current.json")
    Call<WeatherResponse> current(@Query("key") String key, @Query("q") String query);
}
