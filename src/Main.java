public class Main {
    public static void main(String[] args) {
        Car car = new Car("Skoda Kodiaq", 4);
        Car car2 = new Car("Suzuki Jimny", 4);

        Truck truck = new Truck("Volvo", 6);
        Truck truck2 = new Truck("КамАЗ", 8);

        Bicycle bicycle = new Bicycle("Аист",2 );
        Bicycle bicycle2 = new Bicycle("Electra", 2);

//        ServiceStation station = new ServiceStationTransport();
//        station.check(car, null, null);
//        station.check(car2, null, null);
//        station.check(null, bicycle, null);
//        station.check(null, bicycle2, null);
//        station.check(null, null, truck);
//        station.check(null, null, truck2);

        ServiceStation serviceStationTransport = new ServiceStationTransport();
        serviceStationTransport.check(car, bicycle, truck);

//        checkTransport(serviceStationTransport, car, bicycle, truck2);
    }
//    private static void checkTransport(ServiceStation serviceStation, Car car, Bicycle bicycle, Truck truck) {
//        serviceStation.check(car, bicycle, truck);
//    }
}