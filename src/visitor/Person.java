package visitor;

class Person implements Transportable {
    private String firstName;
    private String lastName;
    private boolean isRegularCustomer;

    public Person(String firstName, String lastName, boolean isRegularCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRegularCustomer = isRegularCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }
}