package com.saude.calc.services;

import com.saude.calc.models.AscDubois;
import com.saude.calc.util.Converter;

public class CalcAscDubois {

    public String ascDubois(AscDubois asc){

        Converter converter = new Converter();

        Double math = 0.007184 * Math.pow(asc.getHeight(), 0.725) * Math.pow(asc.getWeight(), 0.425);

        String result = converter.doubleFormat(math);
        return "Superfície Corporal " + result + " m²";
    }
}
