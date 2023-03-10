import java.lang.management.PlatformLoggingMXBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Student implements MethodMany {
    private String lastName;
    private String name;
    private byte age;
    private Gender gender;
    private int many;

    public Student() {

    }

    public Student(String lastName, String name, byte age, Gender gender, int many) {
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.many = many;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMany() {
        return many;
    }

    public void setMany(int many) {
        this.many = many;
    }

    @Override
    public String toString() {
        return
                "lastName: " + lastName +
                        ", name: " + name +
                        ", age: " + age +
                        ", gender: " + gender +
                        ", price: " + many;
    }

    @Override
    public void many(ArrayList<Student> students, ArrayList<Student> s, ArrayList<Student> a) {
        for (Student f : students) {
            if (f.getName().startsWith("A")) {
                s.add(f);
            } else if (f.getName().startsWith("B")) {
                a.add(f);
            }
        }
        System.out.println("A mn B gana tamgalardu chugargan method");
        System.out.println(s);
        System.out.println(a);
    }

    @Override
    public void jigitDengi(ArrayList<Student> students) {
        System.out.println("Jashu 15 chon bolso akchasy 2000 bolso chuksun");
        for (Student s : students) {
            if (s.getAge() > 15 && s.getMany() > 2000) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void manys(ArrayList<Student> students) {
        System.out.println("Barduk studenterge 1000 somdon koshup chugargan method");
        for (Student s : students) {

            System.out.println(s.getMany() + 1000);
        }
    }

    @Override
    public void birStudent(ArrayList<Student> students) {
        System.out.println("Barduk studenterdi chugargan method: ");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void at(ArrayList<Student> students) {
        System.out.println("Studenterdin attaru mn chugargan method");
        for (Student s : students) {
            System.out.println(s.getName());
        }

    }

    @Override
    public void kyzbala(ArrayList<Student> students) {
        System.out.println("Kuzdar");
        for (Student s : students) {
            if (s.getGender() == Gender.WOMAN) {
                System.out.println(s);
            }
        }
        System.out.println("------Baldar-----");
        for (Student s : students) {
            if (s.getGender() == Gender.MAN) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void studentAkcha(ArrayList<Student> students) {
        Integer maxMany = students.get(0).getMany();
        for (Student i : students) {
            if (i.getMany() >= maxMany) {
                maxMany = i.getMany();
            }
        }
        System.out.println("Akcahsu en kop studenti chugargan method");
        for (Student s : students) {
            if (s.getMany() == maxMany) {
                maxMany = s.getMany();
                System.out.println(maxMany);
            }
        }
    }

    @Override
    public void kuzAkcha(ArrayList<Student> students) {
        ArrayList<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender() == Gender.WOMAN) {
                students1.add(student);
            }
        }
        int maxMany = students.get(0).getMany();
        for (Student s : students1) {
            if (s.getMany() > maxMany) {
                maxMany = s.getMany();
            }
        }
        System.out.println(maxMany);
    }

    @Override
    public void studentChisla(ArrayList<Student> students) {
        int san = 0;
        for (int i = 0; i < students.size(); i++) {
            san++;

        }
        System.out.println("Studentin sanun chugargan method");
        System.out.println(san);
    }

    @Override
    public void indeks(ArrayList<Student> students) {
        System.out.println("1 birinchi studentti chugargan method");
        System.out.println(students.get(0));
    }
}
