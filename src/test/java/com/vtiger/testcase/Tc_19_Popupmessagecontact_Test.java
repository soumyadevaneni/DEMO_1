package com.vtiger.testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_19_Popupmessagecontact_Test extends Browser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Browser  t=new Browser();
		t.OpenBrowser();

		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// driver.findElement(By.xpath("//img[@title=\"Last Viewed\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Send Mail\"]")).click();
		Alert a1= driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
