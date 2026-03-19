package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
public HomePage(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement lnkmyAccount;

@FindBy(xpath="//a[text()='Register']")
WebElement lnkRegister;

@FindBy(xpath="//a[text()='Login']")
WebElement clkLoginbtn;

public void clickMyAccount() {
	lnkmyAccount.click();
}
public void clickRegister() {
	lnkRegister.click();

}

public void clickLogin() {
	clkLoginbtn.click();
}
}
