package com.hybrid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.util.Utility;

public class BaseClass {
		
	public static WebDriver driver;
	public static Actions act;
	
		public void launchWebsite() {
			
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
	  //	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
			
			Utility.setImplicitWait(10);

		}
		
		public void getAction() {
			Actions act = new Actions(driver);
		
		}

}
