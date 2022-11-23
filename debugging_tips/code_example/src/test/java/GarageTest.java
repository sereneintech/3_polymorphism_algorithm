import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GarageTest {

    private Garage garage;

    @BeforeEach
    public void setUp(){
        garage = new Garage("BNTA Garage");
    }

    @Test
    public void canCountVehicles(){
        assertThat(garage.countVehicles()).isEqualTo(0);
    }

    @Test
    public void canAddVehicle(){
        Vehicle car = new Vehicle(VehicleType.CAR, "Ford", 2018);
        garage.addVehicle(car);
        assertThat(garage.countVehicles()).isEqualTo(1);
    }

    @Test
    public void canRemoveVehicle(){
        Vehicle car = new Vehicle(VehicleType.CAR, "Ford", 2018);
        Vehicle motorbike = new Vehicle(VehicleType.MOTORBIKE, "Honda", 1997);
        garage.addVehicle(car);
        garage.addVehicle(motorbike);
        garage.removeVehicle(car);
        assertThat(garage.countVehicles()).isEqualTo(1);
    }

    @Test
    @Disabled
    public void canFindVehicleByYear(){
        Vehicle car = new Vehicle(VehicleType.CAR, "Ford", 2018);
        Vehicle motorbike = new Vehicle(VehicleType.MOTORBIKE, "Honda", 1997);
        Vehicle plane = new Vehicle(VehicleType.PLANE, "Boeing", 2002);
        Vehicle sportsCar = new Vehicle(VehicleType.CAR, "Ferrari", 1971);
        garage.addVehicle(car);
        garage.addVehicle(motorbike);
        garage.addVehicle(plane);
        garage.addVehicle(sportsCar);
        List<Vehicle> results = garage.findVehicleByYear(1971);
        assertThat(results.size()).isEqualTo(1);
    }

}
