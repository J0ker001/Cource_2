package HomeWork_3;

public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовике");
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель в грузовике");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
