package state;

class GameMachine {

    State state;

    public GameMachine() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheLever() {
        state.pushTheLever(this);
    }

    public void collectTheWinnings() {
        state.collectTheWinnings(this);
    }

    public void currentState() {
        state.currentState(this);
    }
}