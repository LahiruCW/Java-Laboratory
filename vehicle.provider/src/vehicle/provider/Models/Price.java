package vehicle.provider.Models;

import java.util.HashMap;

/**
 *
 * @author LahiruCW
 */
public class Price {
    
    private final HashMap<String, Integer> prices;
    
    //create the construtor
    public Price() {
        
        this.prices = new HashMap<>();
        
        //initializing prices
        prices.put("Land Rover", 5000);
        prices.put("Land Crusier", 12000);
        
        prices.put("BMW", 13000);
        prices.put("Mercedes Benz", 20000);
    }
    
    //getter method
    public int getPrices(HashMap<String, Integer> price, String modelName){
        
        return price.get(modelName);
    }
}
