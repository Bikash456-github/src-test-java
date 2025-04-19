package ecommerce1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchproduct extends LaunchQuit
{
	WebDriver driver;
	public Searchproduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
    }
	

	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	public void search() throws InterruptedException, EncryptedDocumentException, IOException 
		{
			search.sendKeys("Apple i phone"+Keys.ENTER);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
