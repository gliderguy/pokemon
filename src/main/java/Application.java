import enums.AttackTypes;

import java.util.ArrayList;
import java.util.List;

import static enums.Pokecards.DREAM_MORNING;
import static enums.Pokecards.MOLTEN;

public class Application {
    public static void main(String[] args){
        List<Pokecard>  pokecards =  new ArrayList<Pokecard>(){};
        pokecards.add( new Pokecard(MOLTEN));
        pokecards.add( new Pokecard(DREAM_MORNING));

        for(Pokecard pokecard: pokecards){
            System.out.println("Pokemon Name: " + pokecard.getName());
            System.out.println(" Hit Points: " + pokecard.getHitPoints());
            System.out.println(" Height: " + pokecard.getHeight());
            for ( AttackTypes attack :pokecard.getAttacks()) {
                System.out.println(" Attack List " + attack.getName() + " " + attack.getDamage());
            }
            System.out.println(" enums.Type: " + pokecard.getType());
            System.out.println(" Evolution Status: " + pokecard.getEvolutionStatus());
        }


    }

}
