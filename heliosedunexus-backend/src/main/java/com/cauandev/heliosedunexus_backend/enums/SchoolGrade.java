package com.cauandev.heliosedunexus_backend.enums;

import com.cauandev.heliosedunexus_backend.exceptions.InvalidArgumentException;

public enum SchoolGrade implements Convertable<SchoolGrade> {
    KINDERGARTEN("Pré-Escolar"),
    FIRST_GRADE("Fundamental I"),
    SECOND_GRADE("Fundamental II"),
    HIGH_SCHOOL("Colegial");

    private final String description;

    SchoolGrade(String description) { this.description = description; }

    @Override
    public String getDescription() { return description; }

    @Override
    public SchoolGrade fromDescription(String description) {
        for (SchoolGrade schoolGrade : values())
            if (schoolGrade.description.equals(description)) return schoolGrade;

        throw new InvalidArgumentException("Nível Escolar Inválido: " + description);
    }
}
