package com.vtiger.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Icc_cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com");	
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class=\"mobile-banner__close js-mobile-banner-close\"]")).click();
        Actions ac=new Actions(driver);
    //
        WebElement a=driver.findElement(By.xpath(""));
        
	}}
