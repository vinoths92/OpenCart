package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
@FindBy(xpath="//input[@id='input-email']")
WebElement txtLogin;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPwd;

@FindBy(xpath="//input[@value='Login']")
WebElement btnLogin;


public void setEmail(String email) {
	txtLogin.sendKeys(email);
	
}

public void setPassword(String pwd) {
	txtPwd.sendKeys(pwd);
}

public void btnsubmit() {
	btnLogin.click();
}



}