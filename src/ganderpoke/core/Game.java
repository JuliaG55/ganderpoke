package ganderpoke.core;

import java.util.ArrayList;
import java.util.List;

public class Game {

    
    //List of players
    private List<Player> players = new ArrayList<>();
    
    //Get players
    public List<Player> getPlayer() {
       return this.players;
    }
    
    //Set players
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    //************************************************************************
    
    //Square instance
    private Square square;
    
    //Get square
    public Square getSquare() {
        return square;
    }
    
    //Set square
    public void setSquare(Square square) {
        this.square = square;
    }
    
        //************************************************************************

    private void PlayRounds() {
        
    }
    
    private void PlayTurns() {
        
    }
    
}
