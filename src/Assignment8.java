import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dev.failsafe.Timeout;

public class Assignment8 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		 Actions haiye=new Actions (driver);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys("im");
//		WebDriverWait jk =new WebDriverWait(driver, Duration.ofSeconds(500));
//		jk.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id*='ui-id']")));
//		Thread.sleep(5000);
		List<WebElement> countries_name=driver.findElements(By.cssSelector("div[id*='ui-id']"));
		boolean foundInfo=false;

		for(WebElement ele:countries_name) {
//		System.out.println(ele.getText());
		if(ele.getText().contains("me")) {
			ele.click();
			foundInfo=true;
			break;
			
		}
	
		if(!foundInfo) {
			System.out.println("No such ele found");
		}
			
		
		}
		
		
//		countries_name.stream().map(n->n.getText()).forEach(n->System.out.println(n));
		

		
		
		
		


	}

}
