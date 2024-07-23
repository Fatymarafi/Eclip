package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Justdogs_base {
protected static WebDriver driver;
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.justdogsstore.com");
    driver.manage().window().maximize();
}
}
