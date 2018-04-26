package ganderpoke.enumerations;

public enum Rank {
    
    FIVE("5", 1), SIX("6", 2), SEVEN("7", 3), EIGHT("8", 4), NINE("9", 5),
    TEN("10", 6), JACK("JACK", 7), QUEEN("QUEEN", 8), KING("KING", 9), ACE("ACE", 10);

    private final String name;
    private final int numericValue;

    //Rank constructor
    Rank(String name, int numericValue) {
        this.name = name;
        this.numericValue = numericValue;
    }

    //Return numeric value of the rank
    public int getNumericValue() {
        return this.numericValue;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
