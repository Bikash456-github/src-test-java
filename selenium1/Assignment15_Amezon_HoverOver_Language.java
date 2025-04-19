package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment15_Amezon_HoverOver_Language {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement Fashion=driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
	
	Actions a1=new Actions(driver);
	a1.moveToElement(Fashion).perform();
	
	WebElement tshirt=driver.findElement(By.linkText("Men's T-Shirts"));
	tshirt.click();
System.out.println(driver.getTitle()); 
}
	
	
	
	
	
	
	
	
}
