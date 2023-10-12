public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        commonCheck();
        checkEngine();
        checkTrailer();
    }

    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}