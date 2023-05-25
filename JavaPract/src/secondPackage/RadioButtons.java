package secondPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//Thread.sleep(20000);
		//1st way
		/*driver.findElement(By.xpath("//input[@value='1']")).click(); //female is selected
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='2']")).click(); //male is selected
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='-1']")).click(); //custom is selected*/
		
		//2nd way
		/*Thread.sleep(10000);
		List<WebElement> radios= driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.size());
		System.out.println(radios.get(2).isSelected()); ///true
		System.out.println(radios.get(0).isEnabled());
		System.out.println(radios.get(1).isDisplayed());
		radios.get(1).click();
		System.out.println(radios.get(2).isSelected());*/
		
		//3rd way
		Thread.sleep(10000);
		List<WebElement> radios1= driver.findElements(By.xpath("//label[@class='_58mt']"));
		String RadioValue="male";
		for(int i=0;i<radios1.size();i++) {
			if(radios1.get(i).getText().equalsIgnoreCase(RadioValue)) {
				radios1.get(i).click();
				System.out.println(" is RadioValue selected "+radios1.get(i).isSelected()); 
				break;
			}
		}
		
		// CHECK boX
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		Thread.sleep(3000);
		List<WebElement> brands= driver.findElements(By.xpath("//div[@id='s-refinements']/div[5]/ul/li"));
		System.out.println(brands.size());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
