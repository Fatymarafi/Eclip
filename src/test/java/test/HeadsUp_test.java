package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.HeadsUp_base;
import page.HeadsUp_page;

public class HeadsUp_test extends HeadsUp_base {
@Test
public void test() throws Exception{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	HeadsUp_page ob=new HeadsUp_page(driver);
	ob.search_bar("Cat wet food");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,900)");
	ob.pdt1();
	js.executeScript("window.scrollBy(0,1200)");
	
	ob.pdt2();
	driver.navigate().back();
	ob.mouse_hover();
	ob.Checkout();
	ob.Details("charmsquare12@gmail.com", "Fathima", "Mohammed", "Obroi Villa","kottyam", "686005", "9097897897");
	
	ob.last();
	ob.pay();
	ob.placed();
	String text=driver.findElement(By.xpath("//*[@id=\"header-wrapper\"]/div/div[1]/div/div[2]/div/div/div[2]")).getText();
	String Actual="Razorpay Trusted Business";
	if(text.equalsIgnoreCase(Actual)) {
		System.out.println("Testing Completed successfully");
	}
}
}
