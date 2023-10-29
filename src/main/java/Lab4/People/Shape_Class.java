package Lab4.People;

public class Shape_Class {

    private String color;

    private FillType fill_type;


    public Shape_Class(String color, FillType fill_type) {
        this.color = color;
        this.fill_type = fill_type;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FillType getFill_type() {
        return this.fill_type;
    }

    public void setFill_type(FillType fill_type) {
        this.fill_type = fill_type;
    }

    public void displayInfo() {
        System.out.println(this.color + " " + this.fill_type);
    }

    public double getArea() {
        return 0;
    }

}
