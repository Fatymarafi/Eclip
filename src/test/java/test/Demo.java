package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
ChromeDriver d;
@BeforeTest
public void setup() {
	d=new ChromeDriver();
	d.get("https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html");
}
@Test
public void test() {
	
}
}
