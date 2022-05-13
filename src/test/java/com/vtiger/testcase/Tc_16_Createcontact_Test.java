package com.vtiger.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;
import com.vtiger.generic.TestData;

public class Tc_16_Createcontact_Test  extends Browser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Browser  t=new Browser();
		t.OpenBrowser();
	   driver.manage().window().maximize();
  	  driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
  	  Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='Contacts']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
      Thread.sleep(2000);
      TestData  testdata=new TestData();
      String firstname=testdata.getFirstName();

      driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(firstname);
      Thread.sleep(2000);

      driver.findElement(By.xpath("//img[@title=\"Last Viewed\"]")).click();
      Thread.sleep(2000);

      driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
      driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
