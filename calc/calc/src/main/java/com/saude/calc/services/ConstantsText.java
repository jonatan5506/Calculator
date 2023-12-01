package com.saude.calc.services;

public enum ConstantsText {
    
    SIM("S");

    private final String valor;

    ConstantsText(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

