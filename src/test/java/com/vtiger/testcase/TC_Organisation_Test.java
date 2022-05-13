package com.vtiger.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.sun.org.apache.bcel.internal.generic.Select;
import com.vtiger.generic.TestData;
import com.vtiger.generic.WebDriverUtil;
public class TC_Organisation_Test  extends Browser  {

	public static void main(String[] args) throws Throwable  {
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
    String OrganizationName=testdata.getOrganizationName	();
    driver.findElement(By.name("accountname")).sendKeys(OrganizationName);
    
    driver.findElement(By.name("button")) 
      .click();
    Thread.sleep(2000);
       
    driver.findElement(By.xpath("//td[@class=\"tabSelected\"]"))
   .click();
  WebElement av=  driver.findElement(By.name("search_text"));
  av.sendKeys(OrganizationName);
    driver.findElement(By.name("search_field")).click();
	WebElement dr=driver.findElement(By.name( "search_field"));
	   w.selectValuefromdd(dr, 1);
	   driver.findElement(By.name("submit")).click();
	 String a=  driver.findElement(By.name("submit")).getText();
	String text = OrganizationName;
	System.out.println(text);
	    if(OrganizationName.equalsIgnoreCase(text))
	    {
	    	System.out.println("verified successfully");
	    }
	    else
	    {
	    	System.out.println("name not matched or not created ");
	    }
	}
	   
		  }
		 
	

				
	


