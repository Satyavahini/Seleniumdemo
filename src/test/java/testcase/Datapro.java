package testcase;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Datapro {
	public class dataprovider {
		
		WebDriver driver;
			
			 @BeforeClass
		  public void openbroswer() {
				 WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 }

  @Test(dataProvider = "Multiinput")
  @Parameters({"Product"})
  public void search(String value, String expected) {
	  driver.get("https://www.amazon.in/");
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(value);
	  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

	  
  }

  @DataProvider
  public Object[][] Multiinput() {
    return new Object[][]{ {"Realme","Realme Buy original product|Amazon.in "},{"Redmi","Redmi Buy original product|Amazon.in"},{"Vivo","Vivo Buy original product|Amazon.in"}};
     
    
  }
	}
}

