package Lab4.People;

public class Circle extends Shape_Class{

    private double radius;

    public Circle (double radius, String color, FillType fill_type) {
        super(color, fill_type);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    @Override
    public void displayInfo() {
        System.out.println(this.radius + super.getColor() + super.getArea());
    }
}

