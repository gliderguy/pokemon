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
            for (int i = 1; i <=  cardNumber; i++) {
                handA.addCard(pokecards.get(getRandomNumber(pokecards.size())));
                handB.addCard(pokecards.get(getRandomNumber(pokecards.size())));
            }
        }
    }

    private Integer getRandomNumber(Integer maxNum){
        Random rand = new Random();
        return rand.nextInt(maxNum);
    }
}