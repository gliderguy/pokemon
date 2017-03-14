import java.util.ArrayList;
import java.util.List;

import static enums.Pokecards.DREAM_MORNING;
import static enums.Pokecards.MOLTEN;

public class Application {
    public static void main(String[] args){
        List<Pokecard>  pokecards =  new ArrayList<>();
//        List<Attack>  attackList = new ArrayList<>();
//
//        attackList.add(new Attack(AttackTypes.TACKLE));
//        attackList.add(new Attack(AttackTypes.LAVA_BALL));
//        pokecards.add( new Pokecard("Moltan", 50, 0.7, attackList, Type.LAVA, EvolutionStatus.BASIC));
//
//        attackList = new ArrayList<>();
//        attackList.add(new Attack(AttackTypes.DREAM_EATER));
//        attackList.add(new Attack(AttackTypes.DREAM_BLAST));
//        pokecards.add( new Pokecard("Dream Morning", 150, 2.0, attackList, Type.DREAM, EvolutionStatus.BASIC));

        pokecards.add( new Pokecard(MOLTEN));
        pokecards.add( new Pokecard(DREAM_MORNING));


        for(Pokecard pokecard: pokecards){
            System.out.println("Pokemon Name: " + pokecard.getName());
            System.out.println(" Hit Points: " + pokecard.getHitPoints());
            System.out.println(" Height: " + pokecard.getHeight());
            System.out.println("TODO printout attack types");
//            for ( Attack attack :pokecard.getAttacks()) {
//                System.out.println(" Attack List " + attack.getName() + " " + attack.getDamage());
//            }
            System.out.println(" enums.Type: " + pokecard.getType());
            System.out.println(" Evolution Status: " + pokecard.getEvolutionStatus());
        }
    }

}
