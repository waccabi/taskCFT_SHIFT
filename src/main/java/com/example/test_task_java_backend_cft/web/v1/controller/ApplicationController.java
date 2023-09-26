package com.example.test_task_java_backend_cft.web.v1.controller;

import com.example.test_task_java_backend_cft.service.IntervalProcessing;
import com.example.test_task_java_backend_cft.web.v1.dto.IntervalDto;
import com.example.test_task_java_backend_cft.web.v1.dto.MergeIntervalsRequestDto;
import com.example.test_task_java_backend_cft.web.v1.dto.MergeIntervalsResponseDto;
import com.example.test_task_java_backend_cft.web.v1.mapper.DtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/intervals")
@RequiredArgsConstructor
public class ApplicationController {

    private final IntervalProcessing intervalProcessing;
    private  DtoMapper mapper;

    @PostMapping("/merge")
    @ResponseStatus(HttpStatus.OK)
    public MergeIntervalsResponseDto merge(@RequestParam String kind, @RequestBody MergeIntervalsRequestDto requestDto) {
        return mapper.toMergeIntervalsResponseDto(
                intervalProcessing.merge(mapper.toMergeIntervalsBo(requestDto, kind))
        );
    }

    @GetMapping("/min")
    @ResponseStatus(HttpStatus.FOUND)
    public IntervalDto min(@RequestParam String kind, @RequestBody IntervalDto requestDto) {
        return mapper.toIntervalDto(
                intervalProcessing.min(mapper.toMinIntervalBo(requestDto, kind))
        );
    }
}
