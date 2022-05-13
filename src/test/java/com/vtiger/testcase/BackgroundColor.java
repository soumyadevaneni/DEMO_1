package com.vtiger.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackgroundColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.facebook.com");
		driver.manage().window().maximize();
		 WebElement   E=driver.findElement(By.name("login"));
		   String backColor= E.getCssValue("background-color");
		   System.out.println(backColor);
		String hexBackColor=   Color.fromString(backColor).asHex();
		System.out.println(hexBackColor);
		if(hexBackColor.equals("#1877f2")) {
			System.out.println("Test  passed");
		}
		else {
			System.out.println("Test failed");
		}
	}

}