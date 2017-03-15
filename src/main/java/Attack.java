import enums.AttackType;

public class Attack {
    String name;
    Integer damage;

    public Attack(AttackType attackType) {
        this.name = attackType.getName();
        this.damage = attackType.getDamage();
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
