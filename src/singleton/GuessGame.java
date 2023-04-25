package singleton;

import java.util.Random;
import java.util.Scanner;

class GuessGame {


    private static GuessGame instance = new GuessGame();
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private int score = 0;

    private GuessGame() {
    }

    public void play() {
        int rounds = 10;
        while (rounds > 0) {
            int luckyNumber = random.nextInt(0, 10);
            System.out.println(luckyNumber);
            System.out.println("Podaj liczbę 0 - 9");
            if (scanner.nextInt() == luckyNumber) {
                System.out.println("Trafiłeś prawidłową liczbę!");
                score++;
            } else {
                System.out.println("Pudło!");
            }
            rounds--;
        }
        System.out.printf("Trafiłeś %d \n", score);
    }

    public int getScore() {
        return score;
    }

    public static GuessGame getInstance() {
        return instance;
    }
}