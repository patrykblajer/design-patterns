package singleton;

class Main {

    public static void main(String[] args) {

        GuessGame guessGame = GuessGame.getInstance();
        GuessGame anotherGameReference = GuessGame.getInstance();


        guessGame.play();

        int score = guessGame.getScore();

        if(guessGame == anotherGameReference  ) {
            System.out.println("Singleton!");
            if(score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
}