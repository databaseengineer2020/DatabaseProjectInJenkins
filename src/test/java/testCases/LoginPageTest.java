package testCases;

import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.DatabasePage;
import page.LoginPage;

public class LoginPageTest extends TestBase {
	
LoginPage LoginpageObj;
	
	
	@BeforeMethod
	public void setUp() {
		initializeDriver() ;
		LoginpageObj = PageFactory.initElements(driver, LoginPage.class);
	}
	
	
	@Test(priority =1)
	public void LoginTest() throws InterruptedException, ClassNotFoundException, SQLException{
//		LoginpageObj.enterUserName("demo@techfios.com");
		//LoginpageObj.enterPassword("abc123");
		//LoginpageObj.clickOnSignInButton();
		
		LoginpageObj.enterUserName(DatabasePage.getData("userName"));
		LoginpageObj.enterPassword(DatabasePage.getData("password"));
		LoginpageObj.clickOnSignInButton();
		Thread.sleep(3000);
		
	}
	
	
	
	@Test(priority =2)
	public void LoginPageTittleTest() throws InterruptedException {
		LoginpageObj.enterUserName("demo@techfios.com");
		LoginpageObj.enterPassword("abc123");
		LoginpageObj.clickOnSignInButton();
		Thread.sleep(2000);
		
		String exceptedTittle = "Dashboard- iBilling";
		String actualTittle = LoginpageObj.getPageTittle();
		Assert.assertEquals(actualTittle, exceptedTittle, "DashboardPage Not Found!");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
