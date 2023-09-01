import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_checkboxes_exercise {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
//		 System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
//		 driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
//		 System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
//		 
//		  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
System.out.println("I am added due to GIT");

	}

}
