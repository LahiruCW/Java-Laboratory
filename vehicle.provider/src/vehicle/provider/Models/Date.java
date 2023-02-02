package vehicle.provider.Models;

/**
 *
 * @author LahiruCW
 */
public class Date {
    
    private int date;
    private int month;
    private int year;

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
        this.year = year;
    }
    
    
}
