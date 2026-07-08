package com.cauandev.heliosedunexus_backend.models;

import jakarta.persistence.Embedded;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Embedded
@AllArgsConstructor @NoArgsConstructor
@Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
public class Exam() {
    private String examName; // Ex.: Prova de Matemática Aplicada
    @Setter(AccessLevel.NONE)
    private BigInteger index; // Número da prova. Ex.: Segunda Prova da Matéria
    @Setter(AccessLevel.NONE)
    private BigDecimal grade; // Nota da Prova
    private LocalDate date; // Data da Prova
}
