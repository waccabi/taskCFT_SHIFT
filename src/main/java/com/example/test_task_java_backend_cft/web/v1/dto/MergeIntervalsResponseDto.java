package com.example.test_task_java_backend_cft.web.v1.dto;

import lombok.Data;

import java.util.List;

@Data
public class MergeIntervalsResponseDto {
    private List<IntervalDto> intervals;
}
