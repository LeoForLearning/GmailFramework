package EmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class Elements {
	
	int j=0;
	
	@FindBy
	public static final By Link_Sighnin=By.linkText("Sign in");
	
	@FindBy
	public static final By button_username=By.id("identifierId");

	@FindBy
	public static final By button_password=By.xpath("//div[@class='Xb9hP']");

	@FindBy
	public static final By button_Next=By.xpath("//span[contains(text(),'Next')]"); 
	
	@FindBy
	public static final By Button_TabPrimary=By.xpath("//div[@id=':2h'][contains(text(),'Primary')]"); 
	

	
	
	@FindBy
	public static final By Text_subjectofEmail=By.xpath("//div[@class='ha']/h2");
	
	
	@FindBy
	public static final By Link_UN=By.xpath("//div[@class='vgHGpc RRP0oc']");
	
	@FindBy
	public static final By Link_diffAccount=By.xpath("//div[contains(text(),'Use another account')]");
	
	@FindBy
	public static final By Button_UserProfile=By.xpath("//span[@class='gb_xa gbii']");
	
	@FindBy
	public static final By Button_Logout=By.xpath("//a[contains(text(),'Sign out')]");
	
	@FindBy
	public static final By Dropdwown=By.id("profileIdentifier");
	
	@FindBy
	public By Text_SearchforEmail;
	
	
	public String URL = "www.gmail.com";
	
	public By sfe(int forloopno)
	{
		 j=forloopno;
		 By Text_SearchforEmail =By.xpath("//tr["+ j+"]/td[@class='yX xY ']");
		 return Text_SearchforEmail;
		 
	}
	
	

}
