/**
* Project Description.
* Module 4 - Project 4
* @author Nicole Mills - CSPC 1220 - Fall
* @version 09.12.21
*/ 
public class PersonalCloud extends SharedCloud {
// constant variables

/**
* Cost factor for personal cloud.
**/
   public static final double COST_FACTOR = 3.0;
   
/**
* Constructor.
* @param nameIn the name of item.
* @param baseStorageCostIn the base cost.
* @param dataStoredIn for data stored input.
* @param dataLimitIn for limit input.
*/
   public PersonalCloud(String nameIn, double baseStorageCostIn,
      double dataStoredIn, double dataLimitIn) {
   
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }

// methods
/**
* Method.
* @return the cost factor.
*/
   public double getCostFactor() {
      return PersonalCloud.COST_FACTOR; }

/**
* Method.
* @return cost the monthly cost.
*/
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * PersonalCloud.COST_FACTOR;
   }
}