package Packege;

public class Hufflepuff extends Hogwars {
    private int industrious;
    private int loyalty;
    private int honest;

    public Hufflepuff(String name, int powerMagic, int transgression, int industrious, int loyalty, int honest) {
        super(name, powerMagic, transgression);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() + " industrious=" + industrious + ", loyalty=" + loyalty + ", honest=" + honest + '}';
    }

}
