package ganderpoke.core;

import java.util.ArrayList;
import java.util.List;

public class Turn {

    // Instantiate game
    private List<Player> players = new ArrayList<>();
    Player player1 = new Player(new Hand());
    Player player2 = new Player(new Hand());

    
    //Get players
    public List<Player> getCurrentPlayer() {
       return this.players;
    }
    
    //Set players
    public void setCurrentPlayer(List<Player> players) {
        this.players = players;
    }
}
