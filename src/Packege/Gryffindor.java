package Packege;

public class Gryffindor extends Hogwars{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int transgression, int bravery, int honor, int nobility) {
        super(name, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {

        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{"+ super.toString() + " nobility=" + nobility + ", honor=" + honor + ", bravery=" + bravery + '}';
    }


    public void compareGryffindor(Gryffindor first, Gryffindor second) {
        int fistPoints = first.getBravery() + first.getHonor() + first.getNobility();
        int secondPoints = second.getBravery() + second.getHonor() + second.getNobility();
        if (fistPoints > secondPoints) {
            System.out.println(first.getName() + " is better than - " + second.getName());
        } else if (fistPoints < secondPoints) {
            System.out.println(second.getName() + " is better than - " + first.getName());
        } else {
            System.out.println("They are both powerful");

        }
    }





}
class GryffindorStudent  {

    public void print(Gryffindor student) {
        System.out.println(student);
    }

}



