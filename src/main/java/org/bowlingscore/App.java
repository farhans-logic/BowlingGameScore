package org.bowlingscore;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        BowlingScore bowlingScore = new BowlingScore();

        bowlingScore.calculateScore("X X X X X X X X X X X X");

        System.out.println(bowlingScore.calculateScore("X X X X X X X X X X X X"));
    }
}
