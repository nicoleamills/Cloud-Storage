
import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Testing.
*/   

public class MonthlyCostComparatorTest {


/** Fixture initialization (common initialization
* for all tests). **/
   @Before public void setUp() {
   }
   
   /** Tests compare. **/
   @Test public void compareTest() {
      CloudStorage c1 = new DedicatedCloud("First Test", 25.0, 20.0);
      CloudStorage c2 = new SharedCloud("Second Test", 30.0, 9.0, 30.0);
      
      MonthlyCostComparator test = new MonthlyCostComparator();
      Assert.assertEquals(1, test.compare(c1, c2), 0);
      Assert.assertEquals(-1, test.compare(c2, c1), 0);
   }
}