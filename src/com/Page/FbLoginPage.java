package com.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {

	
	 @FindBy(xpath="//input[@type='email'][@name='email']")
	 WebElement emailTextBox;
	 @FindBy(xpath="//input[@type='password'][@name='pass']")
	 WebElement passwordTextBox;
	 @FindBy(xpath="//input[@type='submit'][@id='u_0_2']")
	  WebElement signinButton;
	 


	public FbLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// This method is to set Email in the email text box
	public void setEmail(String Email) {
		emailTextBox.sendKeys(Email);
	}

	// This method is to set Password in the password text box
	public void setPassword(String Password) {
		passwordTextBox.sendKeys(Password);
	}

	// This method is to click on Login Button
	public void clickOnLoginButton() {
		signinButton.click();
	}
}
