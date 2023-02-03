package vehicle.provider.Models;

/**
 *
 * @author LahiruCW
 */

public class Agreement {
    
    private Vehicle[] vehicles;
    private Customer customer;
    private Date dateOfRent;
    private Date expireDate;
    private int deposit;
    
    //constructor
    public Agreement(Customer customer, Vehicle vehicle[], Date dateOfRent,
            Date expireDate, int deposit){
        
        setCustomer(customer);
        setVehicle(vehicle);
        setDateOfRent(dateOfRent);
        setExpireDate(expireDate);
        setDeposit(deposit);
    }

    /**
     * @return the vehicle
     */
    public Vehicle[] getVehicle() {
        return vehicles;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle[] vehicle) {
        this.vehicles = vehicle;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the dateOfRent
     */
    public Date getDateOfRent() {
        return dateOfRent;
    }

    /**
     * @param dateOfRent the dateOfRent to set
     */
    public void setDateOfRent(Date dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    /**
     * @return the expireDate
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * @return the deposit
     */
    public int getDeposit() {
        return deposit;
    }

    /**
     * @param deposit the deposit to set
     */
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
    
}
