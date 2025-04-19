package ecommerce1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import project1s.fb_loginpage;

public class LaunchQuit  {
public static WebDriver driver;
	@BeforeMethod
	public void login()throws InterruptedException, EncryptedDocumentException, IOException 
	{
    driver=new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_in&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcheckoutportal%2Fenter-checkout.html%3Fie%3DUTF8%26asin%3DB0CK521WSZ%26buyNow%3D1%26cartCustomerID%3D0%26fromSignIn%3D1%26isGift%3D0%26offeringID%3DrL5gKUgFNd%25252FeLmN38sUwo%25252FL%25252BnYyI65sykDGnuy16rwdiv09qiyk6%25252BzdSjLrWMkKwiHwvJclq9vx2pluCqsar0QVbzMoR3s6M8DYC5Ve%25252Fd3m85O0st9SNdsOsl8%25252Ftwr%25252FRgU1C8DlDlwwj0F%25252FOBAD2ta4KKJQFetYo%26purchaseInputs%3DHASH%25280x7f45ff3006e0%2529%26quantity%3D1%26sessionID%3D259-8564560-3923004&pageId=amazon_checkout_in&showRmrMe=0&siteState=IMBMsgs.&suppressSignInRadioButtons=0");
	
	}
	@Test
		
	@AfterMethod
	public void quit() throws InterruptedException{
	{
		
		
	}
	
}
}