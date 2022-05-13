package com.vtiger.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		 driver.get("https://www.flipkart.com");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		// driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		 WebElement ddAddr=driver.findElement(By.name("q"));
	   ddAddr.sendKeys("redmi note 10 pro");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	   Thread.sleep(2000);
	   String s=driver.findElement(By.xpath("//div[.='REDMI Note 10 Pro (Dark Nebula, 128 GB)']")).getText();
	   
	 System.out.println(s);
         // String str=driver.findElement(By.xpath("//div[.='REDMI Note 10 Pro (Dark Nebula, 128 GB)']/ancestor::div[@class=\"_1AtVbE col-12-12\"]")).getText();
		String str=driver.findElement(By.xpath("//div[text()='₹16,999']/ancestor::div[@class='_13oc-S']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();

          String newprice=str.replaceAll("[^a-zA-Z0-9]","");
          System.out.println(newprice);
          driver.close();
  		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();

          driver1.get("https://www.amazon.in/");
         // WebElement dda=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
          //    dda.sendKeys("redmi note 10 pro");
              Thread.sleep(2000);
           driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 10 pro");
           driver1.findElement(By.id("nav-search-submit-button")).click();
           Thread.sleep(2000);
           String am=driver1.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).getText();
           System.out.println(am);
           Thread.sleep(2000);
           String ad=driver1.findElement(By.xpath("//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-2\"]//span[@class=\"a-price-whole\"]")).getText();
          
           Thread.sleep(2000);
          String newprice2=ad.replaceAll("[^a-zA-Z0-9]","");
          //System.out.println(newprice2);
          Thread.sleep(2000);

          int a=Integer.parseInt(newprice);
          int b=Integer.parseInt(newprice2);
          System.out.println(a);
          System.out.println(b);
          if(a>=b)
          {
        	  System.out.println("amazon is cheaper");
          }
          else {
        	  System.out.println("flipkart is cheaper");
          }
           
	}

}
