package templatemethod;

public class MyDay extends WeekDay {

    @Override
    protected int goToWork(TransportType transportType) {
        return switch (transportType) {
            case CAR -> 20;
            case BIKE -> 45;
            case TRAM -> 10;
        };
    }

    @Override
    protected void work() {
        System.out.println("Nothing todo");
    }

    @Override
    protected void summary(int time) {
        System.out.println("Przed biurkiem spędziłem " + time + " minut");
    }
}