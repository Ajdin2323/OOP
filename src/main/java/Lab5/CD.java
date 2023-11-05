package Lab5;

public class CD implements ToBeStored{

    private String artist;
    private String name;
    private double weight;

    public CD(String artist, String name, double weight) {
        this.artist = artist;
        this.name = name;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + (int)(this.weight) + ")";
    }
}
