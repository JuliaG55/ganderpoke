package ganderpoke;

import ganderpoke.core.Hand;
import ganderpoke.core.Player;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // Instantiate game
        List<Player> players = new ArrayList<>();
        Player player1 = new Player(new Hand());
        Player player2 = new Player(new Hand());

        players.add(player1);
        players.add(player2);

    }

    
}
