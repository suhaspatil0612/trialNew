package base_Pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import util_Pack.BrowserFactory;
import util_Pack.ConfigDataProvider;

public class BaseClass 
{
	
	public WebDriver driver;
	public ConfigDataProvider config;
	
   public void setUp1()
   {
	   driver=BrowserFactory.startBrowser(driver, config.getBrowser(), config.getQaURL());
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
   }
   
   @BeforeSuite
    public void setUpSuite()
   {
      config=new ConfigDataProvider();
   }
	


}
