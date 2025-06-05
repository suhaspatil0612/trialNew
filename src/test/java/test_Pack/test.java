package test_Pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_Pack.BaseClass;



public class test extends BaseClass
{
	
	@BeforeClass
	public void setup() throws InterruptedException {
		setUp1();
		
	}

	@Test
	public void aepsFileDownload() throws InterruptedException {

	
        
	}
	
	@AfterClass
	public void logoutFromAeps() throws InterruptedException {
		
	}
	
}

