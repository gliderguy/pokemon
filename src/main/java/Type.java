/**
 * Created by Darren on 13/03/2017.
 */
public enum Type {
    LAVA("Lava"),
    DREAM("Dream");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

