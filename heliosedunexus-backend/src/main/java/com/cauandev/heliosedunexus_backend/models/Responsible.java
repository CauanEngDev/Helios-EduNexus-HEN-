package com.cauandev.heliosedunexus_backend.models;

import java.util.Map;
import java.util.UUID;

public interface Responsible {
    Map<UUID, Student> getWards();
    void addWard(Student ward);
    void removeWard(Student ward);
    void switchWard(Student ward, Responsible newResponsible);
}
