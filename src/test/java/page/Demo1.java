package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
WebDriver driver;
@FindBy(xpath = "//input[@name='name']")
WebElement name;
@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
WebElement email;

@FindBy(xpath="//*[@id=\\\"form\\\"]/div/div/div[3]/div/form/button")
WebElement Button1;

@FindBy(xpath="//*[@id=\\\"id_gender2\\\"]")
WebElement Gender;
@FindBy(xpath="//*[@id=\\\"password\\\"]")
WebElement Password;
@FindBy(xpath="//*[@id=\\\"days\\\"]")
WebElement Day;
@FindBy(xpath="//*[@id=\\\"months\\\"]")
WebElement Month;
@FindBy(xpath="//*[@id=\\\"years\\\"]")
WebElement Year;
@FindBy(xpath="//*[@id=\\\"first_name\\\"]")
WebElement Firstname;
@FindBy(xpath="//*[@id=\\\"last_name\\\"]")
WebElement lastname;
@FindBy(xpath="//*[@id=\\\"address1\\\"]")
WebElement Address;
@FindBy(xpath="//*[@id=\\\"country\\\"]")
WebElement Country;
@FindBy(xpath="//*[@id=\\\"state\\\"]")
WebElement State;
@FindBy(xpath="//*[@id=\\\"city\\\"]")
WebElement Ditrict ;
@FindBy(xpath="//*[@id=\\\"zipcode\\\"]")
WebElement Zip;
@FindBy(xpath="//*[@id=\\\"mobile_number\\\"]")
WebElement Mobile;
@FindBy(xpath="//*[@id=\\\"form\\\"]/div/div/div/div[1]/form/button")
WebElement Button2;
public Demo1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void signup(String N,String E) {
	name.sendKeys(N);
	email.sendKeys(E);
}
public void clickk() {
	Button1.click();
}
public void reg(String Pass,String first,String last,String add,String st,String dis,String zip,String mob) {
	Gender.click();
	Password.sendKeys(Pass);
	Select day=new Select(Day);
	day.selectByValue("9");
   Select month=new Select(Month);
	month.selectByValue("12");
Select year=new Select(Year);
year.selectByValue("1999");
 Firstname.sendKeys(first);
 lastname.sendKeys(last);
 Address.sendKeys(add);
 State.sendKeys(st);
 Ditrict.sendKeys(dis);
 Zip.sendKeys(zip);
 Mobile.sendKeys(mob);
 Button2.click();
}
}
