package flyweight;

class Main {
    public static void main(String[] args) {


        ChessPiece blackPawn = new BlackPawn("Czarny Pionek", "7", "a");
        ChessPiece whitePawn = new WhitePawn("Biały Pionek", "2", "a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");

        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());
    }
}