package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fbutil {
public static String getcellvaalue(String xl,String sheet,int r,int c) {
	try {
		FileInputStream file=new FileInputStream(xl);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
		if(cell.getCellType()==CellType.STRING) {
			return  cell.getStringCellValue();
		}
		else
		{
			return cell.getRawValue();
			/* double v=cell.getNUmericCellValue();
			 * int val=(int)v;
			 * return String.valueOf(val);	
			 */
		}
	} catch (Exception e) {
return "";	}
}
public static int getRowcount(String xl,String sheet) {
	try {
		FileInputStream file=new FileInputStream(xl);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		return wb.getSheet(sheet).getLastRowNum();
		
	} catch (Exception e) {
return 0;	}
}
}
