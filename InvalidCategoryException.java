/**
* Project Description.
* Module 6 - Project 6
* @author Nicole Mills - CSPC 1220 - Fall
* @version 11.14.21
*/ 

public class InvalidCategoryException extends Exception {
  /**
   * Constructor.
   * @param categoryIn for category.
   */

   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }

}