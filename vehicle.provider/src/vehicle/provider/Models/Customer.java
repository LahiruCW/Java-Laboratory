package vehicle.provider.Models;

/**
 *
 * @author LahiruCW
 */
public class Customer {
    
    //member variables
    private String name;
    private String contactNo;
    private String nicNo;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        //name must not be empty
        if(name.isEmpty())
        {
            System.out.println("Customer Name can not be empty");
            
        } else {
            
            this.name = name;
        }
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        
        //assumption - contact number is in the format 070XXXXXXX
        //assumption - all the customers have a contact number
        if(contactNo.length()==10){
            
            //check the string contains only numbers
            if(contactNo.matches("[0-9]+")){
                
                this.contactNo = contactNo;
            }
            
            else {
                
                System.out.println("Must only contains numbers!");
            }
        }
        
        else {
            
            System.out.println("Phone number must only contains 10 digits");
        }
    }

    /**
     * @return the nicNo
     */
    public String getNicNo() {
        return nicNo;
    }

    /**
     * @param nicNo the nicNo to set
     */
    public void setNicNo(String nicNo) {
        
        //check the length of the nic
        if(nicNo.length() == 12){
            
            //for the traditional nic numbers and the new nic numbers
            if(nicNo.endsWith("v") || nicNo.matches("[0-9]+")){
                
                this.nicNo = nicNo;
            }
            
            else {
                
                System.out.println("NIC must contains only numbers or endswith v");
            }
        }
        
        else {
            
            System.out.println("Nic no must contains only 12 characters");
        }
    }
    
}
