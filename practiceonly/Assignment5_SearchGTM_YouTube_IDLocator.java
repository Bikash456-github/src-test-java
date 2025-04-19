package practiceonly;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5_SearchGTM_YouTube_IDLocator {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementID")));
		element.click();

		
		driver.findElement(By.id("search")).sendKeys("Grotechminds");
		driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
	}

}
