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
    }
}