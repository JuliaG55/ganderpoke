package ganderpoke.enumerations;

public enum Rank {
    
    FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"),
    JACK("JACK"), QUEEN("QUEEN"), KING("KING"), ACE("ACE");

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
