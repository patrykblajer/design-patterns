package state;
class Main {

    public static void main(String[] args) {

        GameMachine gameMachine = new GameMachine();

        gameMachine.insertTheCoin();
        gameMachine.currentState();
        gameMachine.pushTheLever();
        gameMachine.currentState();
        gameMachine.collectTheWinnings();
        gameMachine.currentState();
    }
}