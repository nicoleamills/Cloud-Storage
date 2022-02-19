import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* Testing.
*/   

public class CloudStoragePart3Test {
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests main method. 
    * @throws FileNotFoundException if the file cannot be opened.
   **/
   @Test public void mainMethod() throws FileNotFoundException {
   
      CloudStoragePart3 vPart3Obj = new CloudStoragePart3();
      CloudStorage.resetCount();
      
      //test that works
      String[] args = {"cloud_storage_data_2_exceptions.csv"};
      CloudStoragePart3.main(args);
      
      Assert.assertEquals(3, CloudStorage.getCount());
      
      CloudStorage.resetCount();
      
      //bad file name
      args[0] = "error.txt";
      CloudStoragePart3.main(args);
      
      Assert.assertEquals(0, CloudStorage.getCount());
      
      CloudStorage.resetCount();
      
      //no file
      args[0] = "";
      CloudStoragePart3.main(args);
      
      Assert.assertEquals(0, CloudStorage.getCount());
   }
}