package com.cauandev.heliosedunexus_backend.enums;


public interface Convertable<T> {
    String getDescription();
    T fromDescription(String Description);
}
