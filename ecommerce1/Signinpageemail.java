package ecommerce1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpageemail extends LaunchQuit
{

//step 1
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy (id="continue")
	WebElement continue1;
	
	@FindBy(id="ap_password")
	WebElement pass;
	
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	//step 2
	public void email()throws EncryptedDocumentException, IOException 
	{	
		email.sendKeys("Bikashdhungana651@gmail.com");
	}
	public void continuee()
	{
		continue1.click();	
	}
	public void pass()
	{
		pass.sendKeys("Sarmilaamerica123$");
		
	}
	public void sign()
	{
		signin.click();
	}
	
    //step3
public Signinpageemail(WebDriver driver){
Actions a1=new Actions(driver);
a1.moveToElement(signin).perform();
PageFactory.initElements(driver, this);
}

	

}
