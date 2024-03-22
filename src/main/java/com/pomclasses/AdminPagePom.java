package com.pomclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;

public class AdminPagePom extends BaseClass{
	
	public AdminPagePom() {
		PageFactory.initElements(driver, this);
	}
	
	//  --Admin
	@FindBy(xpath = "//a[contains(@class,'oxd-main-menu-item active')]")
	private WebElement Admin;
	
	
	// --username
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Username;
	
	//---User Role
	@FindBy(xpath = "(//div[text()='-- Select --'])[1]")
	private WebElement UserRole;
	
	//---employee name
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeeName;
	
	//---status
	@FindBy(xpath = "((//div[text()='-- Select --'])[2]")
	private WebElement Status;
	
	//---Reset button
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement Reset;
	
	//---Search
	@FindBy(xpath = "button[@type='submit']")
	private WebElement search;
	
	//---add+
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement add;
	
	public void setUsername() {
		Username.sendKeys("User1");
	}
	
	public void userRole() {
	act.moveToElement(UserRole).click().sendKeys(Keys.ARROW_DOWN).click().build().perform();
	}
	
	public void employeeName() {
		
	}
	public void status() {
	
	}
	public void resetButton() {
		Reset.click();
	}
	public void searchButton() {
		search.click();
	}
	public void addButton() {
		add.click();
	}
	}
