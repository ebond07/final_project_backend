package com.example.jpahello.controller;

import com.example.jpahello.entity.Day;
import com.example.jpahello.entity.Week;
import com.example.jpahello.request.DayRequest;
import com.example.jpahello.request.WeekRequest;
import com.example.jpahello.response.DayResponse;
import com.example.jpahello.response.WeekResponse;
import com.example.jpahello.service.WeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/weeks")
public class WeekController {
    @Autowired
    WeekService weekService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{week_id}/days")
    public DayResponse addDay(@PathVariable long week_id, @Valid @RequestBody DayRequest dayRequest){
        return new DayResponse(weekService.addDay(week_id, dayRequest));
    }
    @GetMapping("/{week_id}/days")
    public List<DayResponse> getAllDays(@PathVariable long week_id){
        List<Day> days = weekService.getAllDays(week_id);
        List<DayResponse> dayResponses = new ArrayList<>();
        for(int i=0; i < days.size(); i++){
            dayResponses.add(new DayResponse(days.get(i)));
        }
        return dayResponses;
    }
    @DeleteMapping("/{week_id}/days")
    public void deleteAllDays(@PathVariable long week_id){
        weekService.deleteAllDays(week_id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public WeekResponse addWeek(@Valid @RequestBody WeekRequest weekRequest){
        Week savedWeek = weekService.addWeek(weekRequest);
        return new WeekResponse(savedWeek);
    }
    @PutMapping("/{id}")
    public WeekResponse updateWeek(@PathVariable long id, @Valid @RequestBody WeekRequest weekRequest){
        Week updatedWeek = weekService.updateWeek(id, weekRequest);
        return new WeekResponse(updatedWeek);
    }
    @DeleteMapping("/{id}")
    public void deleteWeek(@PathVariable long id){
        weekService.deleteWeek(id);
    }
}
