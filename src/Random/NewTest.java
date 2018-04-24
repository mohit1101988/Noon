package Random;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends First {
  
  // Age < 60 & Night Time Discount
  @Test
  public void TC1() {
	  
	  double result = getFare(3,54,4);
	  System.out.println("TC1 executed");
	  Assert.assertEquals(11.0, result);
  }
  
  //Age > 60 & Night Time Discount
  @Test
  public void TC2() {
	  
	  double result = getFare(3,63,4);
	  System.out.println("TC2 executed");
	  Assert.assertEquals(11.0, result);
  }
  
  // Age < 60 & Peak Time Charges
  @Test
  public void TC3() {
	  
	  double result = getFare(3,54,9);
	  System.out.println("TC3 executed");
	  Assert.assertEquals(11.0, result);
  }
  
  // Age > 60 & Peak Time Charges
  @Test
  public void TC4() {
	  
	  double result = getFare(3,63,9);
	  System.out.println("TC4 executed");
	  Assert.assertEquals(11.0, result);
  }
  
  /*@Test(DataProvider = "getData")
  public void TC5() {
	  
	  double result = getFare(3,63,9);
	  Assert.assertEquals(11.0, result);
  }
  
  @DataProvider
  public int[][] getData(int age,int stops, int entryhours){
	  return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }*/
  
  
  @BeforeMethod
  public void beforetestscript() {
	  
	  System.out.println("To be printed before start of each test case");
  }
  
  @AfterMethod
  public void aftertestscript() {
  	  
  	  System.out.println("To be printed after end of each test case");
    }
  
  @BeforeSuite
  public void beforeteststarted() {
	  
	  System.out.println("To be printed before start of testing");
  }
  
  @AfterMethod
  public void afterteststarted() {
  	  
  	  System.out.println("To be printed after end of testing");
    }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("To be printed before starting positive test cases");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("To be printed after ending positive test cases");
  }
  
  
  
 

}
