import java.util.ArrayList;
public class RentalAgency {
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public RentalAgency() {
        vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
}
    public void rentVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
    public void displayAvailableVehicles() {

        for ( int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).getMark());
        }

    }
}
