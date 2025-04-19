package package1.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fb_loginpage {

//step1
	WebDriver driver;
	@FindBy(id="email")
	WebElement username_tf;
	
	@FindBy(name="pass")
	WebElement password_tf;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login_button;
	//Step2
	public void un()
	{
		username_tf.sendKeys("BIKASH@yahoo.com");
	}
	public void psw()
	{
		password_tf.sendKeys("dhungana");
	}
	public void login()
	{
		login_button.click();
	}
	
	
}
