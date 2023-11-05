package Lab5;

import java.util.ArrayList;
import java.util.Collection;
public class Thing implements ToBeStored{
    private double weight;
    private String name;

    public String getName() {
        return this.name;
    }
    public Thing(String name, double weight) {
        if (this.weight >= 0) {
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public Thing(String name) {
        this.name = name;
    }
    @Override
    public double weight() {
        return this.weight;
    }
}
