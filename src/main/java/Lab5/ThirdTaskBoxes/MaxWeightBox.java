package Lab5.ThirdTaskBoxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box3{

    private ArrayList<Thing3> things = new ArrayList<>();
    private int maxWeight;
    private int weightInBox;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weightInBox = 0;
    }

    @Override
    public void add(Thing3 thing) {
        if (this.weightInBox < this.maxWeight) {
            this.weightInBox += thing.weight();
            things.add(thing);
        }
    }
    @Override
    public boolean isInTheBox(Thing3 thing) {
        for (Thing3 t : things) {
            if (t.getName().equals(thing.getName())) {
                return true;
            }
        }
        return false;
    }
}
