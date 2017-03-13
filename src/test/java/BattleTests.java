import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
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

