package Lab5;

public class CivilService implements NationalService{

    private int daysLeft;
    @Override
    public int getDaysLeft() {

        return this.daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft > 0) {
            this.daysLeft--;
        }

    }

    public CivilService() {
        this.daysLeft = 362;
    }
}
