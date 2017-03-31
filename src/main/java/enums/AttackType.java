package enums;

/**
 * Created by Darren on 13/03/2017.
 */
public enum AttackType {
    DREAM_EATER("Dream Eater", 80),
    DREAM_BLAST("Dream Blast", 100),
    TACKLE("Tackle", 50),
    LAVA_BALL("Lava Ball", 80),
    SCRATCH("Scratch", 10),
    CUT("Cut", 20),
    BODY_SLAM("Body Slam", 80),
    GEM_VISION("Gem Vision", 50),
    AERO_TURN("Aero Turn", 40),
    HIGH_JUMP_KICK("High Jump Kick", 40)
    ;

    private final String name;
    private final Integer damage;


    AttackType(String name, Integer damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public Integer getDamage() {
        return damage;
    }
}
