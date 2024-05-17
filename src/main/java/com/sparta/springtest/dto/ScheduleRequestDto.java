package com.sparta.springtest.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private String title;
    private String planner;
    private String content;
    private Long pw;
    private String writeDay;

}
