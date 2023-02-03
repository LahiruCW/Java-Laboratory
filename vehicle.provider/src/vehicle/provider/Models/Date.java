package vehicle.provider.Models;

/**
 *
 * @author LahiruCW
 */

import java.util.Calendar;

public class Date {
    
    private int date;
    private int month;
    private int year;
    
    //get the current year
    Calendar calendar = Calendar.getInstance();
    int currentYear = calendar.get(Calendar.YEAR);

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(int date) {
        if(date <= 31 && date > 0){
            
            this.date = date;
        }
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        
        if(month <= 12 && month > 0){
            
            this.month = month;
        }
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        
        if(year >= currentYear){
            
            this.year = year;
        }
        
        else {
            
            System.out.println("Year can not be minimum than current year!");
        }
        this.year = year;
    }
    
    
}
