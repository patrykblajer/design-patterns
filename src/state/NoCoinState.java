package state;

class NoCoinState implements State {

    public void insertTheCoin(GameMachine context) {
        System.out.println("Wrzucono monetę.");
        context.state = new CoinInsertedState();
    }

    public void pushTheLever(GameMachine context) {
        System.out.println("Wrzuć monetę by zagrać.");
    }

    public void collectTheWinnings(GameMachine context) {
        System.out.println("Wrzuć monetę by dać sobie szansę na wygraną.");
    }

    public void currentState(GameMachine context) {
        System.out.println("Aktualny stan - BRAK MONETY");
    }
}