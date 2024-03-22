package com.hybrid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pomclasses.LoginPagePom;

public class LoginPageTest extends BaseClass{
	
//	LoginPagePom loginPagePom = new LoginPagePom();
	BaseClass baseclass = new BaseClass();
	
	@BeforeClass
	public void setup() {
		baseclass.launchWebsite();
		
	}
	
/*	@AfterClass
	public void tearDown() {
		driver.close();
	}*/
	
	@Test
	public void testTitle() {
		
		
		String webTitle = driver.getTitle();
		System.out.println(webTitle);
		Assert.assertEquals(webTitle, "OrangeHRM");
	}

	@Test
	public void adminLogin() {
		LoginPagePom loginPagePom = new LoginPagePom();
		String uName = loginPagePom.getUsername();
		String pass = loginPagePom.getPassword();
		
		Assert.assertEquals(uName, "Admin");
		Assert.assertEquals(pass, "admin123");
		loginPagePom.setUsername(uName);
		loginPagePom.setPassword(pass);
		loginPagePom.login();
		
	}
}
