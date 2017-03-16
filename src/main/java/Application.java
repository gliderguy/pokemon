import java.util.ArrayList;
import java.util.List;

import static enums.PokemonDefinition.DREAM_MORNING;
import static enums.PokemonDefinition.MOLTAN;

public class Application {
    public static void main(String[] args){
        List<Pokecard>  pokecards =  new ArrayList<Pokecard>(){};
        pokecards.add( new Pokecard(MOLTAN));
        pokecards.add( new Pokecard(DREAM_MORNING));

        PokecardDeckFactory pdf = new PokecardDeckFactory();
        PokeCardDeck deck = pdf.createCards();
        deck.displayCards();
    }
}
