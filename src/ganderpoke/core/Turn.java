package ganderpoke.core;

public class Turn {

    private boolean onTurn;
    
        // Check whether the player is currently on turn
    public boolean isOnTurn() {
        return this.onTurn;
    }

    // Set the player to be on turn
    public void setOnTurn(boolean onTurn) {
        this.onTurn = onTurn;
    }
}
