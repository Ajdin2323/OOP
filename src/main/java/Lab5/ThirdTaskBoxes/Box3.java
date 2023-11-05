package Lab5.ThirdTaskBoxes;

import java.util.Collection;
public abstract class Box3 {
    public abstract void add(Thing3 thing);

    public void add(Collection<Thing3> things) {
        for (Thing3 thing : things) {
            add(thing);
        }
    }
    public abstract boolean isInTheBox(Thing3 thing);
}
