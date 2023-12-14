package com.saude.calc.services;

import com.saude.calc.util.CalcScore;
import com.saude.calc.models.Abcd3;

public class CalcAbcd3 {
    // Age, BloodPressure,Diabetes, getClinicalFeatures1 ,abcd.getClinicalFeatures2
    public String Abcd3(Abcd3 abcd) {

        CalcScore score = new CalcScore();
        score.countScore(abcd.getAge(), abcd.getBloodPressure(), abcd.getDiabetes()/*, abcd.getDoubleAit() + 1,
                abcd.getStenosis() + 1, abcd.getHyperintensity() + 1*/);
        int resultScore = score.getScore();
        String resultFormat = "";// iniciei sem valor para não dar erro.

        //ClinicalDiscourse && ClinicalWeakness
        if (abcd.getClinicalDiscourse().equalsIgnoreCase("S") && abcd.getClinicalWeakness().equalsIgnoreCase("N")) {
            resultScore += 1;
        }
        else if (abcd.getClinicalDiscourse().equalsIgnoreCase("N") && abcd.getClinicalWeakness().equalsIgnoreCase("S")) {
            resultScore += 2;
        }
        else if (abcd.getClinicalDiscourse().equalsIgnoreCase("S") && abcd.getClinicalWeakness().equalsIgnoreCase("S")) {
            resultScore += 2;
        }
        else {
            resultScore += 0;
        }

        //doubleAit
        if (abcd.getDoubleAit().equalsIgnoreCase("S")) {
            resultScore += 2;
        }

        //stenosis
        if (abcd.getStenosis().equalsIgnoreCase("S")) {
            resultScore += 2;
        }

        //hyperintensity
        if (abcd.getHyperintensity().equalsIgnoreCase("S")) {
            resultScore += 2;
        }

        // DURATION
        if (abcd.getDuration() < 10) {
            resultScore += 0;
        } else if (abcd.getDuration() >= 10 && abcd.getDuration() < 60) {
            resultScore += 1;
        } else {
            resultScore += 2;
        }

        //Escore Final
        if (resultScore <= 3) {
            resultFormat = "Escore = " + resultScore + "\n" + "Baixo Risco de AVC";
        }
        else if (resultScore > 3 && resultScore <= 7) {
            resultFormat = "Escore = " + resultScore + "\n" + "Risco Médio de AVC";
        }
        else {
            resultFormat = "Escore = " + resultScore + "\n" + "Alto Risco de AVC.";
        }

        return resultFormat;
    }

}
