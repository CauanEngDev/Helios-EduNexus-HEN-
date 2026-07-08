package com.cauandev.heliosedunexus_backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.MapKey;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Entity
@NoArgsConstructor
public class Guardian extends Identificator implements Responsible{
    @OneToMany(mappedBy = "guardian")
    @MapKey(name = "id")
    private Map<UUID, Student> wards = new HashMap<>();

    @Override
    public Map<UUID, Student> getWards() { return new HashMap<>(wards); }

    @Override
    public void addWard(Student ward) { this.wards.put(ward.getId(), ward); }

    @Override
    public void removeWard(Student ward) { this.wards.remove(ward); }

    @Override
    public void switchWard(Student ward, Responsible newResponsible) {
        newResponsible.addWard(ward);
        removeWard(ward);
    }
}
