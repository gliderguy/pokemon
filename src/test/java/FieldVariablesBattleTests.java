import enums.AttackTypes;
import enums.EvolutionStatus;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FieldVariablesBattleTests implements InstanceTestClassListener {

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

        attackList.add(new Attack(AttackTypes.DREAM_EATER));
        attackList.add(new Attack(AttackTypes.DREAM_BLAST));
        return new Pokecard("Dream Morning", 150, 2.0, attackList, Type.DREAM, EvolutionStatus.BASIC);

    }

    private Pokecard createCard2(){
        List<Attack>  attackList = new ArrayList<>();

        attackList.add(new Attack(AttackTypes.TACKLE));
        attackList.add(new Attack(AttackTypes.LAVA_BALL));
        return new Pokecard("Moltan", 50, 0.7, attackList, Type.LAVA, EvolutionStatus.BASIC);
    }
}

