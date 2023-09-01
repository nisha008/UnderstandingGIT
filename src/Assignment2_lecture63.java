import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_lecture63 {

	public static void main(String[] args) {
		String myname="Nisha hashmi";
		String emailid="nishahashmi93133@gmail.com";

		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver =new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys(myname);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailid);
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("Heythere");
			driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
			WebElement path=driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
			Select M_F=new Select(path);
			M_F.selectByIndex(1);
			
			driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
			driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("20/03/2000");
			driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
			System.out.println(driver.findElement(By.cssSelector("div [class='alert alert-success alert-dismissible']")).getText());

		
	}

}
