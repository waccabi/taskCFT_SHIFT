package com.example.test_task_java_backend_cft.web.v1.mapper;

import com.example.test_task_java_backend_cft.businessObject.IntervalBo;
import com.example.test_task_java_backend_cft.businessObject.MergeIntervalsBo;
import com.example.test_task_java_backend_cft.businessObject.MinIntervalBo;
import com.example.test_task_java_backend_cft.web.v1.dto.IntervalDto;
import com.example.test_task_java_backend_cft.web.v1.dto.MergeIntervalsRequestDto;
import com.example.test_task_java_backend_cft.web.v1.dto.MergeIntervalsResponseDto;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public interface DtoMapper {

    MergeIntervalsBo toMergeIntervalsBo(MergeIntervalsRequestDto mergeIntervalsRequestDto, String kind);

    MergeIntervalsResponseDto toMergeIntervalsResponseDto(MergeIntervalsBo mergeIntervalsBo);

    IntervalDto toIntervalDto(IntervalBo intervalBo);

    MinIntervalBo toMinIntervalBo(IntervalDto intervalDto, String kind);
}
