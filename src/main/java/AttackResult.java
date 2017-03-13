/**
 * Created by Darren on 13/03/2017.
 */
public class AttackResult {
    Integer fighterAHitPoints;
    Integer fighterBHitPoints;

    public Integer getFighterAHitPoints() {
        return fighterAHitPoints;
    }

    public Integer getFighterBHitPoints() {
        return fighterBHitPoints;
    }

    public AttackResult(Integer fighterAHitPoints, Integer fighterBHitPoints) {
        this.fighterAHitPoints = fighterAHitPoints;
        this.fighterBHitPoints = fighterBHitPoints;
    }
}
