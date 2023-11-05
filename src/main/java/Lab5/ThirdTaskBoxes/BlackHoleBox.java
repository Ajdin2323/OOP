package Lab5.ThirdTaskBoxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box3{

    private ArrayList<Thing3> things = new ArrayList<>();

    public BlackHoleBox() {

    }
    @Override
    public void add(Thing3 thing) {
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing3 thing) {
        return false;
    }
}
