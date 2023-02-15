package com.gui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		al.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		al.sendKeys("rama");
		al.accept();
	}

}
