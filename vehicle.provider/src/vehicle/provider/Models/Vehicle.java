package vehicle.provider.Models;

/**
 *
 * @author LahiruCW
 */
public abstract class Vehicle {
    
    //constant values
    private final String[] modelList = {"Land Rover","Land Crusier","BMW","Mercedes Benz"};
    
    private String licensePlateNo;
    private String model;

    /**
     * @return the licensePlateNo
     */
    public String getLicensePlateNo() {
        return licensePlateNo;
    }

    /**
     * @param licensePlateNo the licensePlateNo to set
     */
    public void setLicensePlateNo(String licensePlateNo) {
        
        //check the length
        if(licensePlateNo.length() == 7){
            
            if(licensePlateNo.startsWith("^[A-Z]{3}[0-9]{4}$")){
                
                this.licensePlateNo = licensePlateNo;
            }
            
            else {
                
                System.out.println("Invalid License Plate Number");
            }
        }
        else {
            
            System.out.println("License Plate number length error");
        }
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        
        for(String modelName : modelList){
            
            if(modelName.equalsIgnoreCase(model)){
                
                this.model = model;
            }
            
            else {
                
                System.out.println("No matching model name!");
            }
        }
    }
    
    
}
