
package com.facebook.pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryClass {

	static WebDriver driver;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	WebElement loginButton;

	public void enterEmail() {
		email.sendKeys("Pune145@gmail.com");
	}

	public void enterPassword() {
		password.sendKeys("Pune14544");
	}

	public void ClickLoginButton() {
		loginButton.click();
	}

	public PageFactoryClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// The initElements method initializes the web elements of the page/component
		// class with the values retrieved from the WebDriver instance, using the
		// @FindBy annotation to locate the elements on the web page
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		// PageFactoryClass pfc= new PageFactoryClass(driver);//this line here will
		// throw an error coz driver instance here is not initiated properly
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		PageFactoryClass pfc= new PageFactoryClass(driver);

		pfc.enterEmail();
		pfc.enterPassword();
		pfc.ClickLoginButton();
	}
}
