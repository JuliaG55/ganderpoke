package ganderpoke.enumerations;

public enum Rank {
    
    FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

    private final String name;

    //Rank constructor
    Rank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
