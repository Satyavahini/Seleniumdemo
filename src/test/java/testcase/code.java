package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class code {
	
	WebDriver driver;
	
  @Test @BeforeTest
  public void lunching() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.meesho.com/");
	  
  }
  @Test  @AfterMethod
  public void CrrentUrl() {
	  System.out.println(driver.getCurrentUrl());
  }
  @Test
  public void Title() {
	  System.out.println(driver.getTitle());
	   
  }
  
}
