import enums.AttackTypes;

/**
 * Created by Darren on 12/03/2017.
 */
public class Attack {
    String name;
    Integer damage;

    public Attack(AttackTypes attackTypes) {
        this.name = attackTypes.getName();
        this.damage = attackTypes.getDamage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
