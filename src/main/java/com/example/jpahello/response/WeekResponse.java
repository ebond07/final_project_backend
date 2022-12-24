package com.example.jpahello.response;

import com.example.jpahello.entity.Week;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeekResponse {
    private long id;
    private int weekOfMonth;
    private DayResponse day;
    public WeekResponse(Week week){
        id = week.getId();
        weekOfMonth = week.getWeekOfMonth();
    }
}
