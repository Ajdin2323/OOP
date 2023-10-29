package Lab4.People;

public class Teacher extends Person{
    private int salary;

    Teacher (String name, String adress, int salary) {
        super(name, adress);
        this.salary = salary;
    }

    public int findSalary () {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.salary;
    }
}
