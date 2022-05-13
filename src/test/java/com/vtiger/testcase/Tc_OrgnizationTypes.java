package com.vtiger.testcase;

import org.openqa.selenium.By;

import com.vtiger.generic.TestData;
import com.vtiger.generic.WebDriverUtil;

public class Tc_OrgnizationTypes extends Browser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Browser b=new Browser();
		b.OpenBrowser();
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
	  	  Thread.sleep(2000);
	  	WebDriverUtil w=new WebDriverUtil(driver);
                w.maxwindow();

		         w.pageloadtimeout();
driver.findElement(By.xpath("//a[text()='Organizations']")).click();
driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
TestData  testdata=new TestData();
String OrganizationName=testdata.getOrganizationName();
driver.findElement(By.name("accountname")).sendKeys(OrganizationName);
Thread.sleep(2000);
driver.findElement(By.name("button")).click();
Thread.sleep(2000);
 

	}

}
      