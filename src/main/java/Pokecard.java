import enums.EvolutionStatus;

import java.util.List;

/**
 * Created by Darren on 12/03/2017.
 */
public class Pokecard {

    public Pokecard(String name, Integer hitPoints, Double hieght, List<Attack> attacks, Type type, EvolutionStatus evolutionStatus) {

        this.name = name;
        this.hitPoints = hitPoints;
        this.hieght = hieght;
        this.attacks = attacks;
        this.type = type;
        this.evolutionStatus = evolutionStatus;
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

    public Double getHieght() {
        return hieght;
    }

    public void setHieght(Double hieght) {
        this.hieght = hieght;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
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

    String name;
    Integer hitPoints;
    Double hieght;
    List<Attack> attacks;
    Type type;
    EvolutionStatus evolutionStatus;

}
