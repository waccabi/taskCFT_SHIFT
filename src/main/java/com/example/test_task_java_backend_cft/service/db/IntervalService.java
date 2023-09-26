package com.example.test_task_java_backend_cft.service.db;

import com.example.test_task_java_backend_cft.businessObject.IntervalBo;
import com.example.test_task_java_backend_cft.entity.Interval;
import com.example.test_task_java_backend_cft.mapper.DbMapper;
import com.example.test_task_java_backend_cft.repository.IntervalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IntervalService {
    private final IntervalRepository repository;
    @Autowired
    private final DbMapper mapper;

    //тут только код чтобы лазить в базу
    //никакой бизнес логики быть не должно
    //то есть у тебя тут ТОЛЬКО CREATE/READ/UPDATE/DELETE ну всякие запросы в бд и всё
    public List<IntervalBo> findAll(){
         return mapper.toIntervalBos(repository.findAll());
        }

    public void saveAll(List<IntervalBo> intervals){
        repository.saveAll(mapper.toIntervals(intervals));
    }

}
