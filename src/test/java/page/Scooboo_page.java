package page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scooboo_page {
WebDriver driver;
@FindBy(id="header-search")
WebElement search;
@FindBy(xpath="//*[@id=\"filter-results\"]/ul/li[1]/product-card/div[1]/a/img")
WebElement pen;
@FindBy(xpath="//*[@id=\"product-form-template--15228383133751__main\"]/div[2]/div/button")
WebElement add_to;
@FindBy(xpath="//*[@id=\"filter-results\"]/ul/li[11]/product-card/div[1]/a/img")
WebElement pen2;
@FindBy(xpath="//*[@id=\"filter-results\"]/ul/li[11]/product-card/div[1]/a/img")
WebElement add_to2;
@FindBy(xpath="//*[@id=\"filter-results\"]/ul/li[8]/product-card/div[1]/a/img")
WebElement pen3;
@FindBy(xpath="//*[@id=\"product-form-template--15228383133751__main\"]/div[2]/div/button")
WebElement add_to3;
@FindBy(xpath="//*[@id=\"shopify-section-sections--15228383494199__header\"]/store-header/header/main-menu/details/div/nav/ul/li[3]/details/div/ul/li[6]/a")
WebElement mouse_click;

@FindBy(xpath="//*[@id=\"shopify-section-sections--15228383494199__header\"]/store-header/header/main-menu/details/div/nav/ul/li[3]/details/summary/a")
WebElement hover;
@FindBy(xpath="//*[@id=\"cart-icon\"]")
WebElement cart_icon;
@FindBy(xpath="//*[@id=\"cart-drawer\"]/div[2]/div[2]/button")
WebElement checkout;
@FindBy(xpath="//*[@id=\"email\"]")
WebElement email;
@FindBy(xpath="//*[@id=\"Select0\"]")
WebElement op ;

@FindBy(xpath="//*[@id=\"TextField0\"]")
WebElement first_name;
@FindBy(xpath="//*[@id=\"TextField1\"]")
WebElement last_name;
@FindBy(xpath="//*[@id=\"TextField2\"]")
WebElement address;
@FindBy(xpath="//*[@id=\"TextField4\"]")
WebElement pin;
@FindBy(xpath="//*[@id=\"TextField3\"]")
WebElement city;
@FindBy(xpath="//*[@id=\"TextField5\"]")
WebElement phone ;
@FindBy(xpath="//*[@id=\"shippingAddressForm\"]/div/div[1]/div[5]/div/div/div/div/div/div/div/select")
WebElement flag;


@FindBy(xpath="//*[@id=\"Select1\"]")
WebElement state;
@FindBy(xpath="//*[@id=\"checkout-pay-button\"]")
WebElement pay;
public Scooboo_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void search_bar(String C) {
	search.sendKeys(C,Keys.ENTER);
}
public void Item1() {
	pen.click();
	add_to.click();
}
public void Item2() {
	pen2.click();
	WebElement element=driver.findElement(By.linkText("Add to cart"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments(0),scrollIntoView();", element);
	add_to2.click();
}
public void Item3() {
	pen3.click();
	add_to3.click();
}
public void mouse_hover() {
	Actions act=new Actions(driver);
	act.moveToElement(hover).perform();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
	wait.until(ExpectedConditions.visibilityOf(mouse_click));
	mouse_click.click();
	String title=driver.getTitle();
	System.out.println(title);
}
public void cart() {
	cart_icon.click();
	checkout.click();
}
public void checkout(String E,String N,String L,String AD,String cit,String pi,String num) {
	email.sendKeys(E);
	Select country=new Select(op);
	country.selectByValue("IN");
	first_name.sendKeys(N);
	last_name.sendKeys(L);
	address.sendKeys(AD);
	
	city.sendKeys(cit);
	Select st=new Select(state);
	st.selectByVisibleText("Kerala");
	pin.sendKeys(pi);
	phone.sendKeys(num);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window,scrollBy(0,500)");
	Select sel=new Select(flag);
	sel.selectByValue("IN");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"basic\"]/div/div/div[1]/div/div[1]/span")));
/*Boolean radio=driver.findElement(By.xpath("//*[@id=\\\"basic-Pay Online\\\"]")).isSelected();
if(radio) {
	System.out.println("Pay no is selected");
}
else
{
	System.out.println("Pay now is not selected");
}*/
Boolean same=driver.findElement(By.xpath("//*[@id=\"billing_address_selector-shipping_address\"]")).isSelected();
if(same) {
	System.out.println("Is selected");
}
pay.click();
WebDriverWait waiit=new WebDriverWait(driver, Duration.ofSeconds(2000));
waiit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-container\"]/div[1]/div[1]/span")));
String text=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div[1]/span")).getText();
if(text.equals("Payment Options"))
{
	System.out.println("Completed successfully");
}
else
{
	System.out.println("Not completed");
}
}
}
