package com.example.jpahello.service;

import com.example.jpahello.entity.Day;
import com.example.jpahello.exception.ResourceNotFoundException;
import com.example.jpahello.repository.DayRepository;
import com.example.jpahello.request.DayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DayService {
    @Autowired
    private DayRepository dayRepository;

    public Day getDay(long day_id){
        Day day = dayRepository.findById(day_id)
                .orElseThrow(()-> new ResourceNotFoundException("day id not found"));
        return day;
    }
    public Day updateDay(long day_id, DayRequest dayRequest){
        if(dayRepository.existsById(day_id)){
            Day dayToBeUpdated = new Day(dayRequest);
            dayToBeUpdated.setId(day_id);
            return dayRepository.save(dayToBeUpdated);
        }
        else{
            throw new ResourceNotFoundException("day id not found");
        }
    }
    public void deleteDay(long day_id){
        if(dayRepository.existsById(day_id)){
            dayRepository.deleteById(day_id);
        }
        else{
            throw new ResourceNotFoundException("day id not found");
        }
    }
}
