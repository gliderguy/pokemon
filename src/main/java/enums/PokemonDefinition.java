package enums;

import java.util.ArrayList;
import java.util.Arrays;

import static enums.AttackType.LAVA_BALL;
import static enums.AttackType.TACKLE;
import static enums.PokeType.DREAM;
import static enums.PokeType.LAVA;

public enum PokemonDefinition {
    MOLTEN(1, "Molten", 50, 0.7, new ArrayList<AttackType>(Arrays.asList(TACKLE, LAVA_BALL)), LAVA, EvolutionStatus.BASIC),
    DREAM_MORNING(2, "Dream Morning", 150, 2.0, new ArrayList<AttackType>(Arrays.asList(AttackType.DREAM_EATER , AttackType.DREAM_BLAST)), DREAM, EvolutionStatus.BASIC);

    private final Integer cardNumber;
    private final String name;
    private final Integer hitpoints;
    private final double height;
    private final ArrayList<AttackType> attackTypes;
    private final PokeType pokeType;
    private final EvolutionStatus evolutionStatus;

    PokemonDefinition(Integer cardNumber, String name, Integer hitpoints, double height, ArrayList<AttackType> attackTypes, PokeType pokeType, EvolutionStatus evolutionStatus) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.hitpoints = hitpoints;
        this.height = height;
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
