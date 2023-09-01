import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmnent6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver= new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver"," C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
//	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	     //input[@id='checkBoxOption3']
//	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	       
//	       System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).getText());
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver =new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		 
		 driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click();

	      String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
	      String opt2=opt.toLowerCase();
	       WebElement address=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
			 Select eles=new Select(address);
			 eles.selectByValue(opt2);
			 driver.findElement(By.id("name")).sendKeys(opt);
			 driver.findElement(By.id("alertbtn")).click();
	String	screentect=driver.switchTo().alert().getText();
			 driver.switchTo().alert().accept();
if(screentect.contains(opt)) {
	System.out.println("Message having the correct name");
}
else {
	System.out.println("wrong ");

}
			 
			 
	       
	       
	}

}
