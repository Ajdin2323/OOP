package Lab4.People;

public class Rectangle extends Shape_Class{

    private int a;
    private int b;

    public Rectangle(int a, int b, String color, FillType fill_type) {
        super(color, fill_type);
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return this.a * this.b;
    }
    @Override
    public void displayInfo () {
        System.out.println(this.a + this.b + super.getColor() + this.getArea());
    }


}
