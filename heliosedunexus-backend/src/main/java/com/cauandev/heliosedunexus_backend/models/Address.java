package com.cauandev.heliosedunexus_backend.models;

import jakarta.persistence.Embeddable;

@Embeddable
public record Address(String street, String neighbourhood, String city, String zipCode, String state) {
    public Address() {
        this(null, null, null, null, null);
    }
}