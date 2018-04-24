package Random;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTestNegative extends First{
  /*@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }*/
  @BeforeClass
  public void beforeClass() {
	  System.out.println("To be printed before starting negative test cases");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("To be printed after ending negative test cases");
  }
  
//EntryHours > 24
 @Test
 public void NTC5() {
	  
	  double result = getFare(3,63,27);
	  System.out.println("NTC5 executed");
	  Assert.assertEquals(11.0, result);
 }
 
 

}
