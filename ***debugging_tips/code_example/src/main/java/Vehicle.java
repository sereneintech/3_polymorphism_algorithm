public class Vehicle {

    private VehicleType vehicleType;
    private String manufacturer;
    private int year;

    public Vehicle(VehicleType vehicleType, String manufacturer, int year){
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
