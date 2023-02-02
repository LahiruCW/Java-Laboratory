package vehicle.provider.Models;

/**
 *
 * @author LahiruCW
 */

public class SUV extends Vehicle {
    
    private int numberOfLandRovers;
    private int numberOfLandCruisers;
    
    //constructor
    public SUV(){
        
        this.numberOfLandRovers = 4;
        this.numberOfLandCruisers = 3;
    }

    /**
     * @return the numberOfLandRovers
     */
    public int getNumberOfLandRovers() {
        return numberOfLandRovers;
    }

    /**
     * @return the numberOfLandCruisers
     */
    public int getNumberOfLandCruisers() {
        return numberOfLandCruisers;
    }

    /**
     * @param numberOfLandRovers the numberOfLandRovers to set
     */
    public void setNumberOfLandRovers(int numberOfLandRovers) {
        
        //assumption - new land rovers are not brought by the provider
        if(numberOfLandRovers <= 4){
            
            this.numberOfLandRovers = numberOfLandRovers;
        }
    }

    /**
     * @param numberOfLandCruisers the numberOfLandCruisers to set
     */
    public void setNumberOfLandCruisers(int numberOfLandCruisers) {
        
        //assumption - new land cruisers are not brought by the provider
        if(numberOfLandCruisers < 3){
            
            this.numberOfLandCruisers = numberOfLandCruisers;
        }
    }
    
}
