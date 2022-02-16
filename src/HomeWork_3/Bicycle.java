package HomeWork_3;

public class Bicycle extends Vehicle {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }

}
