package ganderpoke.core;

import ganderpoke.enumerations.Rank;
import ganderpoke.enumerations.Status;
import ganderpoke.enumerations.Suit;

public class Hand {

    // Uncover all cards in the hand
    public void uncoverHandCards() {
        this.getCards().forEach((Card card) -> card.setStatus(Status.FaceUp));    
    }

    //Check if the card is in the collection
    public boolean isCardInCollection(Rank rank) {
        for (Card card : this.getCards()) {
            if (card.getRank() == rank) {
                return true;
            }
        }

        return false;
    }
    
    public void addCardToHand() {
        
    }
    
    public void removeHandCard() {
        
    }
    
    public void hideCards(){
        
    }
}
