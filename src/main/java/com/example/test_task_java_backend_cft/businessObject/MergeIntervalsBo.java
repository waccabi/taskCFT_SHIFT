package com.example.test_task_java_backend_cft.businessObject;

import lombok.Data;

import java.util.List;

@Data
public class MergeIntervalsBo {
    private List<IntervalBo> intervals;
    private String kind;
}
