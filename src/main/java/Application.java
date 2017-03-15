import enums.AttackType;

import java.util.ArrayList;
import java.util.List;

import static enums.PokemonDefinition.DREAM_MORNING;
import static enums.PokemonDefinition.MOLTEN;

public class Application {
    public static void main(String[] args){
        List<Pokecard>  pokecards =  new ArrayList<Pokecard>(){};
        pokecards.add( new Pokecard(MOLTEN));
        pokecards.add( new Pokecard(DREAM_MORNING));

        for(Pokecard pokecard: pokecards){
            System.out.println("Pokemon Name: " + pokecard.getName());
            System.out.println(" Hit Points: " + pokecard.getHitPoints());
            System.out.println(" Height: " + pokecard.getHeight());
            for ( AttackType attack :pokecard.getAttacks()) {
                System.out.println(" Attack List " + attack.getName() + " " + attack.getDamage());
            }
            System.out.println(" BeforeClassWithoutStaticTest.PokeType: " + pokecard.getPokeType());
            System.out.println(" Evolution Status: " + pokecard.getEvolutionStatus());
        }


    }

}
