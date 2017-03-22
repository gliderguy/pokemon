import enums.AttackType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
            System.out.println(" Weight: " + pokecard.getWeight());
            for ( AttackType attack :pokecard.getAttacks()) {
                System.out.println(" Attack List " + attack.getName() + " " + attack.getDamage());
            }
            System.out.println(" Poke Type: " + pokecard.getPokeType().getType());
            System.out.println(" Evolution Status: " + pokecard.getEvolutionStatus().getType());
        }
    }

    public void deal(Integer cardNumber, CardHand handA, CardHand handB){

        if (cardNumber > 0) {
            int n;
            Random rand = new Random();

            for (int i = 1; i <= cardNumber; i++) {
                n = rand.nextInt(cardNumber);
                System.out.println(n);
                //Todo create random number. max number is the number of cards in the pack
                handA.addCard(pokecards.get(n));
                n = rand.nextInt(cardNumber);
                System.out.println(n);
                handB.addCard(pokecards.get(n));
            }
        }
    }
}