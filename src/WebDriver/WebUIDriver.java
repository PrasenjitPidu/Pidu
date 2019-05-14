package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebUIDriver  {
	
	//static WebDriver uiDriver= new InternetExplorerDriver();
	static WebDriver uiDriver= new ChromeDriver();
	public static void launchApplication(String url) {
		
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\msedgedriver.exe");
		
		WebUIDriver.launchApplication(url);
		uiDriver.manage().window().maximize();
	}
	
	public static void checkElementPresent(String elementName,int Sec) {
		for(int i=0;i<Sec;i++) {
			uiDriver.findElement(By.xpath(elementName));
		}
		
	}
	public static void setValue(String elementName,String value) {
		uiDriver.findElement(By.xpath(elementName)).sendKeys(value);
		
	}
	
	public static void closeApplication() {
		uiDriver.close();
	}
	
}
