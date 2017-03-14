package enums;

public enum Pokecards {
    MOLTEN(1, "Molten", 50, 0.7, null, Type.LAVA, EvolutionStatus.BASIC),
    DREAM_MORNING(2, "Dream Morning", 150, 2.0, null, Type.DREAM, EvolutionStatus.BASIC);

    private final Integer cardNumber;
    private final String name;
    private final Integer hitpoints;
    private final double height;
    private final AttackTypes attackTypes;
    private final Type type;
    private final EvolutionStatus evolutionStatus;


    Pokecards(Integer cardNumber, String name, Integer hitpoints, double height, AttackTypes attackTypes, Type type, EvolutionStatus evolutionStatus) {
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

    public AttackTypes getAttackTypes() {
        return attackTypes;
    }

    public Type getType() {
        return type;
    }

    public EvolutionStatus getEvolutionStatus() {
        return evolutionStatus;
    }
}
