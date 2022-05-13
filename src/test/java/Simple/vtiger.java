package Simple;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class vtiger {
      @Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
	WebElement dda=	driver.findElement(By.xpath("//input[@name=\"user_name\"]"));
	dda.sendKeys("admin");
     WebElement dda1= driver.findElement(By.xpath("//input[@name=\"user_password\"]"));
      dda1.sendKeys("admin");
        Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
	  driver.findElement(By.xpath("//a[text()=\"Organizations\"]")).click();
	  driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
	  driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("vihavs");
	  driver.findElement(By.xpath("//input[@name=\"button\"]")).click();
	     Thread.sleep(2000);
	      
	     //Actions ac = new Actions(driver);
	     //ac.moveToElement(dda).perform();
	   String add=  driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]")).getText();
	    if(add.contains("vihavs" ))
	    {
	    	System.out.println("verified");
	    }
	    else {
	    	System.out.println("not verified");
	    }
	   // Actions ac = new Actions(driver);
	    // ac.moveToElement(dda).perform();

	    driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	    
		
	}
		 
	  
	}


