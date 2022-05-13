package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.generic.JavaUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement sw=driver.findElement(By.name("mobile"));
		  sw.sendKeys("7032814919");
		  driver.findElement(By.xpath("//div[@class=\"_25qBi _2-hTu\"]")).click();
		  Thread.sleep(2000);
		  
		WebElement aw=  driver.findElement(By.id("otp"));
		     aw.sendKeys("");
	driver.findElement(By.xpath("//a[@class=\"a-ayg\"]")).click();
  
	
	}

}
