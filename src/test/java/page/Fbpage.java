package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpage {
WebDriver driver;
@FindBy(name="email") WebElement email;
@FindBy(name="pass") WebElement password;
@FindBy(name="login")WebElement login;
public Fbpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public void S(String UN,String P) {
	email.sendKeys(UN);
	password.sendKeys(P);
}
public void Button() {
	login.click();
}
}
