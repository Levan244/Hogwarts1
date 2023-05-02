package Packege;

public class Ravenclaw extends Hogwars{
    private int smart;
    private int wise;
    private int witty;
    private int creative;


    public Ravenclaw(String name, int powerMagic, int transgression, int smart, int wise, int witty, int creative) {
        super(name, powerMagic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;

    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + super.toString() + " smart=" + smart + ", wise=" + wise + ", witty=" + witty + ", creative=" + creative + '}';
    }
    public void comperAnyStudentRaveclaw(Ravenclaw first, Ravenclaw second) {

        int fistPoints = first.getPowerMagic() + first.getTransgression() + first.getSmart() + first.getWise() + first.getWise() + first.getWitty() + first.getCreative();
        int secondPoints = second.getPowerMagic() + second.getTransgression() + second.getSmart() + second.getWise() + second.getWise() + second.getWitty() + second.getCreative();

        if (fistPoints > secondPoints) {
            System.out.println(first.getName() + " is better than - " + second.getName());
        } else if (fistPoints < secondPoints) {
            System.out.println(second.getName() + " is better than - " + first.getName());
        } else {
            System.out.println("They are both powerful");
        }
    }
}
class RaveclawStudent  {
    public void print4(Ravenclaw student2) {
        System.out.println(student2);
    }


}

