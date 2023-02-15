package com.gui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandlingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement table=driver.findElement(By.xpath("//table[@id='webtable']/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		outer:
		for(int i=1;i<rows.size();i++)
		{
		List<WebElement> coloumns=rows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<coloumns.size();j++)
		{
		String value=coloumns.get(j).getText();
        if(value.equals("google.com"))
        {
        	System.out.println(coloumns.get(2).getText());
        	break outer;
        }
		}	
		}
	}

}
