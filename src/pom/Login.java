package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//Declaration
	@FindBy(id="username")
	private WebElement usn;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	//Initialization
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void username(String name)
	{
		usn.sendKeys(name);
	}
	public void password(String passwrd)
	{
		pwd.sendKeys(passwrd);
	}
	public void login()
	{
		login.click();
	}

}
