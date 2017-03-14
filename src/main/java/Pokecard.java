import enums.AttackTypes;
import enums.EvolutionStatus;
import enums.Pokecards;
import enums.Type;

import java.util.ArrayList;

/**
 * Created by Darren on 12/03/2017.
 */
public class Pokecard {

    String name;
    Integer hitPoints;
    Double height;
    ArrayList<AttackTypes> attacks;
    Type type;
    EvolutionStatus evolutionStatus;

    public Pokecard(String name, Integer hitPoints, Double hieght, AttackTypes attacks, Type type, EvolutionStatus evolutionStatus) {

        this.name = name;
        this.hitPoints = hitPoints;
        this.height = hieght;
        this.type = type;
        this.evolutionStatus = evolutionStatus;
    }

    public Pokecard(Pokecards card) {
        this.name = card.getName();
        this.hitPoints = card.getHitpoints();
        this.attacks = card.getAttackTypes();
        this.height = card.getHeight();
        this.type = card.getType();
        this.evolutionStatus = card.getEvolutionStatus();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public ArrayList<AttackTypes> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<AttackTypes> attacks) {
        this.attacks = attacks;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public EvolutionStatus getEvolutionStatus() {
        return evolutionStatus;
    }

    public void setEvolutionStatus(EvolutionStatus evolutionStatus) {
        this.evolutionStatus = evolutionStatus;
    }


}
