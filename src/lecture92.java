import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lecture92 {


	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		https://rahulshettyacademy.com/AutomationPractice/
      System.out.println( driver.findElements(By.tagName("a")).size());
      WebElement foooterlinks=driver.findElement(By.id("gf-BIG"));
      System.out.println(foooterlinks.findElements(By.tagName("a")).size());
      WebElement discountCoupon=foooterlinks.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
      int dclinkcount=discountCoupon.findElements(By.tagName("a")).size();
      System.out.println(dclinkcount);
      for(int i=0;i<dclinkcount;i++) {
    	  
    	  
    	  String value=Keys.chord(Keys.CONTROL,Keys.ENTER);
    	  discountCoupon.findElements(By.tagName("a")).get(i).sendKeys(value);
    	  Thread.sleep(5000L);
//    	  int j=1;
    	  Set <String> navigate= driver.getWindowHandles();
    	  Iterator<String> ite=navigate.iterator();
    	  while(ite.hasNext()) {
    		  
    		  
//    	      String p_ids=ite.next();
//    	      String cid=ite.next();
    	     driver.switchTo().window(ite.next());
    	     System.out.println(driver.getTitle());}
    	 
    	  
      

	}}
	

}
