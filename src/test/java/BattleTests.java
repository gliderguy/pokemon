import enums.AttackTypes;
import enums.EvolutionStatus;
import enums.Type;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class BattleTests {

    Battle battle;
//    static boolean setupRun;

    @Before
    public void setup() {
//        if (!setupRun) {
//            System.out.println("****Before Setup Run");
            battle = new Battle(createCard1(), createCard2());
//            setupRun = true;
//        }
    }

    @Test
    public void createBattle(){
        assertThat( battle, notNullValue() );
    }

    @Test
    public void getCardNamesOfFighterAAndFirghterB(){
        assertThat( battle.getFighterA().getName(), equalTo("Dream Morning"));
        assertThat( battle.getFighterB().getName(), equalTo("Moltan"));
    }

    @Test
    public void fighterAAttacksFighterB(){
        AttackResult attackResult;
        attackResult = battle.attack(battle.getFighterA().attacks.get(0), battle.getFighterB().getHitPoints());
        assertThat(attackResult.fighterBHitPoints, is(-30));
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

