import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.cssSelector("a[href*='windows']")).click();

		Set <String> pages=driver.getWindowHandles();
		Iterator <String> ite =pages.iterator();
		String parentid=ite.next();
		String childid=ite.next();
	    driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		driver.switchTo().window(parentid);



		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}
		
		
	}
