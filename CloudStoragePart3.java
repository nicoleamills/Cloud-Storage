import java.io.FileNotFoundException;
   
/**
* Project Description.
* Module 6 - Project 6
* @author Nicole Mills - CSPC 1220 - Fall
* @version 11.14.21
*/ 

public class CloudStoragePart3 {
  /**
   * Main method for running the program.
   * @param args no args used.
   */
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("File name expected as "
               + "commmand line argument.");
         System.out.println("Program ending.");
      }
      else {
         String dataFileName = args[0];
         
         try {
         
            CloudStorageList test = new CloudStorageList();
         
            test.readFile(dataFileName);
         
            System.out.println(test.generateReport() + "\n");     
            System.out.println(test.generateReportByName() + "\n");
            System.out.println(test.generateReportByMonthlyCost() + "\n");
            System.out.println(test.generateInvalidRecordsReport());
         }
         catch (FileNotFoundException e) {
            System.out.println("*** Attempted to read file: " + dataFileName
               + " (No such file or directory)");
         }
      }
   }
}