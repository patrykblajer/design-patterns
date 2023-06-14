package state.state;

import java.util.Random;

public class CoinInsertedState implements State {
    
    static final private Random random  = new Random();
    
    public void insertTheCoin(GameMachine context) {
        System.out.println("Moneta znajduję się już w automacie.");        
    }

    public void pushTheLever(GameMachine context) {
        System.out.println("Trwa losowanie...");
        int result = random.nextInt(99);
        if(result<20) {
            System.out.println("Wygrana! Odbierz swoją nagrodę");
            context.state = new WinState();
        } else {
            System.out.println("Przegrana. Może następnym razem się uda?");
            context.state = new NoCoinState();
        }
    }

    public void collectTheWinnings(GameMachine context) {
        System.out.println("Pociągnij dźwignie by sprawdzić swoje szczęście.");
    }

    public void currentState(GameMachine context) {
        System.out.println("Aktualny stan - WRZUCONO MONETĘ");
    }
}