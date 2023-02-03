package vehicle.provider.Controller;

import java.util.List;
import vehicle.provider.Models.Vehicle;

/**
 * addVehicle, removeVehicle, check availability of the vehicle
 * @author LahiruCW
 */
public class VehicleController {
    
    //add vehicles to the requested vehicle list
    public void addVehicle(List<Vehicle> listOfVehicles, Vehicle vehicle){
        
        listOfVehicles.add(vehicle);
        
    }
    
    //remove vehicles from the requested vehicle list
    public void removeVehicle(List<Vehicle> listOfVehicles, Vehicle vehicle){
        
        listOfVehicles.remove(vehicle);
    }
    
}
