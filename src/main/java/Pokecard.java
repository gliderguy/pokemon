import enums.AttackType;
import enums.EvolutionStatus;
import enums.PokeType;
import enums.PokemonDefinition;

import java.util.ArrayList;

public class Pokecard {

    String name;
    Integer hitPoints;
    Double height;
    Double weight;
    ArrayList<AttackType> attacks;
    PokeType pokeType;
    EvolutionStatus evolutionStatus;

    public Pokecard(PokemonDefinition pokemonDefinition) {
        this.name = pokemonDefinition.getName();
        this.hitPoints = pokemonDefinition.getHitpoints();
        this.attacks = pokemonDefinition.getAttackTypes();
        this.height = pokemonDefinition.getHeight();
        this.weight = pokemonDefinition.getWeight();
        this.pokeType = pokemonDefinition.getPokeType();
        this.evolutionStatus = pokemonDefinition.getEvolutionStatus();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public ArrayList<AttackType> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<AttackType> attacks) {
        this.attacks = attacks;
    }

    public PokeType getPokeType() {
        return pokeType;
    }

    public void setPokeType(PokeType pokeType) {
        this.pokeType = pokeType;
    }

    public EvolutionStatus getEvolutionStatus() {
        return evolutionStatus;
    }

    public void setEvolutionStatus(EvolutionStatus evolutionStatus) {
        this.evolutionStatus = evolutionStatus;
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}