package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment74_Broken_Links1 {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebDriverWait w1=new WebDriverWait (driver,Duration.ofSeconds(0));
	w1.until(ExpectedConditions.titleContains("Google"));
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys("Nepal"+Keys.ENTER);
	
	
	
}
}