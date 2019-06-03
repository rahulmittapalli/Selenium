package com.hello;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users/rahul/Downloads/geckodriver-v0.15.0-win64/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin#identifier");
		driver.findElement(By.id("Email")).sendKeys("email");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("password");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='WaidBe']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@name='to']")).click();
		driver.findElement(By.xpath(".//*[@name='to']")).sendKeys("rahul.mittapalli@mobigesture.com");
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("testing script");
		driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).sendKeys("Hello World");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='gb_9a gbii']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		
	}

}
