package visitor;

class PriceTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Cena za transport zwierzęcia: " + animal.getWeight() * 0.2 + " PLN");
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println("Cena za kilometr dla osoby: " + price + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price *= 3;
        }
        System.out.printf("Cena za transport przesyłki %d PLN%n", price);
    }
}