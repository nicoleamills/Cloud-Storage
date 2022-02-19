import java.text.DecimalFormat;
/**
* Project Description.
* Module 4 - Project 4
* @author Nicole Mills - CSPC 1220 - Fall
* @version 09.12.21
*/  

public abstract class CloudStorage implements Comparable<CloudStorage> {

// instance variabales
   protected String name;
   protected double baseStorageCost;

// class variables
   protected static int count;

/**
* Constructor.
* @param nameIn for the name input.
* @param baseStorageCostIn the price.
*/

   public CloudStorage(String nameIn, double baseStorageCostIn) {
      name = nameIn;
      baseStorageCost = baseStorageCostIn;
      count++;
   }

// methods
/**
* Method.
* @return name for cloud storage.
*/
   public String getName() {
      return name;
   }

/**
* Method.
* @param nameIn the name for cloud storage.
*/
   public void setName(String nameIn) {
      name = nameIn;
   }

/**
* Method.
* @return baseStorageCost cost of cloud storage.
*/
   public double getBaseStorageCost() {
      return baseStorageCost;
   }

/**
* Method.
* @param baseStorageCostIn cost of cloud storage.
*/

   public void setBaseStorageCost(double baseStorageCostIn) {
      baseStorageCost = baseStorageCostIn;
   }

/**
* Method.
* @return count number of cloud storage objects.
*/
   public static int getCount() {
      return count;
   }

/**
* Method.
*/
   public static void resetCount() {
      count = 0;
   }

/**
* Method.
* @return output of cloud storage data.
*/
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
   
      String output = name + " (" + this.getClass() + ") "
         + "Monthly Cost: "
         + costFormat.format(monthlyCost()) + "\n"
         + "Base Storage Cost: "
         + costFormat.format(getBaseStorageCost());
   
      return output;
   }
/**
* Method.
* @return monthlyCost the monthly cost of the service.
*/
   public abstract double monthlyCost();

/**
* Method.
* @param object for cloud storage.
* @return int of result of string.
*/   
   public int compareTo(CloudStorage object) {
      return this.toString().toLowerCase().compareTo(object.toString()
         .toLowerCase());
   }
}