import org.junit.Before;

/**
 * Created by Test on 3/22/2017.
 */
public class pokeCardDeckTest
{
    PokecardDeckFactory  pdf;
    PokeCardDeck deck;
    @Before
    public void setup(){
        pdf = new PokecardDeckFactory();
        deck = pdf.createCards();
    }
}
