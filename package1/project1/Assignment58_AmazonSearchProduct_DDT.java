package package1.project1;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
public class Assignment58_AmazonSearchProduct_DDT {
public static void main(String[] args) throws EncryptedDocumentException, Exception {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	System.setProperty("Webdriver.chrome-driver","path/to/chromedriver");

try(FileInputStream f1=new FileInputStream("/Users/bikashdhungana/Desktop/Selenium/project1/bikash1.xlsx")){
Workbook workbook=WorkbookFactory.create(f1);
		Sheet sheet=workbook.getSheet("login");//Access the fist sheet	
//Now you can read cell data etc.
}catch(IOException e){
		e.printStackTrace();
}finally {	
}
FileInputStream f1=new FileInputStream("/Users/bikashdhungana/Desktop/Selenium/project1/bikash1.xlsx");
Workbook w1= WorkbookFactory.create(f1);
//3: got to the actual sheet 
Sheet s1=w1.getSheet("login");
Row r1=s1.getRow(1);
Cell c1=r1.getCell(0);
String un=c1.getStringCellValue();
System.out.println(un);

}}


