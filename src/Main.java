public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 4);
        Vehicle truck = new Track("truck1", 6);
        Vehicle truck2 = new Track("truck2", 8);
        Vehicle bicycle = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);
        Vehicle[] vehicles = new Vehicle[]{car, car2, truck, truck2, bicycle, bicycle2};
        ServiceStation(vehicles);
    }

    public static void ServiceStation(Vehicle[] vehicle) {
        for (Vehicle nextVehicle : vehicle) {
            nextVehicle.service();
            System.out.println("***********************************************************");
        }
    }
}