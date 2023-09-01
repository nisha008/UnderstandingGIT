import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class maximizing_windows {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
//		TakeScreenShot tsr=new
		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		
		jse.executeScript(("document.querySelector('.tableFixHead').scrollTop=5000"));
		System.out.println(driver.findElements(By.tagName("a")).size());
//		System.out.println(driver.findElement(By.cssSelector("tbody tr td:nth-child(1) ul:nth-child(1) li:nth-child(4)")).getText());
//	    
//		driver.findElement(By.cssSelector("a[href='https://www.udemy.com/course/mobile-automation-using-appiumselenium-3/?referralCode=C46BF551F5B9EAF08E10']")).click();
//		Actions a=new Actions(driver);
//		
//		a.keyDown(Keys.CONTROL).build().perform();
//		driver.findElement(By.cssSelector("a[href='https://www.udemy.com/course/mobile-automation-using-appiumselenium-3/?referralCode=C46BF551F5B9EAF08E10']")).click();
   List<WebElement> link_url=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
   SoftAssert a=new SoftAssert();
  
   

   for(int i=0;i<link_url.size();i++) {
	   String urlconstant=link_url.get(i).getAttribute("href");
	
//	   System.out.println(urlconstant);
	   HttpURLConnection connectionConstant= (HttpURLConnection) new URL(urlconstant).openConnection();
	   connectionConstant.setRequestMethod("HEAD");
	   connectionConstant.connect();
	   int res_code=connectionConstant.getResponseCode();
	   System.out.println(res_code);
	   a.assertTrue(res_code<400, "The link with "+link_url.get(i).getText() + " is broken with code :"+ res_code);
	   a.assertFalse(res_code>400, "The link with "+link_url.get(i).getText() + " is broken with code :"+ res_code);

	   
	   
//	   if(res_code>200) {
//		   System.out.println("nicelink");
//		   Assert.assertEquals(res_code, 200);
//		   break;
//	   }
//	   else {
//		   System.out.println("Broken link");
//	   }
   }
   a.assertAll();
 
	}

}
