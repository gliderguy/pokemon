import enums.AttackType;
import enums.PokemonDefinition;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FieldVariablesBattleTest implements InstanceTestClassListener {

    static Battle battle;

    @Override
    public void beforeClassSetup() {
        battle = new Battle(createCard1(), createCard2());
    }

    @Override
    public void afterClassSetup() {

    }

    @Test
    public void createBattle(){
        battle = new Battle(createCard1(), createCard2());
        assertThat( battle.getFighterA().getName(), equalTo("Dream Morning"));
    }

    @Test
    public void getFighterSatus(){

    }

    @Test
    public void getFighters(){

    }

    private Pokecard createCard1(){
        List<Attack>  attackList = new ArrayList<>();

        attackList.add(new Attack(AttackType.DREAM_EATER));
        attackList.add(new Attack(AttackType.DREAM_BLAST));
        return new Pokecard(PokemonDefinition.DREAM_MORNING);

    }

    private Pokecard createCard2(){
        List<Attack>  attackList = new ArrayList<>();

        attackList.add(new Attack(AttackType.TACKLE));
        attackList.add(new Attack(AttackType.LAVA_BALL));
        return new Pokecard(PokemonDefinition.MOLTAN);
    }
}

