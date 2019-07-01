package EmailLogin;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import EmailLogin.Elements;



public class ImplementationTest extends Elements  {
	

	
	@Test
	public void run() throws IOException, InterruptedException
	{
	
		Utility utility = new Utility();
	    LoginPage loginpage = new LoginPage();
	    int testCaseNo = 20;
	    String values[][]= new String[10][10]; 
	    
	    
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "Resources\\TestData\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);				
		WebDriverWait wait = new WebDriverWait(driver, 500);

			for(int i=1;i<testCaseNo;i++)
			{
			driver.get(URL);
			driver.manage().window().maximize();
			
			
			if(i>=2)
				{
				
				utility.click(driver, Link_UN);
				
				wait.until(ExpectedConditions.presenceOfElementLocated(Link_diffAccount));
				
				utility.click(driver, Link_diffAccount);
				}
				
				values =  utility.read("Resources\\TestData\\TestDataformail.xlsx");
				//Login using the values read and objects from elements
					
				loginpage.login(driver, values, button_username, button_password, button_Next, i-1);
				
				utility.click(driver, button_Next);
				
				
				wait.until(ExpectedConditions.presenceOfElementLocated(Button_TabPrimary));
				utility.click(driver, Button_TabPrimary);
				
			
						
				String str=values[i-1][2];
				
				
					for(j=1;j<=30;j++)
					{
						Elements e = new Elements();
						By Text_SearchforEmail=e.sfe(j);
						String val=utility.getText(driver,Text_SearchforEmail);
						
							if(val.contains(str))
							{
								utility.click(driver, Text_SearchforEmail);
								wait.until(ExpectedConditions.presenceOfElementLocated(Text_subjectofEmail));
						    	String subject=utility.getText(driver, Text_subjectofEmail);
						    	System.out.println("Subject of Email is " + subject );
							}
						
							else
							{
								System.out.println("Email not found");
								
							}
						
					}	
						
					
				    utility.click(driver, Button_UserProfile);
				  
				    utility.click(driver, Button_Logout);
				    
				    driver.get(URL);
				}
			
			  
			   }

}


