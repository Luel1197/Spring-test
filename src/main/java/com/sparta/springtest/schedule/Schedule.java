package com.sparta.springtest.schedule;


import com.sparta.springtest.dto.ScheduleRequestDto;
import com.sparta.springtest.dto.ScheduleResponseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Schedule {
    private String title;
    private String planner;
    private String content;
    private Long pw;
    private String writeDay;

    public Schedule(ScheduleRequestDto scheduleRequesDto) {
        this.title = scheduleRequesDto.getTitle();
        this.planner = scheduleRequesDto.getPlanner();
        this.content = scheduleRequesDto.getContent();
        this.writeDay = scheduleRequesDto.getWriteDay();
        this.pw = scheduleRequesDto.getPw();
    }

    public void update(ScheduleResponseDto scheduleRequesDto) {
        this.title = scheduleRequesDto.getTitle();
        this.planner = scheduleRequesDto.getPlanner();
        this.content = scheduleRequesDto.getContent();
        this.writeDay = scheduleRequesDto.getWriteDay();
    }
}
