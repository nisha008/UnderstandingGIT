import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P2_GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Grid\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    WebDriverWait w =new WebDriverWait(driver, null);

		String[] veggiesListActual= {"Brocolli","Cauliflower","Beans","Brinjal"};
		ADDElements(driver,veggiesListActual);

	    driver.findElement(By.xpath("//a[@class='cart-icon'] //img[@alt='Cart']")).click();
	    driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();	    
	    driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

//	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
	    
	   System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	    driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	    WebElement address=driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
	    Select country=new Select(address);
	    country.selectByValue("India");
	    
	    driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	 
	    driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();

	    

	    

	}
	
	public static void ADDElements(WebDriver driver,String[] veggiesListActualasarg) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List< WebElement> veggies=driver.findElements(By.xpath("//h4[@class='product-name']"));
  	    int j=0;

	    for(int i=0;i<=veggies.size();i++){
	      String namesofveggies=veggies.get(i).getText();
	      String []spilted=namesofveggies.split("-");
	      String finalname=spilted[0].trim();
	     
	      List veggiesListActualNow= Arrays.asList(veggiesListActualasarg); 
	      
	      if(veggiesListActualNow.contains(finalname)) {
	    	  j++;
	    	  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

	    	  if(j==veggiesListActualNow.size()) {
	    		  
	    	  break;
	    	  }
	    	  
	    	  
	    	  
	      }
	    }
		
	}
	

}
