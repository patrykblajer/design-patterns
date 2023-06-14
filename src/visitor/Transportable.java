package visitor;

interface Transportable {
    void accept(TransportVisitor transportVisitor);
}