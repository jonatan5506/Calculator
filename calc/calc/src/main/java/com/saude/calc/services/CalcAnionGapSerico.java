package com.saude.calc.services;

import com.saude.calc.models.AnionGapSerico;
import com.saude.calc.util.Converter;

public class CalcAnionGapSerico {

    Converter converter = new Converter();

    public String calcAnionGapSerico(AnionGapSerico serico){
        Double math = serico.getNa() - 
            (serico.getCl() + serico.getHco3());
        
        String result = converter.doubleFormat(math);
        return "Ânion Gap " + result + " mmol/L";
    }
}
