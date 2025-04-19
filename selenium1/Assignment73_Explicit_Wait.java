package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment73_Explicit_Wait {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");;
	WebDriverWait m1=new WebDriverWait(driver,Duration.ofSeconds(1));
	m1.until(ExpectedConditions.titleContains("google"));
	driver.findElement(By.name("q")).sendKeys("Nepal");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
