import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKart_pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	`
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("app");
		List<WebElement> listconsistingapp=driver.findElements(By.xpath("//tr/td[1]"));
		
//		for(int i=0;i<listconsistingapp.size();i++) {
//			String n=listconsistingapp.get(i).getText();
//			System.out.println(n);
//			
//		}
//		listconsistingapp.get(0)
//		listconsistingapp.stream().map(s->s.getText().contains("Apple")).collect(Collectors.toList()).forEach(s->System.out.println(s));
  List<String> iwanted=  listconsistingapp.stream().map(s->s.getText()).collect(Collectors.toList());
  System.out.println(iwanted);
//		List  <String> dedicatedElementPrice=	listconsistingapp.stream().map(s->s.getText().contains("App")).collect(Collectors.toList());


		List<String> dedicatedElements = listconsistingapp.stream()
		        .map(s -> s.getText())
		        .filter(t -> t.toLowerCase().contains("app"))  // Use filter to keep only elements containing "App"
		        .collect(Collectors.toList());
		System.out.println(dedicatedElements);
		
		Assert.assertEquals(iwanted, dedicatedElements);
		
		
		
		
		

		
		
		
////		List <WebElement> namesOfVeggiesbeforeDo_While= driver.findElements(By.xpath("//tr/td[1]"));

//		---------------------------method1 ---not working----------------------
//		List<String> pricebefore=	namesOfVeggiesbeforeDo_While.stream().filter(s->s.getText().contains("Wheat")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
//        pricebefore.forEach(n->System.out.println(n));

//		//		List <WebElement> jk=driver.findElements(By.xpath("//tr/th[1]"));
//		do{
//
////		List <WebElement> namesOfVeggies= driver.findElements(By.xpath("//tr/td[1]"));
//		
//		
////		List<String> price=	namesOfVeggies.stream().filter(s->s.getText().contains("Tomato")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
////		
//
//		while(pricebefore.contains("34"));
//			
//		{
//			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
//			
//		}
//
//		
//		}
		
//----------------	method2--------	
//		List<String> priceafter;
//		
//		
//		do {
//			List <WebElement> namesOfVeggiesafter= driver.findElements(By.xpath("//tr/td[1]"));
//			priceafter=	namesOfVeggiesafter.stream().filter(s->s.getText().contains("Cheese")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
//			priceafter.forEach(s->System.out.println(s));
//         if(priceafter.size()<1) {
//	       driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
//
//             }
//
//		}
//		while(priceafter.size()<1);
//		
//			}
		
//		---------------------------------checkiing page's filter functionality---------------------
		
	
	}
	public static String getPriceVeggie( WebElement s ) {
		String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	
		
		
	}}
