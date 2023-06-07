package templatemethod;

class Main {
    public static void main(String[] args) {
        WeekDay day = new MyDay();
        day.everyDayIsExactlyTheSame(TransportType.CAR);
    }
}