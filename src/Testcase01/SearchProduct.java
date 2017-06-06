package Testcase01;
import java.util.concurrent.TimeUnit;
import pageObject.HomePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SearchProduct {
	
	static WebDriver driver;
	HomePageObject HomePage;
  
  @BeforeMethod
 
  public void beforeMethod() {
 
	  String Firefoxdriverpath = "C:\\selenium-2.49.1\\selenium-java-3.4.0\\geckodriver-v0.16.1-win64\\geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", Firefoxdriverpath);
	  driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      HomePage = PageFactory.initElements(driver, HomePageObject.class);
  }
 
  @Test
 
  public void test()throws InterruptedException {
 
HomePage.tentry("Nikon");
HomePage.sbutton();
Thread.sleep(3000);
HomePage.selectd("price-desc-rank");
Thread.sleep(3000);
HomePage.selectprod();
String p=HomePage.productcontent();
Assert.assertTrue(p.contains("Nikon D3X"), "Nikon D3X is not Found the Expected"); 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
	  driver.quit();
 
  }

}

