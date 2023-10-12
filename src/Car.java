public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(){
        commonCheck();
        checkEngine();
    }
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}