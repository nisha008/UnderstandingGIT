import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


public class Section15_part1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver =new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
//			WebElement address=driver.findElement(By.cssSelector("input[name='bday']"));
////			id="exampleFormControlSelect1"
//	       driver.findElement(with(By.tagName("input")).below(address)).sendKeys("anything");
//	       
//	       WebElement addressOfEmployed= driver.findElement(By.cssSelector("#inlineRadio2"));
//	       System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(addressOfEmployed)).getText());
//	       
//	       WebElement address3=driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
//		driver.findElement(with(By.tagName("input")).toLeftOf(address3)).click();
			
	    driver.switchTo().newWindow(WindowType.TAB);
		Set<String> keys=	driver.getWindowHandles();
		Iterator <String> im= keys.iterator();
		String Parentid=im.next();
		String childid=im.next();
		driver.switchTo().window(childid);
		driver.get("https://exercism.org/");
		
		String textOnExcercism=driver.findElement(By.cssSelector("Strong[class='leading-none font-bold']")).getText();
		System.out.println(textOnExcercism);
		driver.switchTo().window(Parentid);
		WebElement addressOfName=	driver.findElement(By.cssSelector("[name ='name']"));
		addressOfName.sendKeys(textOnExcercism);
	File file=addressOfName.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("logo.png"));
		
		
		


		

	       
	}

}
