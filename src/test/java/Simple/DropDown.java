package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
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
		  driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("vih");
		 // driver.findElement(By.xpath("//input[@name=\"button\"]")).click();
		     Thread.sleep(2000);
		  WebElement add=driver.findElement(By.xpath("//select[@name=\"industry\"]"));
		  Thread.sleep(2000);
		   Select a1=new Select( add) ; 
		    a1.selectByIndex(2);
		    a1.selectByValue("Government");
		    
		    
			

}}
