package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Verification {
	
	public void verify_title(WebDriver driver,WebElement ele)
	{
		try
		{
			WebDriverWait wait =new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			Reporter.log("Title is matching",true);
		}catch(Exception e)
		{
			Reporter.log("Title is not matching",true);
			
			Assert.fail();
		}
	}

}
