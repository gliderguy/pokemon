import enums.EvolutionStatus;
import enums.PokeType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static enums.PokemonDefinition.MOLTAN;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class CreatePokemonTest {

    @Test
    public void createPokemon(){
        List<Pokecard> pokecards =  new ArrayList<Pokecard>();

        pokecards.add( new Pokecard(MOLTAN));

        assertThat( pokecards.get(0).getName(), equalTo("Moltan"));
        assertThat( pokecards.get(0).getHitPoints(), equalTo(50));
        assertThat( pokecards.get(0).getHeight(), equalTo(0.7));
        assertThat( pokecards.get(0).getPokeType(), equalTo(PokeType.LAVA));
        assertThat( pokecards.get(0).evolutionStatus, equalTo(EvolutionStatus.BASIC));
        assertThat( pokecards.get(0).getAttacks().get(0).getName(), equalTo("Tackle"));
        assertThat( pokecards.get(0).getAttacks().get(1).getDamage(), equalTo(80));
        assertThat( pokecards.get(0).getAttacks().size(), equalTo(2));
    }
}
