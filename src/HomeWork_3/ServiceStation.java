package HomeWork_3;

public class ServiceStation {

    public void checkVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
        }
    }

    public void check(Bicycle bicycle) {
        checkVehicle(bicycle);
    }


    public void check(Car car) {
        checkVehicle(car);
        car.checkEngine();
    }


    public void check(Truck truck) {
        checkVehicle(truck);
        truck.checkEngine();
    }


}
