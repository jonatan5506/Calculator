package com.saude.calc.services;

public class CalcScore {
    
    private int score= 0;

    public CalcScore() {
        
    }
   
    public void countScore(String param) {

        if (param.equalsIgnoreCase(ConstantsText.SIM.getValor())) {
            this.score += 1;
        }
    }

    public int getScore() {
        return score;
    }

}
