package ganderpoke.core;

import java.util.ArrayList;
import java.util.List;

public class Square {
    
    //List of players
    private List<Square> square = new ArrayList<>();
    
    //Get players
    public List<Square> getSquare() {
       return this.square;
    }
    
    //Set players
    public void setSquare(List<Square> square) {
        this.square = square;
    }
    
    
}
