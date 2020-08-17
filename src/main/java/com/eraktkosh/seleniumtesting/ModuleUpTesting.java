package com.eraktkosh.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ModuleUpTesting {
	
	@Test
	public void moduleUpTesting() throws InterruptedException {
		WebDriver driver = null;
		try {
		
		//To Access via chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Project\\EclipseWorkspace\\CDAC\\eRaktkosh_selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//To Access via FireFox
		//System.setProperty("webdriver.gecko.driver", "D:\\Project\\EclipseWorkspace\\CDAC\\eRaktkosh_selenium\\geckodriver-v0.27.0\\geckodriver.exe");
		//driver=new FirefoxDriver();
		   
		
		driver.get("http://10.10.10.78:8380/eRaktKosh/hissso/loginLogin");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
		int waittime = 2100;
		Thread.sleep(waittime);
		driver.findElement(By.xpath("//*[@id=\'form-username\']")).sendKeys("user_one");
		driver.findElement(By.xpath("//*[@id=\'form-username form-password\']")).sendKeys("bld@123");
		Thread.sleep(waittime);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/input[1]")).click();	
		Thread.sleep(waittime);
		driver.findElement(By.xpath("/html/body/form/div[1]/div[3]/div[1]/div/div/ul/li[1]/a")).click();	
		Thread.sleep(waittime);
		driver.switchTo().frame(driver.findElement(By.id("frmMainMenu")));
		Thread.sleep(waittime);
		driver.findElement(By.xpath("//*[@id=\'Online_Requistion_Raising\']")).click();
		Thread.sleep(waittime);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/form/div[1]/div[3]/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(waittime);
		driver.switchTo().frame(driver.findElement(By.id("frmMainMenu")));
		//driver.findElement(By.xpath("//*[@id=\'Donor_Registration\']")).click();
		driver.findElement(By.xpath("//*[@id=\'Donor_Registration_New\']")).click();
		// //*[@id="Donor_Registration_New"]
		Thread.sleep(waittime);
		driver.switchTo().defaultContent();
		//myTabDrop1
		driver.findElement(By.id("myTabDrop1")).click();
		Thread.sleep(waittime);
		driver.findElement(By.xpath("//*[@id=\'myTabDrop1-contents\']/li[4]/a")).click();
		// //*[@id="myTabDrop1-contents"]/li[4]/a
		
		// //*[@id="myTabDrop1-contents"]/li[8]/a
		// /html/body/form/div[1]/div[3]/div[1]/div/div/ul/li[5]/ul/li[8]/a
		// //*[@id="menuList"]/li[8]/a 
		
		// /html/body/form/div[1]/div[3]/div[1]/div/div/ul/li[8]/a
		// /html/body/form/div[1]/div[3]/div[1]/div/div/ul/li[5]/ul/li[8]/a
		Thread.sleep(waittime);
		driver.switchTo().frame(driver.findElement(By.id("frmMainMenu")));
		Thread.sleep(waittime);
		driver.findElement(By.xpath("//*[@id=\'Cash_Collection_Desk\']")).click();
		System.out.println(driver.getTitle());
		//driver.close();
		//driver.quit();
		
		}catch (Exception e){
	       System.out.println("Caught message " + e.getMessage());
	       //driver.close();
	       //driver.quit();
	    }
	}
	//*[@id="Online_Requistion_Raising"]

	
}
