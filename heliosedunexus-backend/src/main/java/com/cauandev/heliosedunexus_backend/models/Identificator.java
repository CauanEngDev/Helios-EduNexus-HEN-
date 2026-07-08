package com.cauandev.heliosedunexus_backend.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
@AllArgsConstructor @NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(of = "id")
public abstract class Identificator {
    @Id @Setter(AccessLevel.NONE)
    protected UUID id = UUID.randomUUID();

    protected String name;
    protected LocalDate birth;
    protected String phone;

    @Embedded
    protected Address address;
}
