import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class static_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");  
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown=new Select (staticdropdown);
	    dropdown.selectByVisibleText("USD");
	    dropdown.selectByValue("AED");
	    dropdown.selectByIndex(1);
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
	    for (int i=0;i<=4;i++) {
		   driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();

		   
		  }
		   System.out.println( driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText());
		   Assert.assertEquals( driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText(), "6 Adult");


	    
	    
	    for (int i=6;i>=2;i--) {
			   driver.findElement(By.cssSelector("span[id='hrefDecAdt']")).click();

			   
			   }
		   System.out.println( driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText());
		   Assert.assertEquals( driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText(), "1 Adult");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	    driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT' ]")).click();
//	  table[@id='citydropdown'] //a[@value='DEL']
	    driver.findElement(By.xpath("//a[@value='DEL'][1]")).click();
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
	  //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']

	    
	    
	    
	    driver.findElement(By.id("autosuggest")).sendKeys("AU");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	    
	    List <WebElement> onscreen = driver.findElements(By.id("li[class='ui-menu-item']"));
	    System.out.println(onscreen);
	    
	    for (WebElement itsvalue : onscreen) 
	    	if(itsvalue.getText()=="Australia") {
	    		itsvalue.click();
	    		break;
	    		
	    	}
	    	
//		    if(itsvalue.getText().equalsIgnoreCase("Australia")) {
//		    	itsvalue.click();
//		    	break;}

	    	
	    }
	    
	    



}
