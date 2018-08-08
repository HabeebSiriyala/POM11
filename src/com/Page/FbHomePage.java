package com.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbHomePage {

	static WebDriver driver;

	@FindBy(id="userNavigationLabel")
	private WebElement profileDropdown;

	@FindBy(xpath = "//span[@class='_54nh'][text()='Log Out']")
	private WebElement logoutLink;

	public FbHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// This method to click on Profile Dropdown
	public void clickOnProfileDropdown() {
		profileDropdown.click();
	}

	// This method to click on Logout link
	public void clickOnLogoutLink() {
		logoutLink.click();
	}

}
