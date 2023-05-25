package flyweight;

abstract class ChessPiece {
    private final String name;
    private final String numberPosition;
    private final String letterPosition;
    private final Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;

        if (color.equalsIgnoreCase("black")) {
            this.color = ColorRepository.getBlack();
        } else {
            this.color = ColorRepository.getWhite();
        }
    }

    public ChessPiece(String name, String numberPosition, String letterPosition, Color color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getNumberPosition() {
        return numberPosition;
    }

    public String getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }
}