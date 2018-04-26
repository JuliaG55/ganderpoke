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
    
    // Check if there are unexposed cards on the square
    public boolean hasFaceDownCards() {
        for (Card card : this.getCards()) {
            if (card.getStatus() == Status.FaceDown) {
                return true;
            }
        }

        return false;
    }
}
