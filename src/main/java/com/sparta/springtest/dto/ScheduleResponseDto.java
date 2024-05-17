package com.sparta.springtest.dto;

import com.sparta.springtest.schedule.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private String title;
    private String planner;
    private String content;
    private Long pw;
    private String writeDay;

    public ScheduleResponseDto(Schedule schedule) {
    }
}
