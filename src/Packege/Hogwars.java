package Packege;

public class Hogwars {
    private String name;
    private int powerMagic;
    private int transgression;

    public Hogwars(String name, int powerMagic, int transgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "name='" + name + ", powerMagic=" + powerMagic + ", transgression=" + transgression;
    }
}
