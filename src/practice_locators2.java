import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class practice_locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.linkedin.com/feed/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		 driver.findElement(By.cssSelector("input[placeholder='Email or phone number']")).sendKeys("nishahashmi9313@gmail.com");
//
//		 driver.findElement(By.cssSelector("input#password")).sendKeys("Scarlett@123");
//         driver.findElements(By.cssSelector("a[class='main__sign-in-link']")).

		 driver.findElement(By.cssSelector("a[class='main__sign-in-link']")).click();
		 driver.findElement(By.cssSelector("input#username")).sendKeys("nishahashmi9313@gmail.com");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("Scarlett@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 
		 String comingnamefrommethod= get_thename(driver);
			System.out.println(comingnamefrommethod);

		 


		 

//
//		 driver.findElement(By.cssSelector("div[class='login-btn']:nth-child(2)")).click();
////		 driver.findElement(null)
//		 driver.findElement(By.linkText("Log in")).click();
//		 driver.findElement(By.cssSelector("div input[type=\"email\"]")).sendKeys("nishahashmi9313@gmail.com");
//		 driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("Nisha@13");
//		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		 System.out.println(driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).getText());
		
//		 String text_onpage= driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).getText();
		 
//		String [] spiltted_string= text_onpage.split("/");
//		
//		System.out.println(spiltted_string);
//		 String name="Nisha Hashmi";
		 
//		
//		 driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).getText();
//		 Assert.assertEquals(text_onpage, "Free Access to InterviewQues/ResumeAssistance/Material");
		 
//		 div[class='t-16 t-black t-bold']
		 
		 
//		 driver.findElement(By.cssSelector("div[class='t-16 t-black t-bold']")).getText();
//		 String myname = driver.findElement(By.cssSelector("div[class='t-16 t-black t-bold']")).getText();
//
//		 Assert.assertEquals(driver.findElement(By.cssSelector("div[class='t-16 t-black t-bold']")).getText(), myname);
//
////		 String myname = driver.findElement(By.cssSelector("div[class='t-16 t-black t-bold']")).getText();
//			System.out.println(myname);
//
//			String [] spiltted_string= myname.split(" ");
//			System.out.println((spiltted_string)[0]);
			
			

		
	}
	
	public static String get_thename(WebDriver driver) {
		 String myname = driver.findElement(By.cssSelector("div[class='t-16 t-black t-bold']")).getText();

		 Assert.assertEquals(driver.findElement(By.cssSelector("div[class='t-16 t-black t-bold']")).getText(), myname);

//		 String myname = driver.findElement(By.cssSelector("div[class='t-16 t-black t-bold']")).getText();
			System.out.println(myname);

			String [] spiltted_string= myname.split(" ");
			return ((spiltted_string)[0]);
		
		
		
	}

}



