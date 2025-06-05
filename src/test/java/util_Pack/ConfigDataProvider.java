package util_Pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider 
{

	public Properties pro;
	
	public ConfigDataProvider()
	{
		File src=new File("./config/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
		    pro=new Properties();
		    pro.load(fis);
		   }
		catch(IOException e)
		{
			System.out.println("Not able to load config file >>"+ e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getQaURL()
	{
		return pro.getProperty("QaURL");
	}


}
