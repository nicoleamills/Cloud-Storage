import java.util.Comparator;

/**
* Project Description.
* Module 5 - Project 5
* @author Nicole Mills - CSPC 1220 - Fall
* @version 11.14.21
*/  

public class MonthlyCostComparator implements Comparator<CloudStorage> {
   
   /**
   * Method.
   * @param c1 for first cloud storage object.
   * @param c2 for second cloud storage object.
   * @return int order.
   */
   public int compare(CloudStorage c1, CloudStorage c2) {
      if (c1.monthlyCost() > c2.monthlyCost()) {
         return 1;
      }
      else if (c1.monthlyCost() < c2.monthlyCost()) {
         return -1;
      }
      else {
         return 0;
      }
   }
}