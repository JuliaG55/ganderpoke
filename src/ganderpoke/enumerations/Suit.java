package ganderpoke.enumerations;

public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES, NOT_RELEVANT;

    private final String name;

    //Suit constructor
    Suit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}