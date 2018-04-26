package ganderpoke.core;

public class Player {
    
    //Player's hand
    private final Hand hand;

    //Points of the player
    private int score;
    

    
    //Player constructor.
    public Player(Hand hand) {
        this.hand = hand;
    }

    // Return hand of current player
    public Hand getHand() {
        return this.hand;
    }

    private Square square;
        
    public void pickUpCard() {
        
        Square = Game.getSquare();
        Card pickUpCard = null;
        do {
            pickUpCard = square.SelectCard();
            getHand().addCard(pickUpCard);
        }while (!game.isValid(pickUpCard))
        
    }
    
    
    // Return the score for player
    public int getScore() {
        return this.score;
    }

    // Add score to the player
    public void addScore(int score) {
        this.score += score;
    }
    
}
