import java.util.Arrays;   
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.io.File;
import java.util.Scanner;

/**
* Project Description.
* Module 5 - Project 5
* @author Nicole Mills - CSPC 1220 - Fall
* @version 11.14.21
*/  
public class CloudStorageList {
   // instance fields
   private CloudStorage[] csArray;
   private String[] strArray;
         
    /**
   * Constructor.
   */
   public CloudStorageList() {
      csArray = new CloudStorage[0];
      strArray = new String[0];
   }
   
   // methods
   /**
   * Method.
   * @return array representing cloud storage array.
   */
   public CloudStorage[] getCloudStorageArray() {
      return csArray;
   }
   
   /**
   * Method.
   * @return array representing invalid records.
   */
   public String[] getInvalidRecordsArray() {
      return strArray;
   }
   
   /**
   * Method.
   * @param object for cloud storage object.
   */
   public void addCloudStorage(CloudStorage object) {
      csArray = Arrays.copyOf(csArray, csArray.length + 1);
      csArray[csArray.length - 1] = object; 
   }
   
   /**
   * Method.
   * @param record for string array.
   */
   public void addInvalidRecord(String record) {
      strArray = Arrays.copyOf(strArray,
         strArray.length + 1);
      strArray[strArray.length - 1] = record;
   }
   
   /**
   * Method.
   * @param dataFileName for file input.
   * @throws FileNotFoundException if file not found.
   */
   public void readFile(String dataFileName) throws FileNotFoundException {
   
   // dedicated cloud 
      String name = "";
      double baseStorageCost = 0;
      double serverCost = 0;
   // shared cloud
      double dataStored = 0;
      double dataLimit = 0;
   // default
      String reject = "";
      String x = "";
   
      Scanner scan = new Scanner(new File(dataFileName));
      
      
      while (scan.hasNext()) {
         x = scan.nextLine().trim();
         Scanner scan2 = new Scanner(scan.nextLine().trim());
         scan2.useDelimiter(",");
         
         String type = scan2.next();
         char code =  type.toUpperCase().charAt(0);
         
         switch(code) {
            case 'D':
               try {
                  name = scan2.next().trim();
                  baseStorageCost = Double.parseDouble(scan2.next().trim());
                  serverCost = Double.parseDouble(scan2.next().trim());
               
                  addCloudStorage(new DedicatedCloud(name, baseStorageCost,
                     serverCost));
               }
               catch (NumberFormatException e) {
                  String result = "For input string: " + e;
                  result += x;
                  addInvalidRecord(result);
               }
               
               catch (NoSuchElementException e) {
                  String result = "For missing input data " + e;
                  result += x;
                  addInvalidRecord(result);
               }
               break;
           
            case 'S':
               try {
                  name = scan2.next().trim();
                  baseStorageCost = Double.parseDouble(scan2.next().trim());
                  dataStored = Double.parseDouble(scan2.next().trim());
                  dataLimit = Double.parseDouble(scan2.next().trim());
               
                  addCloudStorage(new SharedCloud(name, baseStorageCost,
                     dataStored, dataLimit));
               }
               catch (NumberFormatException e) {
                  String result = "For input string: " + e;
                  result += x;
                  addInvalidRecord(result);
               }
               
               catch (NoSuchElementException e) {
                  String result = "For missing input data " + e;
                  result += x;
                  addInvalidRecord(result);
               }
               break;
         
            case 'C':
               try {
                  name = scan2.next().trim();
                  baseStorageCost = Double.parseDouble(scan2.next().trim());
                  dataStored = Double.parseDouble(scan2.next().trim());
                  dataLimit = Double.parseDouble(scan2.next().trim());
               
                  addCloudStorage(new PublicCloud(name, baseStorageCost,
                     dataStored, dataLimit));
               }
               catch (NumberFormatException e) {
                  String result = "For input string: " + e;
                  result += x;
                  addInvalidRecord(result);
               }
               
               catch (NoSuchElementException e) {
                  String result = "For missing input data " + e;
                  result += x;
                  addInvalidRecord(result);
               }
               break;
           
            case 'P':
               try {
                  name = scan2.next().trim();
                  baseStorageCost = Double.parseDouble(scan2.next().trim());
                  dataStored = Double.parseDouble(scan2.next().trim());
                  dataLimit = Double.parseDouble(scan2.next().trim());
               
                  addCloudStorage(new PersonalCloud(name, baseStorageCost,
                     dataStored, dataLimit));
               }
               catch (NumberFormatException e) {
                  String result = "For input string: " + e;
                  result += x;
                  addInvalidRecord(result);
               }
               
               catch (NoSuchElementException e) {
                  String result = "For missing input data " + e;
                  result += x;
                  addInvalidRecord(result);
               }
               break;
           
            default:
               try {
                  InvalidCategoryException e = new
                     InvalidCategoryException(type);
                  throw e;
               }
               catch (InvalidCategoryException e) {
                  reject = type + scan2.nextLine().trim();
                  addInvalidRecord(reject); 
               }
               
               break;
         }
      }
   }
   /**
   * Method.
   * @return output of report.
   */
   public String generateReport() {
      String output = "";
      output += "-------------------------------\n";
      output += "Monthly Cloud Storage Report\n";
      output += "-------------------------------\n";
      for (int i = 0; i < csArray.length; i++) {
         output += csArray[i].toString() + "\n";
      }
      return output;
   }
   
   /**
   * Method.
   * @return output of report sorted by name.
   */
   public String generateReportByName() {
      Arrays.sort(csArray);
      String output = "";
      output += "-------------------------------\n";
      output += "Monthly Cloud Storage Report\n";
      output += "-------------------------------\n";
      for (int i = 0; i < csArray.length; i++) {
         output += csArray[i].toString() + "\n";
      }
      return output;
   }
   
   /**
   * Method.
   * @return output of report sorted by monthly cost.
   */
   public String generateReportByMonthlyCost() {
      Arrays.sort(csArray, new MonthlyCostComparator());
      String output = "";
      output += "-------------------------------\n";
      output += "Monthly Cloud Storage Report\n";
      output += "-------------------------------\n";
      for (int i = 0; i < csArray.length; i++) {
         output += csArray[i].toString() + "\n";
      }
      return output;
   }
   
   /**
   * Method.
   * @return output of invalid records report.
   */
   public String generateInvalidRecordsReport() {
      String output = "";
      output += "----------------------\n";
      output += "Invalid Records Report\n";
      output += "----------------------\n";
      for (int i = 0; i < strArray.length; i++) {
         output += "\n" + strArray[i] + "\n";
      }
      return output;
   }
   
   
}