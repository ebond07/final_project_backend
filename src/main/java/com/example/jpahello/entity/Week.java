package com.example.jpahello.entity;

import com.example.jpahello.request.WeekRequest;
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
@Table(name = "weeks")
@NoArgsConstructor
@AllArgsConstructor
public class Week {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "weekOfMonth", nullable = false)
    private int weekOfMonth;
    public Week(WeekRequest weekRequest){
        weekOfMonth = weekRequest.getWeekOfMonth();
    }
}
