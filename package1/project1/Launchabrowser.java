package package1.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchabrowser {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		
		
		

	}

}
