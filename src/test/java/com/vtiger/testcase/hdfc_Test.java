package com.vtiger.testcase;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hdfc_Test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
       // driver.manage().window().minimize();
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@version=\"1.0\"]")).click();
		driver.findElement(By.xpath("//img[@ class=\"closeSummer\"]")).click();
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']/descendant::li[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[.='Select Product']")).click();
		driver.findElement(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]/descendant::li[text()='Salary Accounts']")).click();
	}
		 	}


