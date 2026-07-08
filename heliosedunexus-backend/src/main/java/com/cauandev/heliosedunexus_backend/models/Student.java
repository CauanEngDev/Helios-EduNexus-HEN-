package com.cauandev.heliosedunexus_backend.models;

import com.cauandev.heliosedunexus_backend.enums.SchoolGrade;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
public class Student extends Identificator {
    private int schoolYear;
    private String email;
    private SchoolGrade gradeLevel;
}
