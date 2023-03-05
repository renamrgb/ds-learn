package com.devsuperior.dslearnbds.entities;

import lombok.Data;

import javax.persistence.Column;
import java.time.Instant;

@Data
public class Task extends Lesson {
    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;
}
