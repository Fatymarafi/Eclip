package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HeadsUp_page {
WebDriver driver;
@FindBy(xpath="//*[@id=\"huftproductsearch\"]")
WebElement search;
@FindBy(xpath="//*[@class='st-product-wrap st-double-child'][4]/div/figure/a/img[1]")
WebElement item1;
@FindBy(xpath="//*[@id=\"st-searchModal\"]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div[4]/div/div[2]/div[5]/span/span")
WebElement c;
@FindBy(xpath="//*[@id=\"st-searchModal\"]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div[11]/div/div[2]/div[5]/span/span")
WebElement c2;
@FindBy(xpath="//*[@id=\"st-searchModal\"]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div[11]/div/figure/a/img[1]")
WebElement item2;
@FindBy(xpath="//*[@id=\"product-form-template--15568578248766__main\"]/div[3]/div[2]/div/button")
WebElement cart2;
@FindBy(xpath="//*[@id=\"menu\"]/ul/li[3]")
WebElement mouse;
@FindBy(xpath="//*[@id=\"menu\"]/ul/li[3]/div/div/div/div[1]/a/img")
WebElement rabbit;
@FindBy(xpath="//*[@id=\"product-grid\"]/li[1]/div[1]/div/a/div/img")
WebElement item3;
@FindBy(xpath="//*[@id=\"product-grid\"]/li[1]/div[2]/product-form/form/div/button[1]")
WebElement itemc;
@FindBy(xpath="//*[@id=\"cart-icon-bubble\"]/img")
WebElement check;
@FindBy(xpath = "//*[@id=\"CartDrawer-Checkout\"]")
WebElement che;
@FindBy(xpath="//*[@id=\"checkout_email\"]")
WebElement email;
@FindBy(xpath="//*[@id=\"checkout_buyer_accepts_marketing\"]")
WebElement checkbox1;
@FindBy(xpath="//*[@id=\"checkout_shipping_address_first_name\"]")
WebElement firstname;
@FindBy(xpath="//*[@id=\"checkout_shipping_address_last_name\"]")
WebElement lastname;
@FindBy(xpath="//*[@id=\"checkout_shipping_address_address1\"]")
WebElement address;
@FindBy(xpath="//*[@id=\"checkout_shipping_address_city\"]")
WebElement city;
@FindBy(xpath="//*[@id=\"checkout_shipping_address_province\"]")
WebElement state;
@FindBy(xpath="//*[@id=\"checkout_shipping_address_zip\"]")
WebElement pin;
@FindBy(xpath = "//*[@id=\"checkout_shipping_address_phone\"]")
WebElement phone;
@FindBy(xpath="//*[@id=\"continue_button\"]")
WebElement shipping;
@FindBy (xpath = "//*[@id=\"checkout_shipping_rate_id_shopify-cards20upi20net20banking-0_00\"]")
WebElement card;
@FindBy(xpath = "//*[@id=\"continue_button\"]")
WebElement button;
@FindBy(xpath = "//*[@id=\"continue_button\"]/span")
WebElement order;
public HeadsUp_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void search_bar(String B) {
	search.sendKeys(B,Keys.ENTER);
}
public void pdt1() {
	c.click();
	
}
public void pdt2() {
	
	c2.click();
}
public void mouse_hover() throws InterruptedException {
	Actions act=new Actions(driver);
	act.moveToElement(mouse).perform();
	rabbit.click();
	Thread.sleep(500);
	itemc.click();
}
public void Checkout() {
	check.click();
	che.click();
}
public void Details(String E,String F,String L,String AD,String C,String P,String Ph) {
email.sendKeys(E);	
if(checkbox1.isSelected()) {
	checkbox1.click();
}
firstname.sendKeys(F);
lastname.sendKeys(L);
address.sendKeys(AD);
city.sendKeys(C);
Select statee=new Select(state);
statee.selectByVisibleText("Kerala");
pin.sendKeys(P);
phone.sendKeys(Ph);


}
public void last() {
	shipping.click();
}
public void pay() {
	if(card.isSelected()) {
		System.out.println("Card payment");
	}
	button.click();
	
}
public void placed() {
	order.click();
}

}
