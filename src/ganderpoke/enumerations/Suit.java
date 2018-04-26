package ganderpoke.enumerations;

public enum Suit {
    CLUBS("CLUBS", 100), DIAMONDS("DIAMONDS", 200), HEARTS("HEARTS", 300),
    SPADES("SPADES", 400), NOT_RELEVANT("NR", 500);

    private final String name;
    private final int numericValue;

    //Suit constructor
    Suit(String name, int numericValue) {
        this.name = name;
        this.numericValue = numericValue;
    }

    //Return numeric value of the suit
    public int getNumericValue() {
        return this.numericValue;
    }

    @Override
    public String toString() {
        return this.name;
    }

}