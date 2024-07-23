package test;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepkg.Justdogs_base;
import page.Justdogs_page;
import utilities.Fbutil;

public class Justdogs_test extends  Justdogs_base{
@Test
public void test() throws TimeoutException{


	Justdogs_page ob=new Justdogs_page(driver);
	ob.registration();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000) );
	
	WebElement text=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/h2"));
	String element=text.getText();
	
	wait.until(ExpectedConditions.visibilityOf(text));
	System.out.println("text is "+element);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	if(element.equals("Login")) {
		String xl="C:\\Users\\charm\\OneDrive\\Documents\\Justdogs_login.xlsx";
		String sheet="Sheet1";
		int rowCount=Fbutil.getRowcount(xl, sheet);
		for(int i=1;i<=rowCount;i++) {
			String E=Fbutil.getcellvaalue(xl, sheet,  i,0);
			String P=Fbutil.getcellvaalue(xl, sheet, i,1);
			ob.login(E, P);
			
		}
		
	}
	else
	{
	String xl="C:\\Users\\charm\\OneDrive\\Documents\\JustDogs.xlsx";
	String sheet="Sheet1";
	int rowCount=Fbutil.getRowcount(xl, sheet);
	for(int i=1;i<=rowCount;i++) {
		String user=Fbutil.getcellvaalue(xl, sheet, i, 0);
		String pass=Fbutil.getcellvaalue(xl, sheet, i,1);
		String Conf=Fbutil.getcellvaalue(xl, sheet, i,2);
		ob.create(user, pass, Conf);
	}
}
}}

