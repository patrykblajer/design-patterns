package state;

class WinState implements State {

    public void insertTheCoin(GameMachine context) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    public void pushTheLever(GameMachine context) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    public void collectTheWinnings(GameMachine context) {
        System.out.println("Zabrano monety. Gratulacje.");
        context.state = new NoCoinState();
    }

    public void currentState(GameMachine context) {
        System.out.println("Aktualny stan - WYGRANA");
    }
}