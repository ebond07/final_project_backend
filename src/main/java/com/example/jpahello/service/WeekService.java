package com.example.jpahello.service;

import com.example.jpahello.entity.Day;
import com.example.jpahello.entity.Week;
import com.example.jpahello.exception.ResourceNotFoundException;
import com.example.jpahello.repository.DayRepository;
import com.example.jpahello.repository.WeekRepository;
import com.example.jpahello.request.DayRequest;
import com.example.jpahello.request.WeekRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeekService {
    @Autowired
    WeekRepository weekRepository;
    @Autowired
    DayRepository dayRepository;

    public Day addDay(long week_id, DayRequest dayRequest){
        Week week = weekRepository.findById(week_id).orElseThrow(
                ()->new ResourceNotFoundException("week id is not found"));
        Day dayToBeSaved = new Day(dayRequest);
        dayToBeSaved.setWeek(week);

        return dayRepository.save(dayToBeSaved);
    }

    public List<Day> getAllDays(long week_id){
        return dayRepository.findAllByWeekId(week_id);
    }
    public void deleteAllDays(long week_id){
        if(weekRepository.existsById(week_id)){
            dayRepository.deleteAllByWeekId(week_id);
        }
        else{
            throw new ResourceNotFoundException("Week id not found");
        }
    }
    public Week addWeek(WeekRequest weekRequest){
        Week week = new Week(weekRequest);
        return weekRepository.save(week);
    }
    public Week updateWeek(long week_id, WeekRequest weekRequest){
        weekRepository.findById(week_id)
                .orElseThrow(()-> new ResourceNotFoundException("week id not found"));
        Week weekToBeUpdated = new Week(weekRequest);
        weekToBeUpdated.setId(week_id);
        return weekRepository.save(weekToBeUpdated);
    }
    public void deleteWeek(long week_id){
        if(weekRepository.existsById(week_id)){
            weekRepository.deleteById(week_id);
        }
        else{
            throw new ResourceNotFoundException("week id not found");
        }
    }
}
