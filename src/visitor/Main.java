package visitor;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("cat", 10);
        Person person = new Person("Jan", "Kowalski", true);
        Shipment shipment = new Shipment("PL", "440011", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(i -> i.accept(priceTransportVisitor));
        transportableList.forEach(i -> i.accept(nameTransportVisitor));
    }
}