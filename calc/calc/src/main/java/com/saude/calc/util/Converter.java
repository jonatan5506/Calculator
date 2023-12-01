package com.saude.calc.util;

import java.text.DecimalFormat;

public class Converter {
    // FORMATAR DOUBLE COM DUAS CASAS DECIMAIS
    public String doubleFormat(Double num) {

        DecimalFormat df = new DecimalFormat("0.00");
        String resultFormat = df.format(num);
        return resultFormat;
    }
}
