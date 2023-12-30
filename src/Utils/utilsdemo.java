package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilsdemo {
	public static WebDriver driver;
    
  public static void launchApp(String url) 
  {
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.get(url);
	  }
	
  public static void closeApp()
  {
	
	driver.close();
}
  
  
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	