package org.bowlingscore;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class BowlingScore {

    int[] bowls = new int[21];
    int currentBowl = 0;

    int totalScore = 0;

    private int score = 0;
    private final String STRIKE = "x";
    private final String SPARE = "/";
    private final String MISS = "-";

    private final int MAX_PINS = 10;
    private final int MAX_FRAMES = 10;

    boolean isStrike(String scoreValue) {
        return scoreValue.equalsIgnoreCase(STRIKE);
    }

    ;

    boolean isSpare(String scoreValue) {
        return scoreValue.equalsIgnoreCase(SPARE);
    }

    ;

    boolean isMiss(String scoreValue) {

        return scoreValue.equalsIgnoreCase(SPARE);
    }

    ;

    int calculateScore(String scoreInput) {

        String[] scores = scoreInput.split(" ");
//        Arrays.stream(gameScores.split(" ")).forEach(s -> {
//            scores[scores.length - 1] = s.split(s, );
//        });

        System.out.println((scores.length));

        for (int scoresIndex = 0; scoresIndex < (scores.length - MAX_FRAMES); scoresIndex++) {
            System.out.println(("value : " + scoresIndex + " " + scoresIndex));

            if (isStrike(scores[scoresIndex])) {
                System.out.println((scoresIndex + 1 < scores.length && isStrike(scores[scoresIndex + 1])));
                System.out.println(("value : " + scoresIndex + " " + scoresIndex));
                totalScore += MAX_PINS +
                        ((scoresIndex + 1 < scores.length && isStrike(scores[scoresIndex + 1])) ?
                                ((scoresIndex + 2 < scores.length && isStrike(scores[scoresIndex + 2])) ?
                                        (MAX_PINS * 2) :
                                        MAX_PINS + scoreStringToNumber(scores[scoresIndex + 2].split("")[0]))
                                : 0);
            }

        }


//        Arrays.stream(scoreEntries).forEach(s -> {
//            String[] frameScores = s.split("");
//            if (isStrike(frameScores[0]) || isSpare(frameScores[1])) {
//                score += MAX_PINS;
//            } else {
//                score += Integer.parseInt(frameScores[0] + frameScores[1]);
//            }
//        });

        return totalScore;
    }


    int scoreStringToNumber(String value) {

        AtomicInteger totalValue = new AtomicInteger();

        Arrays.stream(value.split("")).forEach(v -> {
            if (!isMiss(v) && !isSpare(v)) {
                totalValue.addAndGet(Integer.parseInt(v));
            }
        });

        return totalValue.intValue();
    }

}
