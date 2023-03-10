import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> s = new ArrayList<>();
        ArrayList<Student> a = new ArrayList<>();
        students.add(new Student("Aleksandur", "Pushkin", (byte) 37, Gender.MAN, 2000));
        students.add(new Student("John", "Cena", (byte) 24, Gender.MAN, 2500));
        students.add(new Student("Dobulbek k", "Ainazik", (byte) 18, Gender.WOMAN, 1500));
        students.add(new Student("Mamatkarimov", "Bekkjigit", (byte) 22, Gender.MAN, 1000));
        students.add(new Student("Kanubek u", "Nurbek", (byte) 18, Gender.MAN, 200000));
        students.add(new Student("Alisherov", "Erjigit", (byte) 19, Gender.MAN, 1700));
        students.add(new Student("Alisherov", "Erzhigit", (byte) 19, Gender.MAN, 1700));
        students.add(new Student("Almazbek k", "Riana", (byte) 23, Gender.WOMAN, 5000));
        students.add(new Student("Bred ", "Pit", (byte) 40, Gender.MAN, 1500));
        students.add(new Student("Anjelina", "Joli", (byte) 32, Gender.WOMAN, 100000));

        Student student = new Student();
        student.many(students, s, a);
        System.out.println("---------------------------------");
        student.jigitDengi(students);
        System.out.println("---------------------------------");
        student.manys(students);
        System.out.println("---------------------------------");
        student.at(students);
        System.out.println("---------------------------------");
        student.kyzbala(students);
        System.out.println("---------------------------------");
        student.indeks(students);
        System.out.println("---------------------------------");
        student.studentChisla(students);
        System.out.println("---------------------------------");
        student.studentAkcha(students);
        System.out.println("---------------------------------");
        student.kuzAkcha(students);
        System.out.println("---------------------------------");
        student.birStudent(students);
    }

}
