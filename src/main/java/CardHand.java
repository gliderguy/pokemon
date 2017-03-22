import java.util.ArrayList;
import java.util.List;

/**
 * Created by Test on 3/16/2017.
 */
public class CardHand {
    List<Pokecard> hand =  new ArrayList<Pokecard>(4);

    public void addCard(Pokecard pokecard){

        hand.add(pokecard);
    }
}
