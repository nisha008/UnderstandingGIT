import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://the-internet.herokuapp.com/");
	
		driver.findElement(By.linkText("Nested Frames")).click();
//		System.out.println(driver.findElements(By.tagName("frame_top")).size());
		
       driver.switchTo().frame("frame-top");
//       System.out.println( driver.switchTo().frame(driver.findElement(By.cssSelector("w3frame[name='frame-middle']")).findElement(By.xpath("//div[@id='content']")).getText()));
       

//		driver.switchTo().frame(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		

	}

}
