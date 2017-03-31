package enums;

public enum EvolutionStatus {
    BASIC("Basic"),
    STAGE2("Stage 2"),
    ADVANCED("Advanced")
    ;

    private final String evolutionStatus;

    EvolutionStatus(String evolutionStatus) {
        this.evolutionStatus = evolutionStatus;
    }

    public String getType() {
        return evolutionStatus;
    }
}
