package project1a;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(project1a.Itestlistener1.class)

public class  Testcase1 extends Itestlistener1 {
@Test(retryAnalyzer=project1a.Iretryfailedtestcase.class)

public void  login_to_Amazon() throws EncryptedDocumentException, IOException{
	         
    driver=new ChromeDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
	WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoes"+Keys.ENTER);
	
	//	Fb_LoginPage f1=new Fb_LoginPage(driver);
	
	//fb_loginpage f1=new fb_loginpage(driver);
    WebElement e2=	driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]"));
	e2.click();
	Set<String>s1=driver.getWindowHandles();
	Iterator<String> i1= s1.iterator();
	String parentid =i1.next();
	String childid=i1.next();
	System.out.println(parentid);
	System.out.println(childid);
	driver.switchTo().window(childid);
	WebElement buynow=driver.findElement(By.id("buy-now-button"));
	buynow.click();
	/*
	DDT m1=new DDT();
	m1.UserName();
	f1.UserName();
	f1.un();
	f1.pas();
	f1.login() ;
	f1.signin();
	*/
	
	
	
}}	
	
	
	
	
	
	
	

	




