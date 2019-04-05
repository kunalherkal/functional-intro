package imperative;

import java.util.Objects;

public class Avenger {
    private String name;
    private int power;
    private int intelligence;

    public Avenger(String name, int power, int intelligence) {
        this.name = name;
        this.power = power;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        return "Avenger{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", intelligence=" + intelligence +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avenger avenger = (Avenger) o;
        return getPower() == avenger.getPower() &&
                getIntelligence() == avenger.getIntelligence() &&
                Objects.equals(getName(), avenger.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPower(), getIntelligence());
    }
}
