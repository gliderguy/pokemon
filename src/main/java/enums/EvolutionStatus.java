package enums;

public enum EvolutionStatus {
    BASIC("Basic"),
    ADVANCED("Advanced");

    private final String evolutionStatus;

    EvolutionStatus(String evolutionStatus) {
        this.evolutionStatus = evolutionStatus;
    }

    public String getType() {
        return evolutionStatus;
    }
}
