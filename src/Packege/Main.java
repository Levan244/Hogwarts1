package Packege;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] students = {
                new Gryffindor("Harry Potter", 95, 90, 100, 90, 100),
                new Gryffindor("Hermione Granger", 95, 90, 100, 90, 100),

        };
        GryffindorStudent printer = new GryffindorStudent();
        for (Gryffindor student : students) {
            printer.print(student);

        }
        Gryffindor gryffindor = new Gryffindor("Ron Yisly",94,85,100,65,100);
        gryffindor.compareGryffindor(students[0], students[1]);
        System.out.println();
        System.out.println();


        Blyherin[] study = {
                new Blyherin("Draco Malfoy", 90, 100, 95, 95, 95, 80, 85),
                new Blyherin("Gregory Goyle", 75, 95, 75, 65, 100, 85, 100)
        };

        Blyherin.BlyherinStudent printer1 = new Blyherin.BlyherinStudent();
        for (Blyherin study1 : study) {
            printer1.printl(study1);
        }
        Blyherin blyherin = new Blyherin(" ", 75, 85, 74, 78, 75, 45, 100);
        blyherin.comperAnyStudent(study[0],study[1]);
        System.out.println();
        System.out.println();

        Ravenclaw[] student1 = {
                new Ravenclaw("Zhou Chang", 70, 80, 90, 95, 75, 85),
                new Ravenclaw("Padma Patil", 77, 66, 26, 54, 35, 70)
        };
        RaveclawStudent printer2 = new RaveclawStudent();
        for (Ravenclaw study2 : student1) {
            printer2.print4(study2);
        }
        Ravenclaw ravenclaw = new Ravenclaw("Marcus Belby", 65, 75, 45, 15, 45, 35);
        ravenclaw.comperAnyStudentRaveclaw(student1[0],student1[1]);
        System.out.println();
        System.out.println();

        Hufflepuff[] student2 = {
                new Hufflepuff("Zachariah Smith", 65, 85, 74, 64, 98),
                new Hufflepuff("Cedric Diggory", 85, 95, 100, 95, 85)
        };
        HufflepuffStudent priter4 = new HufflepuffStudent();
        for (Hufflepuff study3 : student2) {
            priter4.print3(study3);
        }
        Hufflepuff hufflepuff = new Hufflepuff("Justin Finch-Fletchley", 78, 74, 75, 79, 48);
        hufflepuff.comperAnyStudentHufflepuff(student2[0],student2[1]);
    }
}