package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Demo1;

public class Demo1test {
WebDriver driver;
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.automationexercise.com/login");
	driver.manage().window().maximize();
}
@Test 
public void test() {
	Demo1 ob=new Demo1(driver);
	ob.signup("Fathima", "fathimamauhammedrafi@gmail.com");
	ob.clickk();
	ob.reg("fathimarafi", "Fathima", "Mohammed", "Sharafiya", "keral","Kottayam", "6487","87357845238");
}
}
