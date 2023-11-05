package Lab4.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student extends Person {
        private int n_credits;

        private int student_Id;
        private int age;
        private String country;
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
            return super.toString()  + " " + this.n_credits;
        }

        public int getStudent_Id () {return this.student_Id; }

        public void setStudent_Id (int student_Id) {this.student_Id = student_Id; }

        public void addGrade (int newGrade) {
            grades.add (newGrade);
        }
    public void displayGrades(){
            for (int i = 0; i<grades.size(); i++){
            System.out.println(grades.get(i));
        }
    }
    double average;
        double suma = 0;
    public double getAverage () {
          for (int i = 0; i < grades.size(); i++) {
              suma = suma + grades.get(i);
              average = (double)(suma / grades.size());
          }
          return average;
    }

    public int getAge() {return this.age;}
    public void setAge (int newAge) {this.age = newAge;}
    public String getCountry () {return this.country;}
    public void setCountry (String newCountry) {this.country = newCountry;}

}
