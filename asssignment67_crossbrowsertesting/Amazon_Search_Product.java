package asssignment67_crossbrowsertesting;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

	public class Amazon_Search_Product extends Browser_Launch_Quit{
	@Test
	public void SearchProduct()
	{
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);	
	}


	@BeforeMethod()
	public void QuitAmazon()
	{
		driver.quit();
}
	}