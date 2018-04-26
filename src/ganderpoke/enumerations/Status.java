package ganderpoke.enumerations;

public enum Status {
    FaceUp("FaceUp"), FaceDown("FaceDown"); 
    
    private final String name;

    //Rank constructor
    Status(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }

}