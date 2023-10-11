public class Truck extends Vehicle{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        commonCheck();
        checkEngine();
        checkTrailer();
    }
}