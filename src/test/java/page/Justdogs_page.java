package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Justdogs_page {
WebDriver driver;
@FindBy(xpath="/html/body/div[2]/header/div/div[2]/div/div/div[3]/div[3]/a/span[2]")
WebElement registration_button;
@FindBy(xpath="/html/body/div[6]/div[3]/a")
WebElement create;
@FindBy(xpath="//*[@id=\"reg_email\"]")

WebElement email;
@FindBy(xpath="//*[@id=\"reg_password\"]")
WebElement pass ;
@FindBy(xpath="//*[@id=\"reg_confirm_password\"]")
WebElement confirm;
@FindBy(xpath="//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
WebElement reg_button;
@FindBy(name="username")
WebElement login_user;
@FindBy(name="password")
WebElement login_pass;
@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
WebElement login_button ;

@FindBy(xpath="/html/body/div[2]/header/div/div[2]/div/div/div[2]/div/form/input[1]")
WebElement Search;

@FindBy(xpath="//*[@id=\"snize-product-4502\"]/a/div/div/span/img")
WebElement item_1 ;
@FindBy(xpath="//*[@id=\"snize-product-107462\"]/a/div/div/span/img")
WebElement item_2;
@FindBy(xpath="//*[@id=\"product-4502\"]/div[1]/div[2]/div/div/div[2]/div/form/table/tbody/tr/td/div[1]/div[2]/span")
WebElement item_1_kg;
@FindBy(xpath="//*[@id=\"product-4502\"]/div[1]/div[2]/div/div/div[2]/div/form/div/div[2]/button[1]")
WebElement item_1_cart;
@FindBy(xpath="//*[@id=\"product-107462\"]/div[1]/div[2]/div/div/div[2]/div/form/table/tbody/tr/td/div[1]/div[1]/span")
WebElement item_2_kg;
@FindBy(xpath="//*[@id=\"product-107462\"]/div[1]/div[2]/div/div/div[2]/div/form/div/div[2]/button[1]")
WebElement item_2_cart;
@FindBy(xpath="/html/body/div[2]/div[1]/div/div/div/div[3]/div[2]/a/span[1]")
WebElement cart_button;

@FindBy(xpath="/html/body/div[5]/div[2]/div/div[2]/p[2]/a[1]")
		WebElement view_cart;
@FindBy(xpath="//*[@id=\"post-8\"]/div/div[1]/div[1]/div[2]/div/div/div/a")
WebElement checkout;
@FindBy(xpath="//*[@id=\"payment_method_cod\"]")
WebElement cod;
@FindBy(xpath="//*[@id=\"terms\"]")
WebElement terms;
@FindBy(xpath="//*[@id=\"billing_first_name\"]")
WebElement firstname;

public Justdogs_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void search(String S) {
	Search.sendKeys(S,Keys.ENTER);
}
public void registration() {
	registration_button.click();
	create.click();
}
public void create(String S,String P,String CP) {
	email.sendKeys(S);
	pass.sendKeys(P);
	confirm.sendKeys(CP);
	if(pass==confirm) {
	reg_button.click();
	}else {
		System.out.println("Password didn't match");
	}
	
}
public void login(String E,String P) {
	login_user.sendKeys(E);
	login_pass.sendKeys(P);
	login_button.click();
}
public void item1() {
	item_1.click();
	item_1_kg.click();
	item_1_cart.click();
}
public void item2() {
	item_2.click();
	item_2_kg.click();
	item_2_cart.click();
}
public void cart() {
	cart_button.click();
	view_cart.click();
    checkout.click();
}
public void COD() {
	if(!cod.isSelected()) {
	cod.click();
		
	}
	}


public void termsC() {
	if(!terms.isSelected()) {
		terms.click();
	}
}



}
