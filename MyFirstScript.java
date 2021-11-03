package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstScript {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\NIKH1\\Selenium\\Selenium_Data\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize(); -- method minimize is undefined in Webdriver.window
		//driver.manage().window().close(); -- method close is undefined in Webdriver.window		
		//driver.manage().window().restore(); -- method restore in undefined in Webdriver.window
		driver.quit();
	}

}
