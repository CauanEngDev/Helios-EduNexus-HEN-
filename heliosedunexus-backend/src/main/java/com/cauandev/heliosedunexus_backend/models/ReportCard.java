package com.cauandev.heliosedunexus_backend.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class ReportCard {
    private int numExams;
    private Map<String, LocalDate> period;
    private int year;

    @Setter(AccessLevel.NONE)
    private List<Exam> exams;

    public ReportCard() { }

    public ReportCard(int numExams, LocalDate init, LocalDate finish, int year) {
        this.numExams = numExams;

        this.period = new HashMap<>();
        this.period.put("Inicío da Matéria", init);
        this.period.put("Fim da Matéria", finish);

        this.year = year;

        this.exams = new ArrayList<>();
    }

    public void addExam(Exam newExam) {
        if (exams.size() < numExams) exams.add(newExam);
    }

    public Exam findExam(int index) {
        return exams.get(index-1);
    }

    public void removeExam(int index) {
        exams.remove(index);
    }

    public void addExamInPosition(Exam newExam, int index) {
        exams.add(index, newExam);
    }

    public void editExam(int index, Exam editedExam) {
        removeExam(index);
        addExamInPosition(editedExam, index);
    }
}
