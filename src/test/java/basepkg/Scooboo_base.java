package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Scooboo_base {
protected static WebDriver driver;
@BeforeTest
public void Setup() {
	driver=new ChromeDriver();
	driver.get("https://scooboo.in/");
	driver.manage().window().maximize();
	
}
}
