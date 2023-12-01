package com.saude.calc.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnionGapSerico {

    private Double na;
    private Double cl;
    private Double hco3;

    public AnionGapSerico(Double na, Double cl, Double hco3) {
        this.na = na;
        this.cl = cl;
        this.hco3 = hco3;
    }
}
