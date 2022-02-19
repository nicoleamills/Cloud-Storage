import java.text.DecimalFormat;
/**
* Project Description.
* Module 4 - Project 4
* @author Nicole Mills - CSPC 1220 - Fall
* @version 09.12.21
*/ 
public class SharedCloud extends CloudStorage {

// instance variables
   protected double dataStored;
   protected double dataLimit;
   
/**
* The cost factor for shared cloud.
*/
   public static final double COST_FACTOR = 1.0;

/**
* Constructor.
* @param nameIn the name of item.
* @param baseStorageCostIn the base cost.
* @param dataStoredIn the data stored.
* @param dataLimitIn the data stored.
*/
//constructor
   public SharedCloud(String nameIn, double baseStorageCostIn,
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn);
      dataStored = dataStoredIn;
      dataLimit = dataLimitIn;
   }

//methods
/**
* Method.
* @return dataLimit the amount of data stored.
*/
   public double getDataStored() {
      return dataStored;
   }
   
/**
* Method.
* @param dataStoredIn the amount of data.
*/
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   }
   
/**
* Method.
* @return dataLimit the limit of cloud storage.
*/
   public double getDataLimit() {
      return dataLimit;
   }
   
/**
* Method.
* @param dataLimitIn the limit of cloud storage.
*/
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
   
/**
* Method.
* @return sharedCloud.COST_FACTOR the cost factor of cloud storage.
*/
   public double getCostFactor() {
      return SharedCloud.COST_FACTOR; }

/**
* Method.
* @return over if the overage is greater than 0.
*/
   public double dataOverage() {
      double over = dataStored - dataLimit;
      if (over < 0) {
         return 0.0;
      }
      else {
         return over;
      }   
   }

/**
* Method.
* @return cost the monthly cost of cloud storage.
*/
   public double monthlyCost() {
      double cost = baseStorageCost + dataOverage() * SharedCloud.COST_FACTOR;
      return cost;
   }
   
/**
* Method.
* @return output of cloud storage data.
*/

   public String toString() {
      DecimalFormat dataFormat = new DecimalFormat("0.000");
   
      String output = super.toString();
   
      output += "\nData Stored: " + dataFormat.format(getDataStored()) + " GB\n"
         + "Data Limit: " + dataFormat.format(getDataLimit()) + " GB\n"
         + "Overage: " + dataFormat.format(dataOverage()) + " GB\n"
         + "Cost Factor: " + getCostFactor();
      return output;
   }


}

