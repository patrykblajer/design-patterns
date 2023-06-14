package visitor;

interface TransportVisitor {

    void visit(Animal animal);

    void visit(Person person);

    void visit(Shipment shipment);
}