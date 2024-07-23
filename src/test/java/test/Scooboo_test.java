package test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import basepkg.Scooboo_base;
import page.Scooboo_page;

public class Scooboo_test extends Scooboo_base{
	
	@Test(priority = 1)
	public void test() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Scooboo_page ob=new Scooboo_page(driver);
		
	ob.search_bar("Calligraphy pen");
	ob.Item1();
	driver.navigate().back();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window,scrollBy(0,1000)");
	ob.Item3();
	}
	@Test(priority = 2)
	public void test1() {
		Scooboo_page ob=new Scooboo_page(driver);
		
		ob.mouse_hover();
	}
	@Test(priority = 3)
	public void test3() throws Exception {
		Scooboo_page ob=new Scooboo_page(driver);
		
		ob.cart();
		Thread.sleep(500);
		ob.checkout("charmsquare12@gmail.com", "Mehar","Zainab", "Obroi","Kottayam","686005","9037481818");
		
	}
	@AfterTest
	public void tear() {
		driver.quit();
	}
	
}
