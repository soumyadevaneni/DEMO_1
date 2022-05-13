package com.vtiger.testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Test {
 public static void main(String []args) throws Throwable  {
	 
	 WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
	 
	 driver.get("https://www.flipkart.com");
	 driver.findElement(By.xpath("//button[.='✕']")).click();
	// driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	 WebElement ddAddr=driver.findElement(By.name("q"));
   ddAddr.sendKeys("mobiles");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[.='POCO M3 Pro 5G (Yellow, 64 GB)']/ancestor::div[@class=\"_2kHMtA\"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"]")).click();
   Set<String>AllWindowHandles=driver.getWindowHandles();
   System.out.println(AllWindowHandles);
   Iterator<String>iterator=AllWindowHandles.iterator();
   AllWindowHandles.iterator();
   String ParentWindow=iterator.next();
   System.out.println("ParentWindow"+driver.getTitle());
   String ChildWindow=iterator.next();
   System.out.println("ChildWindow"+driver.getTitle());
   //For Switch To child window
   driver.switchTo().window(ChildWindow);
    WebElement v= driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]"));
    System.out.println(v.getText());
 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();

 driver.switchTo().window(ParentWindow);
	Thread.sleep(2000);
//	d.findElement(By.xpath("//span[.='Cart']")).click();   //span[.='Cart']
 driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[.='Cart']")).click();
	Thread.sleep(2000);
	 WebElement add = driver.findElement(By.xpath("//button[text()='+']"));
   Point loc = add.getLocation();
	JavascriptExecutor jse=(JavascriptExecutor)driver;
 jse.executeScript("window.scrollBy"+loc);
 
  add.click();
  Thread.sleep(4000);
  WebElement val2 = driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']"));
  System.out.println("After adding: "+val2.getText());
  driver.quit();
 
   
   
   
}}
