import enums.AttackTypes;
import enums.EvolutionStatus;
import enums.Type;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        List<Pokecard>  pokecards =  new ArrayList<>();
        List<Attack>  attackList = new ArrayList<>();

        attackList.add(new Attack(AttackTypes.TACKLE));
        attackList.add(new Attack(AttackTypes.LAVA_BALL));
        pokecards.add( new Pokecard("Moltan", 50, 0.7, attackList, Type.LAVA, EvolutionStatus.BASIC));

        attackList = new ArrayList<>();
        attackList.add(new Attack(AttackTypes.DREAM_EATER));
        attackList.add(new Attack(AttackTypes.DREAM_BLAST));
        pokecards.add( new Pokecard("Dream Morning", 150, 2.0, attackList, Type.DREAM, EvolutionStatus.BASIC));

        for(Pokecard pokecard: pokecards){
            System.out.println("Pokemon Name: " + pokecard.getName());
            System.out.println(" Hit Points: " + pokecard.getHitPoints());
            System.out.println(" Height: " + pokecard.getHieght());
            for ( Attack attack :pokecard.getAttacks()) {
                System.out.println(" Attack List " + attack.getName() + " " + attack.getDamage());
            }
            System.out.println(" enums.Type: " + pokecard.getType());
            System.out.println(" Evolution Status: " + pokecard.getEvolutionStatus());
        }
    }

}
