import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car1 = new Car("FORD", 2010, 50.0);
        Car car2 = new Car("DACIA", 2014, 45.0);
        Bike bike1 = new Bike("AUDI", 2023, 30.0);
        agency.addVehicle(car1);
        agency.addVehicle(car2);
        agency.addVehicle(bike1);
        agency.displayAvailableVehicles();
        agency.rentVehicle(car1);
        agency.displayAvailableVehicles();

    }
}