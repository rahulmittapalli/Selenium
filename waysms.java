package com.hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class waysms {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/rahul/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.findElement(By.name("username")).sendKeys("7989754212");
		driver.findElement(By.id("password")).sendKeys("sumanthrahul");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[3]/div/input[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		for (int i=0;i<driver.findElements(By.tagName("iframe")).size();i++)
//		{
//			System.out.println(driver.findElements(By.tagName("iframe")).get(i).getText());
//		}
		driver.switchTo().frame(driver.findElement(By.id("frame")));
		driver.findElement(By.xpath("//*[@class='m91']")).click();
		WebElement number=driver.findElement(By.xpath("//*[@id='mobile']"));
		number.sendKeys("8500280910");
		Thread.sleep(2000);
		WebElement message=driver.findElement(By.xpath(".//*[@id='message']"));
		message.sendKeys("Hi chetan .This is Rahul");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Send']")).click();
				
	}

}
