package com.example.jpahello.response;

import com.example.jpahello.entity.Weather;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {
    private long id;
    private int precipitation;
    private int temperature;

    public WeatherResponse(Weather weather){
        id = weather.getId();
        precipitation = weather.getPrecipitation();
        temperature = weather.getTemperature();
    }
}
