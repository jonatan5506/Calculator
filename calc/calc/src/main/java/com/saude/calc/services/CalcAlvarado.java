package com.saude.calc.services;

import com.saude.calc.models.Alvarado;
import com.saude.calc.util.CalcScore;

public class CalcAlvarado {

    public String Alvarado(Alvarado alvarado){

        CalcScore score = new CalcScore();
        score.countScore(alvarado.getAnorexia(), alvarado.getNauseasVomito(), alvarado.getDormigratoria(), alvarado.getDefesaNoQid() + 1, alvarado.getDescompressapNoQid(), alvarado.getTemp(), alvarado.getLeuco() + 1, alvarado.getDevioAEsquerda());
        int resultScore = score.getScore();
        String resultFormat = "";

        //Escore Final
        if (resultScore <= 3) {
            resultFormat = "Escore = " + resultScore + "\n" + "Apendicite Improvável";
        }
        else if (resultScore > 3 && resultScore <= 7) {
            resultFormat = "Escore = " + resultScore + "\n" + "Apendicite Provável";
        }
        else {
            resultFormat = "Escore = " + resultScore + "\n" + "Apendicite  MUito Provável";
        }

        return resultFormat;
    }
}
