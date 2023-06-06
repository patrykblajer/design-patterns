package chainofresponsibility.children;

import chainofresponsibility.Child;
import chainofresponsibility.MotherRequest;
import chainofresponsibility.Shelf;

public class Antek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjął słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}