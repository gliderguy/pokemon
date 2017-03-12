import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args){
        List<Pokecard>  pokecards =  new ArrayList<>();
        List<Attack>  attackList = new ArrayList<>();

        attackList.add(new Attack("Tackle", 50));
        attackList.add(new Attack("Lava Ball", 80));
        pokecards.add( new Pokecard("Moltan", 50, 0.7, attackList, "Lava", "Basic"));

        attackList = new ArrayList<>();
        attackList.add(new Attack("Dream Eater", 80));
        attackList.add(new Attack("Dream Blast", 100));
        pokecards.add( new Pokecard("Dream Morning", 150, 2.0, attackList, "Dream Type", "Basic"));

        attackList = new ArrayList<>();
        attackList.add(new Attack("Dream Eater", 80));
        attackList.add(new Attack("Dream Blast", 100));
        pokecards.add( new Pokecard("Dream Morning", 150, 2.0, attackList, "Dream Type", "Basic"));

        attackList = new ArrayList<>();
        attackList.add(new Attack("Dream Eater", 80));
        attackList.add(new Attack("Dream Blast", 100));
        pokecards.add( new Pokecard("Dream Morning", 150, 2.0, attackList, "Dream Type", "Basic"));

        for(Pokecard pokecard: pokecards){
            System.out.println("Pokemon Name: " + pokecard.getName());
            System.out.println(" Hit Points: " + pokecard.getHitPoints());
            System.out.println(" Height: " + pokecard.getHieght());
            for ( Attack attack :pokecard.getAttacks()) {
                System.out.println(" Attack List " + attack.getName() + " " + attack.getDamage());
            }
            System.out.println(" Type: " + pokecard.getType());
            System.out.println(" Evolution Status: " + pokecard.getEvolutionStatus());
        }
    }

}
