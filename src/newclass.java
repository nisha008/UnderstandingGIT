
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement allLinksConstant=driver.findElement(By.id("gf-BIG"));
		List<WebElement> allDesiredlinksNames= allLinksConstant.findElements(By.xpath("//table/tbody/tr/td[1]/ul/li"));
		 URL url = new URL("http://exampleurl.ex");
		 HttpURLConnection httpURLConnection = (HttpURLConnection) url;

	}

}
