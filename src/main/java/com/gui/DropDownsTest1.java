package com.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
Select s=new Select(year);
s.selectByVisibleText("2008");
//Handling Month DropDown
WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
Select p=new Select(month);
p.selectByVisibleText("August");
	}

}
