package ModuleDrivers;

import WebDriver.WebUIDriver;

public class Facebook extends WebUIDriver{
	
	public static void main(String args[]) throws InterruptedException {
		
		String url="https:/www.facebook.com";
		WebUIDriver.launchApplication(url);
		Thread.sleep(2000);
		WebUIDriver.checkElementPresent("//input[@type='email']", 5);
		
		WebUIDriver.setValue("//input[@type='email']", "prasenjit_jb@hotmail.com");
		
		
		
		
		
		
		
		
	}

}
