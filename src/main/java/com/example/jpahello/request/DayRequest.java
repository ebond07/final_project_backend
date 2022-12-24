package com.example.jpahello.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DayRequest {
    @NotBlank
    private String name;
    @NotNull
    @Valid
    private WeatherRequest weather;
}
