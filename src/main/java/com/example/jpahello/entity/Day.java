package com.example.jpahello.entity;

import com.example.jpahello.request.DayRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "days")
public class Day {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "week_id")
    private Week week;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private Weather weather;

    public Day(DayRequest dayRequest){
        name = dayRequest.getName();
        weather = new Weather(dayRequest.getWeather());
    }
}
