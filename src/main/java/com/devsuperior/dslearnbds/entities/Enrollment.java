package com.devsuperior.dslearnbds.entities;


import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Data
@Entity
@Table(name = "tb_enrollment")
public class Enrollment {

    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;
    @ManyToMany(mappedBy = "enrollmentsDone")
    private Set<Lesson> lessonsDone;
}
