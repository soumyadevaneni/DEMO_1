package com.vtiger.testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_18_sendingmailcontact_Test extends Browser {

	public static void main(String[] args) throws Throwable  {
		Browser  t=new Browser();
		t.OpenBrowser();
  	  driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
      driver.findElement(By.xpath("//a[text()='Contacts']")).click();
      //driver.findElement(By.xpath("//img[@title=\"Last Viewed\"]")).click();
      driver.findElement(By.xpath("//table[@class='lvt small']//tr[3]//td[3]/a")).click();
     driver.findElement(By.xpath("//a[text()='Send Mail']")).click();
     driver.findElement(By.xpath("//a[text()='More Information']")).click();
     driver.findElement(By.xpath("//a[text()='Email']")).click();
     //driver.findElement(By.xpath("//a[text()='Compose']")).click();
     driver.findElement(By.xpath("//a[text()='Contacts']")).click();
     Thread.sleep(2000);

     driver.findElement(By.xpath("//a[text()='soumyalatha07@gmail.com']")).click();
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
    // driver.findElement(By.id("1")).click();
     driver.findElement(By.name("subject")).sendKeys("ABCD");
    // driver.close();
     Thread.sleep(2000);
     driver.findElement(By.name("Send")).click();
     Thread.sleep(2000);
     Alert al=driver.switchTo().alert();
     al.accept();
     

     
     
     //driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
     //driver.findElement(By.xpath("//a[text()='Email']")).click();
     //driver.findElement(By.xpath("//b[text()='Tyss' ]")).click();

     //driver.findElement(By.xpath("//input[@name=\"Send\"]")).click();


}}
