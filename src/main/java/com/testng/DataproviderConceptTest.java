package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataproviderConceptTest {
	@Test(dataProvider="morning")
	public void orangelogin(String data1,String data2) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data2);
	}
	
	@DataProvider(name="morning")
	public Object usa()
	{
		return new Object[][] {{"Admin","admin123"},{"rama","krishna"}};
	}
}
