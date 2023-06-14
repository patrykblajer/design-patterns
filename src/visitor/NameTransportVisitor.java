package visitor;

class NameTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Typ zwierzęcia: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Imię i nazwisko: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Prefix: " + shipment.getPrefix() + " numer seryjny:" + shipment.getSerialNumber());
    }
}