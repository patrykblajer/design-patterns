package chainofresponsibility;

import chainofresponsibility.children.Ania;
import chainofresponsibility.children.Antek;
import chainofresponsibility.children.Tomek;

class Main {
    public static void main(String[] args) {

        MotherRequest motherRequest = new MotherRequest(Shelf.LOW);
        Child ania = new Ania();
        Child tomek = new Tomek();
        Child antek = new Antek();

        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);

        tomek.processRequest(motherRequest);
    }
}