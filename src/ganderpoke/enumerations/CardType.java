package ganderpoke.enumerations;

public enum CardType {
    NORMAL_CARD("NORMAL_CARD"), JOKER("JOKER");

    private final String name;

    //Rank constructor
    CardType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
