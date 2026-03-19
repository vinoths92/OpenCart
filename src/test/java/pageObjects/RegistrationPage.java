package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
public RegistrationPage(WebDriver driver) {
	super(driver);
	
}

@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstName;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastName;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtConfirmPassword;

@FindBy(xpath="//input[@name='agree']")
WebElement checkPolicy;

@FindBy(xpath="//input[@type='submit']")
WebElement btnClick;

@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;

public void setFirstName(String firstName) {
	txtFirstName.sendKeys(firstName);
	
}
public void setLastName(String lastName) {
	txtLastName.sendKeys(lastName);

}
public void setEmail(String email) {
	txtEmail.sendKeys(email);

}
public void setTelephone(String phoneNum) {
	txtTelephone.sendKeys(phoneNum);

}
public void setPassword(String Password) {
	txtPassword.sendKeys(Password);

}

public void setConfirmPwd(String confirmPwd) {
	txtConfirmPassword.sendKeys(confirmPwd);

}
public void clickPrivatePolicy() {
	checkPolicy.click();

}
public void clickSubmit() {
	btnClick.click();

}

public String getMessageConfirmation() {
	try {
	return(msgConfirmation.getText());
	}
catch(Exception e ) {
	return(e.getMessage());
}
}

}
