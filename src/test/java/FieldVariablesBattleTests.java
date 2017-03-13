import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FieldVariablesBattleTests implements InstanceTestClassListener {

    Battle battle;

    @Before
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

        attackList.add(new Attack("Dream Eater", 80));
        attackList.add(new Attack("Dream Blast", 100));
        return new Pokecard("Dream Morning", 150, 2.0, attackList, "Dream Type", "Basic");

    }

    private Pokecard createCard2(){
        List<Attack>  attackList = new ArrayList<>();

        attackList.add(new Attack("Tackle", 50));
        attackList.add(new Attack("Lava Ball", 80));
        return new Pokecard("Moltan", 50, 0.7, attackList, "Lava", "Basic");
    }
}

