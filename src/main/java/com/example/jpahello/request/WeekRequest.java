package com.example.jpahello.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class WeekRequest {
    @NotNull
    private Integer weekOfMonth;

}
