package Lab5;

public class MilitaryService implements NationalService{

    private int daysLeft;
    @Override
    public int getDaysLeft() {

        return this.daysLeft;
    }

    @Override
    public void work() {
        this.daysLeft--;
    }

    public MilitaryService(int daysLeft) {

        this.daysLeft = daysLeft;
    }
}
