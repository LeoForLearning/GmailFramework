package EmailLogin;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {
	
public String[][] read(String path) throws IOException {
		
		String row[][] = new String[10][10];
		try
		{
			FileInputStream inputStream = new FileInputStream(path);
			
			XSSFWorkbook Wbook=new XSSFWorkbook(inputStream);
			XSSFSheet firstSheet = Wbook.getSheetAt(0);
	
				for(int i=1;i<=firstSheet.getLastRowNum();i++)
				{
				Row r = firstSheet.getRow(i);
					for(int j=0;j<r.getPhysicalNumberOfCells();j++)
					{
						row[i-1][j] = r.getCell(j).getStringCellValue();	
					}
				}
		}
		catch (IOException e) {
			e.printStackTrace();
		
		}
		return row;
	}
	
	
	public void entervalue(WebDriver driver,String val, By locator)
	{
		driver.findElement(locator).sendKeys(val);
	}
	
	
	public String getText (WebDriver driver, By locator)
	{
		String text=driver.findElement(locator).getText();
		System.out.println(driver.findElement(locator).getText());
		return text;
	}
	
	public void click(WebDriver driver,By locator)
	{
		driver.findElement(locator).click();
	} 
	
	public String EnterText(WebDriver driver,By locator, String text)
	{
		driver.findElement(locator).sendKeys(text);
		return text;
	} 
	
	
}

