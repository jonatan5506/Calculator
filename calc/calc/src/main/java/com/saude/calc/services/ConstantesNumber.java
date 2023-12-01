package com.saude.calc.services;

public enum ConstantesNumber {
    PI(3.14159);

    private final Double valor;

    ConstantesNumber(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
