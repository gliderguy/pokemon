package enums;

import java.util.ArrayList;
import java.util.Arrays;

import static enums.AttackTypes.LAVA_BALL;
import static enums.AttackTypes.TACKLE;
import static enums.Type.DREAM;
import static enums.Type.LAVA;

public enum Pokecards {
    MOLTEN(1, "Molten", 50, 0.7, new ArrayList<AttackTypes>(Arrays.asList(TACKLE, LAVA_BALL)), LAVA, EvolutionStatus.BASIC),
    DREAM_MORNING(2, "Dream Morning", 150, 2.0, new ArrayList<AttackTypes>(Arrays.asList(AttackTypes.DREAM_EATER , AttackTypes.DREAM_BLAST)), DREAM, EvolutionStatus.BASIC);

    private final Integer cardNumber;
    private final String name;
    private final Integer hitpoints;
    private final double height;
    private final ArrayList<AttackTypes> attackTypes;
    private final Type type;
    private final EvolutionStatus evolutionStatus;

    Pokecards(Integer cardNumber, String name, Integer hitpoints, double height, ArrayList<AttackTypes> attackTypes, Type type, EvolutionStatus evolutionStatus) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.hitpoints = hitpoints;
        this.height = height;
        this.attackTypes = attackTypes;
        this.type = type;
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

    public ArrayList<AttackTypes> getAttackTypes() {
        return attackTypes;
    }

    public Type getType() {
        return type;
    }

    public EvolutionStatus getEvolutionStatus() {
        return evolutionStatus;
    }
}
