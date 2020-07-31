package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_launch {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void Open_Appln()
	{		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	}
	
	
	@AfterMethod
	public void Close_Appln(ITestResult res) throws Exception
	{
		int status = res.getStatus();
		System.out.println(status);
		
		String tcname = res.getName();
		System.out.println(tcname);
		
		if(status==2 || status==3)
		{
			Screenshot.snapshot(driver,tcname);
			
			System.out.println("Screenshot Done");
		}
		
		
		
		driver.quit();
	}

}
