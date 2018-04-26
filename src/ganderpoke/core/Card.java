package ganderpoke.core;

import ganderpoke.enumerations.Rank;
import ganderpoke.enumerations.Status;
import ganderpoke.enumerations.Suit;
import java.util.ArrayList;
import java.util.List;

public class Card {
    
    // List of cards in the collection
    private List<Card> cards = new ArrayList<>();
    
    //Get card from collection
    public List<Card> getCards() {
        return this.cards;
    }

    //Set cards in the card collection.
    public void setCards(List<Card> card) {
        this.cards = cards;
    }

    // Rank of the card
    private final Rank rank;

    // Suit of the card
    private final Suit suit;

    // Status of cards
    private Status status;

    
    // Create constructor for cards
    public Card(Rank rank, Suit suit, Status status) {
        this.rank = rank;
        this.suit = suit;
        this.status = status;
    }

    //Get Rank
    public Rank getRank() {
        return this.rank;
    }

    
    //Return the suit
    public Suit getSuit() {
        return this.suit;
    }
    
    //Return the status
    public Status getStatus() {
        return this.status;
    }
    
    //Set status
    public void setStatus(Status status) {
        this.status = status;
                
    }
    
}
    