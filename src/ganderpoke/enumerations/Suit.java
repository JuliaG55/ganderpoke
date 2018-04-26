package ganderpoke.enumerations;

public enum Suit {
    CLUBS("CLUBS"), DIAMONDS("DIAMONDS"), HEARTS("HEARTS"), SPADES("SPADES"),
    NOT_RELEVANT("NOT_RELEVANT");

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