import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");  
	      
         
		    WebDriver driver =new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/");
		    driver.findElement(By.className("theme-btn")).click();
		    
//		    driver.findElement(By.id("sign-up-with-email")).click();
		   
//		    driver.findElement(By.className("dsp-flex-xs flex-justify-content-center-xs")).click();
//		    driver.findElement(By.cssSelector("button.sign_up_method")).click();    ----by tagname and class name
		    driver.findElement(By.cssSelector("button[data-test-id='sign-up-with-email']")).click(); 
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		    data-test-id="sign-up-with-email"

//		    driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/email");
		    driver.findElement(By.id("user_name")).sendKeys("Nisha");
		    driver.findElement(By.id("user_email")).sendKeys("nishahashmi9313@gmail.com");
		    driver.findElement(By.id("password")).sendKeys("Nisha@123");
//		    driver.findElement(By.cssSelector(".submit")).click();
		    
		    driver.findElement(By.cssSelector("div[class='login-btn']:nth-child(2)")).click();
//		    .div[class='login-btn']:nth-child(3)
		    
//		    System.out.println( driver.findElement(By.cssSelector( "div[class='m-l-3-xs']")).getText());
		    

	}

}
