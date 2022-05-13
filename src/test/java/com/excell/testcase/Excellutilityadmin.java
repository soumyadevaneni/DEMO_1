package com.excell.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.generic.excelutility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excellutilityadmin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver();
       WebDriver driver=new ChromeDriver();
       driver.get("http://localhost:8888");
        excelutility excelUtility = new excelutility();
         String un=excelUtility.readDatafromExcel("sheet1",0,0);
         int pwd=excelUtility.readNumbericDatafromExcel("sheet1", 1, 0);
         System.out.println(un);
         System.out.println(pwd);
         int intvalue=(int)Math.round(pwd);
         System.out.println(pwd);
         String password=Integer.toString(intvalue);
         driver.findElement(By.name("user_name")).sendKeys(un);
         driver.findElement(By.name("user_password")).sendKeys(password);
         
	}

}
