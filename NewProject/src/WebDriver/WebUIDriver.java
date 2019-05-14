package WebDriver;

import org.openqa.selenium.By;

public class WebUIDriver  {
	
	//static WebDriver uiDriver= new InternetExplorerDriver();
	 static WebUIDriver uiDriver= new ChromeDriver();
	public static void launchApplication(String url) {
		
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\msedgedriver.exe");
		
		WebUIDriver.launchApplication(url);
		
	}
	
	

	public static void checkElementPresent(String elementName,int Sec) {
		for(int i=0;i<Sec;i++) {
			uiDriver.findElement(By.xpath(elementName));
		}
		
	}
	private void findElement(By xpath) {
		// TODO Auto-generated method stub
		
	}



	public static void setValue(String elementName,String value) {
		uiDriver.setValue(elementName, value);
		
	}
	
	public static void closeApplication() {
		WebUIDriver.closeApplication();
	}
	
}
