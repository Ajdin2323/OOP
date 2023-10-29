package Lab4.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student extends Person {
        private int n_credits;

        private int student_Id;

    ArrayList<Integer> grades = new ArrayList<>();
        public Student(String name, String adress) {
            super(name, adress);
            this.n_credits = 0;
        }

        public int credits() {
            return this.n_credits;
        }
        public void study() {
            this.n_credits++;
        }

        @Override
        public String toString() {
            return super.toString()  + this.n_credits;
        }

        public int getStudent_Id () {return this.student_Id; }

        public void setStudent_Id (int student_Id) {this.student_Id = student_Id; }

        public void addGrade (int newGrade) {
            grades.add (newGrade);
        }
    public void displayGrades(){
        for (int i =0; i<grades.size(); i++){
            System.out.println(grades.get(i));
        }
    }
}
