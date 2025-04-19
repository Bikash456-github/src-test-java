package package1.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch 
{	
@Test
public void testcase()
{


WebDriver driver=new ChromeDriver();
driver.get("https://google.com");
driver.manage().window().maximize();




}			
			
}		


