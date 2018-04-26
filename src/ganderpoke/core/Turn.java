package ganderpoke.core;

import java.util.ArrayList;
import java.util.List;

public class Turn {

        //List of players
    private List<Player> players = new ArrayList<>();
    
    //Get players
    public List<Player> getCurrentPlayer() {
       return this.players;
    }
    
    //Set players
    public void setCurrentPlayer(List<Player> players) {
        this.players = players;
    }
}
