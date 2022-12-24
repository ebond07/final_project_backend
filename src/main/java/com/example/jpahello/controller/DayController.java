package com.example.jpahello.controller;

import com.example.jpahello.request.DayRequest;
import com.example.jpahello.response.DayResponse;
import com.example.jpahello.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/days")
public class DayController {
    @Autowired
    DayService dayService;
    @GetMapping("/{dayId}")
    public DayResponse getDay(@PathVariable long dayId){
        return new DayResponse(dayService.getDay(dayId));
    }
    @PutMapping("/{dayId}")
    public DayResponse updateDay(@PathVariable long dayId, @Valid @RequestBody DayRequest dayRequest){
        return new DayResponse(dayService.updateDay(dayId, dayRequest));
    }
    @DeleteMapping("/{dayId}")
    public void deleteDay(@PathVariable long dayId){
        dayService.deleteDay(dayId);
    }
}
