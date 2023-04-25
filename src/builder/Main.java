package builder;

class Main {
    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();

        System.out.println(leg);

        FlightLeg leg2 = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").build();
        System.out.println(leg2);
    }
}