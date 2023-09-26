package com.example.test_task_java_backend_cft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Intervals")
@Getter
@Setter
public class Interval {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String intervalStart;

    @Column(nullable = false)
    private String intervalEnd;
}
