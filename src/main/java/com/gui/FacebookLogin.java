package com.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rama");
//driver.findElement(By.name("email")).sendKeys("rama");
driver.findElement(By.id("pass")).sendKeys("Alpha@54654574");
driver.findElement(By.name("login")).click();

	}

}
