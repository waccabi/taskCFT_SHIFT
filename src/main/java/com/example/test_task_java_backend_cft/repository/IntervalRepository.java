package com.example.test_task_java_backend_cft.repository;

import com.example.test_task_java_backend_cft.entity.Interval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntervalRepository extends JpaRepository<Interval, Long> {
 //   List<Interval> findAllByIntervalStart(String intervalStart);

  //  @Query("" +
  //          "SELECT ")
    //          Interval abc(long id);


}
