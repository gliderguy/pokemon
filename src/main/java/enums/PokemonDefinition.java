package enums;

import java.util.ArrayList;
import java.util.Arrays;

import static enums.AttackType.*;
import static enums.EvolutionStatus.BASIC;
import static enums.PokeType.DREAM;
import static enums.PokeType.LAVA;

public enum PokemonDefinition {
    MOLTAN(1, "Moltan", 50, 0.7, 1, new ArrayList<AttackType>(Arrays.asList(TACKLE, LAVA_BALL)), LAVA, BASIC),
    DREAM_MORNING(2, "Dream Morning", 150, 2.0, 1, new ArrayList<AttackType>(Arrays.asList(DREAM_EATER , DREAM_BLAST)), DREAM, BASIC),
    RINGY(3, "Ringy", 50, 0.7, 2.0, new ArrayList<AttackType>(Arrays.asList(SCRATCH , CUT)), DREAM, BASIC),
    GEM_EYE(2, "Gem Eye", 50, 0.7, 4.5, new ArrayList<AttackType>(Arrays.asList( BODY_SLAM, GEM_VISION)), DREAM, BASIC);

    private final Integer cardNumber;
    private final String name;
    private final Integer hitpoints;
    private final double height;
    private final double weight;
    private final ArrayList<AttackType> attackTypes;
    private final PokeType pokeType;
    private final EvolutionStatus evolutionStatus;

    PokemonDefinition(Integer cardNumber, String name, Integer hitpoints, double height, double weight, ArrayList<AttackType> attackTypes, PokeType pokeType, EvolutionStatus evolutionStatus) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.hitpoints = hitpoints;
        this.height = height;
        this.weight = weight;
        this.attackTypes = attackTypes;
        this.pokeType = pokeType;
        this.evolutionStatus = evolutionStatus;
    }

    public String getName() {
        return name;
    }

    public Integer getHitpoints() {
        return hitpoints;
    }

    public double getHeight() {
        return height;
    }

    public ArrayList<AttackType> getAttackTypes() {
        return attackTypes;
    }

    public PokeType getPokeType() {
        return pokeType;
    }

    public EvolutionStatus getEvolutionStatus() {
        return evolutionStatus;
    }
}
