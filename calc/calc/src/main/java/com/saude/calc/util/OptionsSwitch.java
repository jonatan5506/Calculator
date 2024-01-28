package com.saude.calc.util;

import java.util.List;

public class OptionsSwitch {

    public static int calculateScore(List<Integer> appearances) {
        int score = 0;

        for (Integer appearance : appearances) {
            switch (appearance) {
                case 0:
                    score += 0;
                    break;
                case 1:
                    score += 1;
                    break;
                case 2:
                    score += 2;
                    break;
                case 3:
                    score += 3;
                    break;
                case 4:
                    score += 4;
                    break;
                case 5:
                    score += 5;
                    break;
                case 6:
                    score += 6;
                    break;
                case 7:
                    score += 7;
                    break;
                case 8:
                    score += 8;
                    break;
                case 9:
                    score += 9;
                    break;
                case 10:
                    score += 10;
                    break;
                
                default:
                    break;
            }
        }

        return score;
    }
}
