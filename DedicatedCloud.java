import java.text.DecimalFormat;
/**
* Project Description.
* Module 4 - Project 4
* @author Nicole Mills - CSPC 1220 - Fall
* @version 09.12.21
*/ 
public class DedicatedCloud extends CloudStorage {

// instance variables
   private double serverCost;

/**
* Constructor.
* @param nameIn the name of item.
* @param baseStorageCostIn the base cost.
* @param serverCostIn the server cost.
*/

   public DedicatedCloud(String nameIn, double baseStorageCostIn,
      double serverCostIn) {
      super(nameIn, baseStorageCostIn);
      serverCost = serverCostIn;
   }

//methods
/**
* Method.
* @return serverCost the server cost.
*/
   public double getServerCost() {
      return serverCost;
   }
   
/**
* Method.
* @param serverCostIn the server cost.
*/
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
   
/**
* Method.
* @return total of the monthly cost.
*/
   public double monthlyCost() {
      double total = baseStorageCost + serverCost;
      return total;
   }
   
/**
* Method.
* @return output of cloud storage data.
*/
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
      String output = super.toString();
      output += "\nServer Cost: " + costFormat.format(serverCost);
      return output;
   }
  
}