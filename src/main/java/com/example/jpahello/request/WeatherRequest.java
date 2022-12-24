package com.example.jpahello.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class WeatherRequest {
    @NotNull
    private Integer precipitation;
    @NotNull
    private Integer temperature;
}
