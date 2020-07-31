package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.Generic_launch;
import pom.Login;

public class Testlogin extends Generic_launch {
	
	@Test
	public void login()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Login lp=new Login(driver);
		
		lp.username("admin");
		
		lp.password("manager");
		
		lp.login();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("acti"));
		
	}

}
