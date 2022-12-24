package com.example.jpahello.response;

import com.example.jpahello.entity.Day;
import com.example.jpahello.entity.Weather;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DayResponse {
    private long id;
    private String name;
    private WeatherResponse weather;
    public DayResponse(Day day){
        id = day.getId();
        name = day.getName();
        weather = new WeatherResponse(day.getWeather());
    }
}
