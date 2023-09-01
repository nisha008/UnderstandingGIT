import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.path2usa.com/travel-companions");
		  
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("form-field-travel_comp_date")).click();

//		while(!driver.findElement(By.xpath("span[title='Scroll to increment']")).getText().contains("August") ){
//			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']//*[name()='svg']")).click();
//		}
//	List<WebElement> datesonscreen=driver.findElements(By.cssSelector("span[class*='flatpickr-day']"));
//
//		for (int i=0;i<datesonscreen.size();i++) {
//			String date=datesonscreen.get(i).getText();
//			String dateneeded="30";
//			if(date==dateneeded) {
//           driver.findElement(By.cssSelector("span[class*='flatpickr-day']")).click();	
//           break;
//			}
//		}
//		
	}

}
