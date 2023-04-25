package builder;

class FlightLeg {
    private String from;
    private String to;
    private boolean delayed;
    private double price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.price = flightLegBuilder.price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private double price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLegBuilder price(double price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if (price == 0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new FlightLeg(this);
        }
    }
}