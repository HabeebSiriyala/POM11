package com.Test;

import org.testng.annotations.Test;
import com.Page.FbHomePage;
import com.Page.FbLoginPage;
import com.Generic.BaseTest;

public class FBLoginTest extends BaseTest {

	@Test
	public void init() throws Exception {

		
		// driver.get("https://www.facebook.com");
		FbLoginPage loginpage = new FbLoginPage(driver);
		loginpage.setEmail("prasadreddyarts@gmail.com");
		loginpage.setPassword("156565326");
		loginpage.clickOnLoginButton();

		FbHomePage homepage = new FbHomePage(driver);
		homepage.clickOnProfileDropdown();
		// a homepage.verifyLoggedInUserNameText();
		homepage.clickOnLogoutLink();
	}
}
