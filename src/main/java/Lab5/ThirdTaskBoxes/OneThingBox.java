package Lab5.ThirdTaskBoxes;

import java.util.ArrayList;

public class OneThingBox extends Box3{

    private ArrayList<Thing3> things = new ArrayList<>();
    public OneThingBox() {

    }
    @Override
    public void add(Thing3 thing) {
        if (this.things.size() < 1) {
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
