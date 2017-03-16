import enums.PokemonDefinition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Test on 3/15/2017.
 */
public class PokecardDeckFactory {
    List<Pokecard> pokecards =  new ArrayList<Pokecard>(){};

    public PokecardDeckFactory( ) {

    }

    public PokecardDeckFactory(List<Pokecard> pokecards) {
        this.pokecards = pokecards;
    }

    public PokeCardDeck createCards(){
        for (PokemonDefinition cardData: PokemonDefinition.values())
        {
            pokecards.add( new Pokecard(cardData));
        }

        return new PokeCardDeck(pokecards);

    }
}
