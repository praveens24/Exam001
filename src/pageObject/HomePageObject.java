package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
public class HomePageObject {
	final WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	  WebElement searchtxt;
	 @FindBy(className="nav-input")
	  WebElement button;
	 @FindBy(name="sort")
	 WebElement dropdown;
	 @FindBy(partialLinkText="Nikon D4S")
	 WebElement plink;
	 @FindBy(id="productDescription_feature_div")
	 WebElement bodyText;
	public HomePageObject(WebDriver driver)
	 
	{
 
		this.driver = driver;
 
		}

	 public void tentry(String skey)
	 {
		 searchtxt.sendKeys(skey);
	 }  
	 public void sbutton()
	 {
		 button.submit();
	 }    
	 public void selectd(String svalue)
	 {
		 Select se=new Select(dropdown);
		 se.selectByValue(svalue);
	 }
	 public void selectprod()
	 {
		plink.click();
	 }	
	 public String productcontent()
	 {
		 return bodyText.getText();
	 }
	

}
