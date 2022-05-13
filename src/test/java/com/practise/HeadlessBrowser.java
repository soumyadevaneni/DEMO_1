package com.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\KCSM12\\DEMO_MAVEN_Project\\chromedriver.exe");
  
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.amazon.in/");
	}

}
