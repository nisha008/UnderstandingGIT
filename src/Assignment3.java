import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();		
		WebElement add=driver.findElement(By.cssSelector("select[class='form-control']"));
		Select s=new Select (add);
		s.selectByIndex(0);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));
	List<WebElement> onpageelements=	driver.findElements(By.cssSelector("button[class='btn btn-info']"));
	onpageelements.stream().forEach(n->n.click());
	driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
	driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
//
//	List newele=onpageelements.stream().map(n->n.getText()).collect(Collectors.toList());
//	newele.forEach(n->System.out.println(n));

	


	}

}
