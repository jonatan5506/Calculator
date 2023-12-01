package com.saude.calc.services;

import com.saude.calc.models.AnionGapSerico;
import com.saude.calc.models.AscDubois;
import com.saude.calc.util.Converter;

public class Calc {
    
    Converter converter = new Converter();
    public String calcAnionGapSerico(AnionGapSerico serico) {

        Double math = serico.getNa() - 
            (serico.getCl() + serico.getHco3());
        
        String result = converter.doubleFormat(math);
        return "Ânion Gap " + result + " mmol/L";
    }

    public String ascDubois(AscDubois asc){

        Double math = 0.007184 * Math.pow(asc.getHeight(), 0.725) * Math.pow(asc.getWeight(), 0.425);

        String result = converter.doubleFormat(math);
        return "Superfície Corporal " + result + " m²";
    }
}