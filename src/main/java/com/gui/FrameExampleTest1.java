package com.gui;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameExampleTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		//1st approach
		//driver.switchTo().frame("frame1");
		//2nd approch
		WebElement boarder1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(boarder1);
		WebElement box1 = driver.findElement(By.xpath("//b[@id='topic']/following::input"));
		box1.sendKeys("rama");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement all = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(all);
		s.selectByVisibleText("Avatar");
		List<WebElement> opt = s.getOptions();
		Iterator<WebElement> it = opt.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		driver.switchTo().defaultContent();
		
		//Handling nested frame 
		
		driver.switchTo().frame("frame1").switchTo().frame("frame3");
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
		checkbox.click();
	}

}
