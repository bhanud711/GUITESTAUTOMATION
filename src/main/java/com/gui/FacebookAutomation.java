package com.gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
WebDriver driver1=new ChromeDriver();
//driver.get("https://www.facebook.com/");
driver.navigate().to("https://www.facebook.com/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());	
	driver.navigate().refresh();
	driver.navigate().back();
	System.out.println("Clicked on back arrow");
	driver.navigate().forward();
	
		
		
		
		
	}

}
