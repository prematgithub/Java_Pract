package testNGPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class TakeScreenShotOnFailure1     {
	WebDriver driver;
 // Implement the required methods of ITestListener
   
	public void captureScreenShot(ITestResult result) throws Exception {
		
		//Take screen shot using ITestResult
		if(ITestResult.FAILURE==result.getStatus()) {
		    
			//Create reference of takescreenshot and upcast driver to takescreenshot
			TakesScreenshot ts= (TakesScreenshot)driver;
			
			//use getscreenshotAs method to capture screen shot which return in file format hence stored in file format
			File screenShot=ts.getScreenshotAs(OutputType.FILE);
			
			//copy file to specific location
			FileHandler.copy(screenShot, new File("./ScreenShots/"+result.getName()+".png"));
			
			System.out.println(result.getName()+" Screen shot captured");
		}
		

	}

}
