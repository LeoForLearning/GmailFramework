package EmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {	

	public void login(WebDriver driver,String[][] value,By locator1,By locator2, By locator3,int testCaseNo) throws InterruptedException
	{
		Utility u = new Utility();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		u.entervalue(driver, value[testCaseNo][0], locator1);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
		u.click(driver, locator3);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
		//u.entervalue(driver, value[testCaseNo][1], locator2);
		Thread.sleep(1000);
		
	}


	
}