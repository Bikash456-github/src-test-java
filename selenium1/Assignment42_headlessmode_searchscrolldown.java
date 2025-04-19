package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment42_headlessmode_searchscrolldown {
		public static void main(String[] args) throws InterruptedException 
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com");
	        driver.manage().window().maximize();	        
	     // WebElement e1=driver.findElement(By.xpath("//input[@class='YtSearchboxComponentInput yt-searchbox-input title']"));
	        WebElement e1= driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/form/input"));
	        e1.sendKeys("Aastha harpal"+Keys.ENTER);
	    
	       //using while loop for continues scrolling
	        int i = 10;
	        while (i>5)
	        {   
	          Point p1 = e1.getLocation();   //it is an abs method of WebElement interface
	          int x= p1.getX();   // it is Point method and help to find you the coordinate of X
	          int y = p1.getY(); // it is Point method and help to find you the coordinate of y
	          System.out.println(x);
	          System.out.println(y);
	          Thread.sleep(2000);
	          JavascriptExecutor js = driver;         //upcasting driver to JavascriptExecutor
	          js.executeScript("window.scrollBy(0,  "+y+")"); //utilizing a method called executeScript
	          System.out.println(y);
	          y++;
	        
	        
	        }

		}

	}

