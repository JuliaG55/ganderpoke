package ganderpoke.system;

import ganderpoke.core.Card;
import ganderpoke.enumerations.Rank;
import ganderpoke.enumerations.Status;
import ganderpoke.enumerations.Suit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleThePack {
    
    //Generate pack
    private final List<Card> pack = new ArrayList<>();

    public void shuffle() {

        this.pack.clear();

        this.pack.add(new Card(Rank.ACE, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.FIVE, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.SIX, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.SEVEN, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.EIGHT, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.NINE, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.TEN, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.JACK, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.QUEEN, Suit.CLUBS, Status.FaceDown));
        this.pack.add(new Card(Rank.KING, Suit.CLUBS, Status.FaceDown));

        this.pack.add(new Card(Rank.ACE, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.FIVE, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.SIX, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.SEVEN, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.EIGHT, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.NINE, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.TEN, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.JACK, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.QUEEN, Suit.DIAMONDS, Status.FaceDown));
        this.pack.add(new Card(Rank.KING, Suit.DIAMONDS, Status.FaceDown));

        this.pack.add(new Card(Rank.ACE, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.FIVE, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.SIX, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.SEVEN, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.EIGHT, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.NINE, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.TEN, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.JACK, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.QUEEN, Suit.HEARTS, Status.FaceDown));
        this.pack.add(new Card(Rank.KING, Suit.HEARTS, Status.FaceDown));

        this.pack.add(new Card(Rank.ACE, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.FIVE, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.SIX, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.SEVEN, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.EIGHT, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.NINE, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.TEN, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.JACK, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.QUEEN, Suit.SPADES, Status.FaceDown));
        this.pack.add(new Card(Rank.KING, Suit.SPADES, Status.FaceDown));

        //this.pack.add(new Card(Rank.JOKER, Suit.NOT_RELEVANT, Status.FaceDown));

        Collections.shuffle(this.pack);
    }
    
}
