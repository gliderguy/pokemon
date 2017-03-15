import org.junit.Test;

import java.util.PrimitiveIterator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

public class createCardDeck {

    @Test
    public void createPokeDeckFacactory(){
        PokecardDeckFactory pdf = new PokecardDeckFactory();
        assertThat(pdf,notNullValue());
    }

    @Test
    public void createPokeDeck( ){
        PokecardDeckFactory pdf = new PokecardDeckFactory();
        PokeCardDeck deck = pdf.createCards(PrimitiveIterator.class);
        assertThat(deck.getCardCount(), is(2));
    }

    @Test
    public void displayCards(){
        PokecardDeckFactory pdf = new PokecardDeckFactory();
        PokeCardDeck deck = pdf.createCards(PrimitiveIterator.class);
        deck.displayCards();

    }
}
