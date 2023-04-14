public class ServiceStationTransport implements ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        printTransport(car, bicycle, truck);
    }

    private void printTransport(Car car, Bicycle bicycle, Truck truck){
        if (car != null) {
            System.out.println("Обслуживаем машину: " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
            System.out.println();
        } else if (truck != null) {
            System.out.println("Обслуживаем грузовик: " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
            System.out.println();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем велосипед: " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
                System.out.println();
            }
        }
    }
}