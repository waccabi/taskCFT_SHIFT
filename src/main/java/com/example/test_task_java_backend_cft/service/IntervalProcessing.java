package com.example.test_task_java_backend_cft.service;

import com.example.test_task_java_backend_cft.businessObject.IntervalBo;
import com.example.test_task_java_backend_cft.businessObject.MergeIntervalsBo;
import com.example.test_task_java_backend_cft.businessObject.MinIntervalBo;
import com.example.test_task_java_backend_cft.service.db.IntervalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IntervalProcessing {
    private final IntervalService intervalService;

    public IntervalBo min(MinIntervalBo minInterval) {

        //тут пишем всю логику
        //получаем данные из бд
        //как то с ними работаем
        //если нужно то лезем в БД через БД слой
        //intervalService.save();
        //intervalService.find();
        //intervalService.update();
        // List<IntervalBo> all = intervalService.findAll();

        return null;
    }

    public MergeIntervalsBo merge(MergeIntervalsBo mergeIntervals) {
        //тут пишем всю логику
        //получаем данные из бд
        //как то с ними работаем
        //если нужно то лезем в БД через БД слой
        //intervalService.save();
        //intervalService.find();
        //intervalService.update();
            List<IntervalBo> intervals = mergeIntervals.getIntervals();
            intervals.sort(Comparator.comparing(IntervalBo::getIntervalStart));
            intervalService.saveAll(intervals);

        return null;
    }

}
