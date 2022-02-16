package HomeWork_3;

public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на автомобиле");
    }

    public void checkEngine() {

        System.out.println("Проверяем двигатель в машине ");
    }

}
