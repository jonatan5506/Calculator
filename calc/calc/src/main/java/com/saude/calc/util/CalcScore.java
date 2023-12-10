package com.saude.calc.util;

public class CalcScore {

    private int score = 0;

    public CalcScore() {

    }

   public void countScore(String... params) {

        for (String param : params) {
            if (param.equalsIgnoreCase(ConstantsText.SIM.getValor())) {
                this.score += 1;
            }
            else if (param.equalsIgnoreCase(ConstantsText.SIM.getValor() + 1)){
                this.score += 2;
            }
        }
    }
    

    public int getScore() {
        return score;
    }

}
