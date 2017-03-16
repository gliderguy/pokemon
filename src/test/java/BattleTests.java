import org.junit.Before;
import org.junit.Test;

import static enums.PokemonDefinition.DREAM_MORNING;
import static enums.PokemonDefinition.MOLTAN;
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

    @Test
    public void battleUsingCardDeck(){
        PokecardDeckFactory pdf = new PokecardDeckFactory();
        PokeCardDeck deck = pdf.createCards();
       // battle.attack(battle.fighterA.)
    }

    private Pokecard createCard1(){
        return new Pokecard(DREAM_MORNING);
    }

    private Pokecard createCard2() {
        return new Pokecard(MOLTAN);
    }
}

