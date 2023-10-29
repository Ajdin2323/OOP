package Lab4.People;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void printDepartment(List<Person> people) {
        // we print all the people in the department
        System.out.println(people);

    }
    public static void main(String[] args) {

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
        S.addGrade(2);
        S.displayGrades();

    }
}

