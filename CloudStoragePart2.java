import java.io.FileNotFoundException;

   /**
* Project Description.
* Module 5 - Project 5
* @author Nicole Mills - CSPC 1220 - Fall
* @version 11.14.21
*/ 

public class CloudStoragePart2 {
   /**
   * Main method.
   * @param args not used.
   * @throws FileNotFoundException just in case.
   */
   public static void main(String[] args) throws FileNotFoundException {
      CloudStorageList csl = new CloudStorageList();
      csl.readFile("cloud_storage_data_1.csv");
      
      if (args.length == 0) {
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
      else {
         String dataFileName = args[0];
         System.out.println(csl.generateReport());
         System.out.println(csl.generateReportByName());
         System.out.println(csl.generateReportByMonthlyCost());
      }
   
   }
}