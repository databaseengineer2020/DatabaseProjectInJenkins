package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class LoginPage extends TestBase {
	
	 WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}

		//Element Library
			@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME_FIELD;
			@FindBy(how = How.XPATH, using = "//input[@id = 'password']") WebElement PASSWORD_FIELD;
			@FindBy(how = How.XPATH, using = "//button[@name = 'login']") WebElement SIGNIN_BUTTON_FIELD;

			//Interactive Methods1
			public void enterUserName(String userName) {
				USERNAME_FIELD.sendKeys(userName);
			}
			
			public void enterPassword(String password) {
				PASSWORD_FIELD.sendKeys(password);
			}
			
			public void enterCredentials(String userName, String password ) {
				USERNAME_FIELD.sendKeys(userName);
				PASSWORD_FIELD.sendKeys(password);
			}
			
			public void clickOnSignInButton() {
				SIGNIN_BUTTON_FIELD.click();
			}
			
			public String getPageTittle() {
				return driver.getTitle();
				
			}

}
