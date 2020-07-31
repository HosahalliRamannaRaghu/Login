package generic;

import java.io.File;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	public static void snapshot(WebDriver driver,String tcname) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String d1=d.toString();
		String date=d1.replaceAll(":","-");
		String photo="./screenshots/";
		File dst=new File(photo+date+" "+tcname+".jpeg");
		Files.copy(src,dst);
	}

}
