import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

public class createCardDeckTest {
    PokecardDeckFactory  pdf;
    PokeCardDeck deck;


    @Before
    public void setup(){
        pdf = new PokecardDeckFactory();
        deck = pdf.createCards();
    }

    @Test
    public void createPokeDeckFacactory(){
        assertThat(pdf,notNullValue());
    }

    @Test
    public void createPokeDeck( ){
        assertThat(deck.getCardCount(), is(4));
    }

    @Test
    public void displayCards(){
        deck.displayCards();
    }

    @Test
    public void deal0Cards(){
        CardHand playerA = new CardHand();
        CardHand playerB = new CardHand();
        deck.deal(0, playerA, playerB);
        assertThat(playerA.hand.size(), is(0));
        assertThat(playerB.hand.size(), is(0));
    }

    @Test
    public void deal1Cards(){
        CardHand playerA = new CardHand();
        CardHand playerB = new CardHand();
        deck.deal(1, playerA, playerB);
        assertThat(playerA.hand.size(), is(1));
        assertThat(playerB.hand.size(), is(1));
    }

    @Test
    public void deal4Cards(){
        CardHand playerA = new CardHand();
        CardHand playerB = new CardHand();
        deck.deal(4, playerA, playerB);
        assertThat(playerA.hand.size(), is(4));
        assertThat(playerB.hand.size(), is(4));
    }
}

