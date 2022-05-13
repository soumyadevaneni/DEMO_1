package com.vtiger.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_17_viewcontact_test  extends Browser{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Browser  t=new Browser();
		t.OpenBrowser();
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	//	driver.findElement(By.xpath("//img[@title=\"Last Viewed\"]")).click();
		//driver.findElement(By.xpath("//div[@id=\"tracker\"]//table[@class='hdrNameBg']//tr[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='lvt small']//tr[3]//td[3]/a")).click();
		
		driver.findElement(By.xpath("//a[@title=\"Contacts\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Duplicate\"]")).click();
		driver.findElement(By.xpath("//input[@accesskey=\"S\"]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();


	}

}
