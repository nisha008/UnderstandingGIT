import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKartByStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//		driver.findElement(By.xpath("//tr/th[1]")).click();
		List <WebElement> namesOfVeggies= driver.findElements(By.xpath("//tr/td[1]"));
//		List <String> orginal_names=namesOfVeggies.stream().map(s->s.getText()).collect(Collectors.toList());
		namesOfVeggies.stream().map(s->s.getText()).collect(Collectors.toList()).forEach(s->System.out.println(s));
//		System.out.println(orginal_names);
		
//		List <String> sorted_orginal_names=orginal_names.stream().sorted().collect(Collectors.toList());
//		Assert.assertEquals(orginal_names, sorted_orginal_names);
//		Assert.assertTrue(orginal_names.equals(sorted_orginal_names));
//		List  <String> dedicatedElementPrice=namesOfVeggies.stream().filter(s->s.getText().contains("Tomato")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
//		dedicatedElementPrice.forEach(k->System.out.println(k));
		
		
		
		
	}
	
	public static String getPriceVeggie( WebElement s ) {
		String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	
		
		
	}


}