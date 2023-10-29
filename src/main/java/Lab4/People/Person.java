package Lab4.People;

public class Person {
    private String name;
    private String adress;

    private int age;
    private String country;


    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return name + adress;
    }
}


