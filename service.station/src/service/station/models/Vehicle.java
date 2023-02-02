/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.station.models;

/**
 *
 * @author LahiruCW
 */
public class Vehicle {
    
    //member variables
    private String currentStatus;
    private String plateNo;
    private String paid;
    private Customer customer;
    private String[] requestedStatus;
    private String[][] statusCompleteMap;
    private String[][] statusCompletePaid;
    private Price price;

    /**
     * @return the currentStatus
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * @param currentStatus the currentStatus to set
     */
    public void setCurrentStatus(String currentStatus) {
        
        for(Status record: Status.values()){
            
            if(currentStatus.equalsIgnoreCase(record.name())){
               
               this.currentStatus = currentStatus; 
            }
        }
        
    }

    /**
     * @return the plateNo
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * @param plateNo the plateNo to set
     */
    public void setPlateNo(String plateNo) {
        //plate number can not be empty
        this.plateNo = plateNo;
    }

    /**
     * @return the paid
     */
    public String getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(String paid) {
        this.paid = paid;
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
     * @return the requestedStatus
     */
    public String[] getRequestedStatus() {
        return requestedStatus;
    }

    /**
     * @param requestedStatus the requestedStatus to set
     */
    public void setRequestedStatus(String[] requestedStatus) {
        this.requestedStatus = requestedStatus;
    }

    /**
     * @return the statusCompleteMap
     */
    public String[][] getStatusCompleteMap() {
        return statusCompleteMap;
    }

    /**
     * @param statusCompleteMap the statusCompleteMap to set
     */
    public void setStatusCompleteMap(String[][] statusCompleteMap) {
        this.statusCompleteMap = statusCompleteMap;
    }

    /**
     * @return the statusCompletePaid
     */
    public String[][] getStatusCompletePaid() {
        return statusCompletePaid;
    }

    /**
     * @param statusCompletePaid the statusCompletePaid to set
     */
    public void setStatusCompletePaid(String[][] statusCompletePaid) {
        this.statusCompletePaid = statusCompletePaid;
    }

    /**
     * @return the price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Price price) {
        this.price = price;
    }
    
    
}
