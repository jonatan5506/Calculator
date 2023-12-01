package com.saude.calc.util;

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
