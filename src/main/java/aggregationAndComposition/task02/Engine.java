package aggregationAndComposition.task02;

public class Engine {
    int year;
    String model;
    boolean isWorking = false;
    boolean isBroken = false;

    public Engine(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
