package Lab5.ThirdTaskBoxes;

public class Thing3 {
    private double weight;
    private String name;

    public double weight() {
        return this.weight;
    }
    public String getName() {
        return this.name;
    }

    public Thing3(String name, double weight) {
        if (this.weight >= 0) {
            this.weight = weight;
        }
        else{
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    public Thing3(String name) {
        this.name = name;
    }


}

