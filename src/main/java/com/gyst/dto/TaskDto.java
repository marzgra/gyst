package com.gyst.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
    private Long taskId;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private String goalName;

}
