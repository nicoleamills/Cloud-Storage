import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* Testing.
*/   
public class CloudStoragePart2Test {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests main method. 
    * @throws FileNotFoundException if the file cannot be opened.
   **/
   @Test public void mainMethod() throws FileNotFoundException {
      CloudStoragePart2 vPart2Obj = new CloudStoragePart2(); // test constructor
      CloudStorage.resetCount();
      
      String[] args = {"cloud_storage_data_1.csv"};
      CloudStoragePart2.main(args);
      
      Assert.assertEquals(3, CloudStorage.getCount());
   }
}