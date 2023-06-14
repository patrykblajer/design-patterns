package state.state;

public interface State {
    void insertTheCoin(GameMachine context);
    void pushTheLever(GameMachine context);
    void collectTheWinnings(GameMachine context);
    void currentState(GameMachine context);
}