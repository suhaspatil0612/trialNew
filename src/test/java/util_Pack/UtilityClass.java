//package util_Pack;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//import base_Pack.BaseClass;
//
//public class UtilityClass extends BaseClass{
//
//	public void selectAdjustmentReport() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		WebElement fileType=driver.findElement(By.xpath("//select[@name=\"filetype\"]"));
//		fileType.click();
//		Select abc=new Select(fileType);
//		abc.selectByVisibleText("Adjustment Report");
//		System.out.println("Adjustment Report selected from dropdown");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("searchBtn")).click();
//		Thread.sleep(2000);
//
//	}
//
//	
//	public void selectTimeOutReport() throws InterruptedException {
//
//		Thread.sleep(1000);
//		WebElement fileType=driver.findElement(By.xpath("//select[@id='filetype']"));
//		Select abc=new Select(fileType);
//		abc.selectByVisibleText("Time Out Report");
//		System.out.println("Time Out Report selected from dropdown");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("searchBtn")).click();
//		Thread.sleep(2000);
//
//	}
//
//	public  void selectRawaData() throws InterruptedException {
//
//		Thread.sleep(1000);
//		WebElement fileType=driver.findElement(By.xpath("//select[@id='filetype']"));
//		Select abc=new Select(fileType);
//		abc.selectByVisibleText("RAW Data");
//		System.out.println("Raw Data selected from dropdown");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("searchBtn")).click();
//		Thread.sleep(2000);
//
//	}
//
//	public  void selectNTSLFile() throws InterruptedException {
//
//		Thread.sleep(1000);
//		WebElement fileType=driver.findElement(By.xpath("//select[@id='filetype']"));
//		Select abc=new Select(fileType);
//		abc.selectByVisibleText("NTSL file");
//		System.out.println("NTSL file selected from dropdown");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("searchBtn")).click();
//		Thread.sleep(2000);
//}
//
//	
//}
