package com.saude.calc.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apgar {
    private Integer id;
    private Integer aparencia;
    private Integer pulso;
    private Integer irritacao;
    private Integer gestos;
    private Integer respiracao;

    public Apgar(){
        
    }
}
