package util_Pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory
{

	public WebDriver driver;
	
	public static WebDriver startBrowser(WebDriver driver, String browserName, String appURL)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(false);
		driver=new ChromeDriver(options);
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
            //driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			  driver.get(appURL);
	       	//driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			  driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
			return driver;
	}
	
	public static void closeBrowser(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
}
