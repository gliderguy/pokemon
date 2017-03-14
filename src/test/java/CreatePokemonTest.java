import enums.AttackTypes;
import enums.EvolutionStatus;
import enums.Type;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static enums.Pokecards.MOLTEN;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class CreatePokemonTest {

    @Test
    public void createPokemon(){
        List<Pokecard> pokecards =  new ArrayList<Pokecard>();
        List<Attack>  attackList = new ArrayList<Attack>();

        attackList.add(new Attack(AttackTypes.TACKLE));
        attackList.add(new Attack(AttackTypes.LAVA_BALL));
        pokecards.add( new Pokecard(MOLTEN));

        assertThat( pokecards.get(0).getName(), equalTo("Moltan"));
        assertThat( pokecards.get(0).getHitPoints(), equalTo(50));
        assertThat( pokecards.get(0).getHieght(), equalTo(0.7));
        assertThat( pokecards.get(0).getType(), equalTo(Type.LAVA));
        assertThat( pokecards.get(0).evolutionStatus, equalTo(EvolutionStatus.BASIC));
        assertThat( pokecards.get(0).getAttacks().get(0).getName(), equalTo("Tackle"));
        assertThat( pokecards.get(0).getAttacks().get(1).getDamage(), equalTo(80));
        assertThat( pokecards.get(0).getAttacks().size(), equalTo(2));
    }
}
