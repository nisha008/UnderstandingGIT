
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions options=new ChromeOptions();
//		options.setAcceptInsecureCerts(true);
//		
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		Proxy proxy=new Proxy();
//		proxy.setHttpProxy("anything");
//		options.setCapability("proxy",proxy);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)");
		List<WebElement> rows=driver.findElements(By.xpath("//fieldset/table[@id='product']/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> columns=driver.findElements(By.xpath("//fieldset/table[@id='product']/tbody/tr/th"));
		System.out.println(columns.size());
		List<WebElement> sndrow=driver.findElements(By.xpath("//fieldset/table[@id='product']/tbody/tr[3]/td"));
		sndrow.stream().map(n->n.getText()).forEach(n->System.out.println(n));
		


	
		
		

	}

}
