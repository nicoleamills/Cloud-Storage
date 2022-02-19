/**
* Project Description.
* Module 4 - Project 4
* @author Nicole Mills - CSPC 1220 - Fall
* @version 09.12.21
*/ 
public class PublicCloud extends SharedCloud {
// constant variables 
/**
* The cost factor for public cloud.
*/
   public static final double COST_FACTOR = 2.0;
   
/**
* Constructor.
* @param nameIn the name of item.
* @param baseStorageCostIn the base cost input.
* @param dataStoredIn the data stored input.
* @param dataLimitIn the data stored input.
*/
   public PublicCloud(String nameIn, double baseStorageCostIn,
      double dataStoredIn, double dataLimitIn) {
   
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }

//methods
/**
* Method.
* @return PublicCloud.COST_FACTOR the cost factor of cloud storage.
*/
   public double getCostFactor() {
      return PublicCloud.COST_FACTOR; }

/**
* Method.
* @return cost the monthly cost of cloud storage.
*/
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * PublicCloud.COST_FACTOR;
   }
}