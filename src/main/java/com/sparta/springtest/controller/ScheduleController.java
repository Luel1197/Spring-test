package com.sparta.springtest.controller;


import com.sparta.springtest.dto.ScheduleRequestDto;
import com.sparta.springtest.dto.ScheduleResponseDto;
import com.sparta.springtest.schedule.Schedule;


import java.util.HashMap;

import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ScheduleController {

    private final Map<Long, Schedule> scheduleList = new HashMap<>();

    @PostMapping("/schedules")
    @ResponseBody
    public ScheduleResponseDto createschedule(@RequestBody ScheduleRequestDto scheduleRequesDto) {

        //RequestDto - >Entity
        Schedule schedule = new Schedule(scheduleRequesDto);

        schedule.





    }




