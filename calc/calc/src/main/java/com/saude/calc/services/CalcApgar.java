package com.saude.calc.services;

import java.util.Arrays;
import java.util.List;

import com.saude.calc.models.Apgar;
import com.saude.calc.util.OptionsSwitch;

public class CalcApgar {

    public Integer Apgar(Apgar apgar) {

        List<Integer> valores = Arrays.asList(
                apgar.getId(),
                apgar.getAparencia(),
                apgar.getPulso(),
                apgar.getIrritacao(),
                apgar.getGestos(),
                apgar.getRespiracao());

        return OptionsSwitch.calculateScore(valores);

    }

}
