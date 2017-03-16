import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

public class createCardDeck {
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
    public void dealCards(){

    }

}

