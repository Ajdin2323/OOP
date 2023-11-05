package Lab4.People;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class main {
    public static void printDepartment(List<Person> people) {
        // we print all the people in the department
        /*ListIterator<Person> listiterator =people.listIterator();
        while (listiterator.hasNext()==true){
            System.out.println(listiterator.next());
        }*/

        for (Person x: people) {
            System.out.println(x);
        }


    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);

        /*Shape_Class sh1 = new Shape_Class("red", FillType.FILLED);

        Rectangle r1 = new Rectangle(2,3,"blue", FillType.NOT_FILLED);
        r1.displayInfo();*/
        /*
        Rectangle R1 = new Rectangle(2,4, "black", FillType.FILLED);

        System.out.println(R1.getArea());
        */
        /*
        Person p1 = new Person("Ajdin", "Hasana Brkića 19");
        System.out.println(p1.getAge());
        System.out.println(p1.getCountry());
        */
        Student S = new Student("Ajdin", "Hasana Brkića 19");
        S.addGrade(5);
        S.addGrade(4);
        S.addGrade(5);
        S.addGrade(3);
        //S.displayGrades();
        //System.out.println(S.getAverage());

        //System.out.println(S);

        Student s1 = new Student ("Ajdin", "Hasana Brkića 19");
        s1.setAge(21);
        //System.out.println(s1.getAge());

        Student stu = new Student("Ajdin", "Grbavicka za sve 1");
        //System.out.println(stu);
        stu.addGrade(3);
        stu.addGrade(4);
        stu.addGrade(4);
        //stu.displayGrades();

        //System.out.println(stu.getAdress());


    }
}

