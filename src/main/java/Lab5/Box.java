package Lab5;

import java.util.ArrayList;
import java.util.Collection;
public class Box {

    private double max_weight;
    private ArrayList<ToBeStored>things;

    public Box(double max_weight) {
        this.max_weight = max_weight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing) {
        if (this.max_weight > thing.weight()) {
            things.add(thing);
        }
    }
    public double totalWeight() {
        double total = 0;
        for (ToBeStored t : this.things) {
            total += t.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return  "Box: " + this.things.size() +
                " things, total weight " +
                this.totalWeight() + " kg";
    }


}
