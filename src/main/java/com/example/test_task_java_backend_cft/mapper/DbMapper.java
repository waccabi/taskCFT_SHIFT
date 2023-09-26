package com.example.test_task_java_backend_cft.mapper;

import com.example.test_task_java_backend_cft.businessObject.IntervalBo;
import com.example.test_task_java_backend_cft.entity.Interval;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")

public interface DbMapper {

    IntervalBo toIntervalBo(Interval interval);
    List<IntervalBo> toIntervalBos(List<Interval> intervals);

    Interval toInterval(IntervalBo intervalBo);
    List<Interval> toIntervals(List<IntervalBo> intervalBos);
}
