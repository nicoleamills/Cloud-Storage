//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* Testing.
*/   

public class CloudStorageListTest {


/** Fixture initialization (common initialization
* for all tests). **/
   @Before public void setUp() {
   }
   
    /**
    * Test.
    * @throws FileNotFoundException in case.
    */
   @Test
   public void readFileTest() throws FileNotFoundException {
      CloudStorageList test = new CloudStorageList();
      test.readFile("cloud_storage_data_1.csv");
      
   }
   
}