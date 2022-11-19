package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class cases1 {
  @Test
  public void testcase() {
	  System.out.println("TRY");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("case 1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("case 2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("case 11");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("case 22");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("case 111");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("case 222");
  }

}
