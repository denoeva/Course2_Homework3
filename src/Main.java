public class Main {
    public static void main(String[] args) {
        Car car = new Car("Skoda Kodiaq", 4);
        Car car2 = new Car("Suzuki Jimny", 4);
        Truck truck = new Truck("Volvo", 6);
        Truck truck2 = new Truck("КамАЗ", 8);
        Bicycle bicycle = new Bicycle("Аист",2);
        Bicycle bicycle2 = new Bicycle("Electra", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);
    }
}