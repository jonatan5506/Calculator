package com.saude.calc.services;

import com.saude.calc.models.Abcd2;
import com.saude.calc.util.CalcScore;

public class CalcAbcd2 {

    public String Abcd2(Abcd2 abcd){

        CalcScore score = new CalcScore();
        score.countScore(abcd.getAge(), abcd.getBloodPressure(), abcd.getDiabetes());
        int resultScore = score.getScore();
        String resultFormat = "";//Iniciei sem valor para não dar erro.

        //ClinicalDiscourse && ClinicalWeakness
        if (abcd.getClinicalDiscourse().equalsIgnoreCase("S") && abcd.getClinicalWeakness().equalsIgnoreCase("N")) {
            resultScore += 1;
        }
        else if (abcd.getClinicalDiscourse().equalsIgnoreCase("N") && abcd.getClinicalWeakness().equalsIgnoreCase("S")) {
            resultScore += 1;
        }
        else if (abcd.getClinicalDiscourse().equalsIgnoreCase("S") && abcd.getClinicalWeakness().equalsIgnoreCase("S")) {
            resultScore += 2;
        }
        else {
            resultScore += 0;
        }

        //DURATION
        if (abcd.getDuration() < 10) {
            resultScore += 0;
        }
        else if (abcd.getDuration() >= 10 && abcd.getDuration() < 60) {
            resultScore += 1;
        }
        else {
            resultScore += 2;
        }

        //Escore Final
        if (resultScore <= 3) {
            resultFormat = "Escore = " + resultScore + "\n" + "Baixo Risco.";
        }
        else if (resultScore > 3 && resultScore <= 5) {
            resultFormat = "Escore = " + resultScore + "\n" + "Médio Risco.";
        }
        else {
            resultFormat = "Escore = " + resultScore + "\n" + "Alto Risco.";
        }

        return resultFormat;
        
    }
}
