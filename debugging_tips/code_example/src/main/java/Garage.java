import java.util.List;

public class Garage {

    private name;
    private vehicles;

    public Garage(String name){
        this.name = name;
    }

    public int countVehicles(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

    public List<Vehicle> findVehicleByYear(int year){
        List<Vehicle> foundVehicles = new ArrayList<>();
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getYear() > year){
                foundVehicles.add(vehicle);
            }
        }
        return foundVehicles;
    }




    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
