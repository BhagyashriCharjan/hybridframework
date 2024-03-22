package com.hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pomclasses.LoginPagePom;

public class HomePageTest {

	public static void main(String[] args) {
		
		LoginPagePom  login = new LoginPagePom();
		login.getUsername();
		
		
		
	}

}
