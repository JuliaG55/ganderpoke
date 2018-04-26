package ganderpoke.core;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public Game() {
    }
    
    //************************************************************************
    
    //Number of rounds instance 
    public NumberOfRounds numOfRounds;

    private static class NumberOfRounds {

        public NumberOfRounds() {
        }
    }
    
    //Get number of rounds
    public NumberOfRounds getNumOfRounds() {
        return numOfRounds;
    }

    //Set nuber of rounds
    public void setNumOfRounds(NumberOfRounds numOfRounds) {
        this.numOfRounds = numOfRounds;
    }
    
    //************************************************************************

    //Current Number of rounds instance
    public CurrentNumOfRounds currentnumOfRounds;

    private static class CurrentNumOfRounds {

        public CurrentNumOfRounds() {
        }
    }

    //Get current number of rounds
    public CurrentNumOfRounds getCurrentnumOfRounds() {
        return currentnumOfRounds;
    }

    //Set current number of rounds
    public void setCurrentnumOfRounds(CurrentNumOfRounds currentnumOfRounds) {
        this.currentnumOfRounds = currentnumOfRounds;
    }
    
    //************************************************************************
    
    //Current Number of turns instance
    public CurrentTurn currentTurn;

    private static class CurrentTurn {

        public CurrentTurn() {
        }
    }

    //Get current number of turns
    public CurrentTurn getCurrentTurn() {
        return currentTurn;
    }

    //Set current number of turns
    public void setCurrentTurns(CurrentTurn currentTurn) {
        this.currentTurn = currentTurn;
    }
    
    //************************************************************************
    
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

    
}
