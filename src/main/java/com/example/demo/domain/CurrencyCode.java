package com.example.demo.domain;

public enum CurrencyCode {
    PEN("SOLES"),
    USD("DÓLARES");

    private String description;

    CurrencyCode(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
