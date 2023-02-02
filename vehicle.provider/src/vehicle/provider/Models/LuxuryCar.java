package vehicle.provider.Models;

/**
 *
 * @author LahiruCW
 */

public class LuxuryCar extends Vehicle{
    
    private int noBmw;
    private int noMercedezeBenz;
    
    //constructors
    public LuxuryCar(){
        
        this.noBmw = 3;
        this.noMercedezeBenz = 2;
    }

    /**
     * @return the noBmw
     */
    public int getNoBmw() {
        return noBmw;
    }

    /**
     * @param noBmw the noBmw to set
     */
    
    //assumption - new bmws not brought by the provider
    public void setNoBmw(int noBmw) {
        if(noBmw <= 3){
            
            this.noBmw = noBmw;
        }
    }

    /**
     * @return the noMercedezeBenz
     */
    public int getNoMercedezeBenz() {
        return noMercedezeBenz;
    }

    /**
     * @param noMercedezeBenz the noMercedezeBenz to set
     */
    public void setNoMercedezeBenz(int noMercedezeBenz) {
        if(noMercedezeBenz <= 2){
            
            this.noMercedezeBenz = noMercedezeBenz;
        }
    }
}
