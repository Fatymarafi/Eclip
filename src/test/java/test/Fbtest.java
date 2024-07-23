package test;

import org.testng.annotations.Test;

import basepkg.Fbbase;
import page.Fbpage;
import utilities.Fbutil;

public class Fbtest extends Fbbase {
@Test
public void test() {
	Fbpage ob=new Fbpage(driver);
	driver.navigate().refresh();
	String xl="C:\\Users\\charm\\OneDrive\\Documents\\Datadriven.xlsx";
	String sheet="Sheet1";
	int rowCount=Fbutil.getRowcount(xl, sheet);
	for(int i=1;i<=rowCount;i++) {
		String UserN=Fbutil.getcellvaalue(xl, sheet, i, 0);
		String P=Fbutil.getcellvaalue(xl, sheet, i, 1);
		ob.S(UserN, P);
		ob.Button();
		
	}
}
}
