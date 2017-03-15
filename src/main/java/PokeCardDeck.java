import enums.AttackType;

import java.util.ArrayList;
import java.util.List;

public class PokeCardDeck {
    List<Pokecard> pokecards =  new ArrayList<Pokecard>(){};

    public PokeCardDeck(List<Pokecard> pokecards) {
        this.pokecards = pokecards;
    }

    public PokeCardDeck getPokecards() {
        return this;
    }

    public void setPokecards(List<Pokecard> pokecards) {
        this.pokecards = pokecards;
    }

    public int getCardCount(){
       return pokecards.size();
    }

    public void displayCards(){
        for(Pokecard pokecard: pokecards){
            System.out.println("Pokemon Name: " + pokecard.getName());
            System.out.println(" Hit Points: " + pokecard.getHitPoints());
            System.out.println(" Height: " + pokecard.getHeight());
            for ( AttackType attack :pokecard.getAttacks()) {
                System.out.println(" Attack List " + attack.getName() + " " + attack.getDamage());
            }
            System.out.println(" Poke Type: " + pokecard.getPokeType().getType());
            System.out.println(" Evolution Status: " + pokecard.getEvolutionStatus().getType());
        }
    }

}
