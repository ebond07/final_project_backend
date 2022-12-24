package com.example.jpahello.entity;

import com.example.jpahello.request.WeatherRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "weathers")
@AllArgsConstructor
public class Weather {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "temperature", nullable = false)
    private int temperature;
    @Column(name = "precipitation", nullable = false)
    private int precipitation;

    public Weather(WeatherRequest weatherRequest){
        temperature = weatherRequest.getTemperature();
        precipitation = weatherRequest.getPrecipitation();
    }
}
