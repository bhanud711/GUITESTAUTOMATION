package com.gui;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookTextBoxes {
	public static WebDriver driver;
	public static int i=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		FacebookTextBoxes ft=new FacebookTextBoxes();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		ft.snap();
		Actions a=new Actions(driver);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		a.keyDown(Keys.SHIFT).sendKeys(email, "ramarao").keyUp(Keys.SHIFT).sendKeys("hello").build().perform();
		ft.snap();
		
	}
	
	public void snap() throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(".//IMAGES//pic"+i+".png");
		FileUtils.copyFile(src, dest);
		}
	}

}
