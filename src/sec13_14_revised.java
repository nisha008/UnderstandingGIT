import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class sec13_14_revised {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		----------------------section 13--------------------------
//		WebElement allLinksConstant=driver.findElement(By.id("gf-BIG"));
//		List<WebElement> allDesiredlinksNames= allLinksConstant.findElements(By.xpath("//table/tbody/tr/td[1]/ul/li/a"));
//		
//        Actions a2=new Actions (driver);
//
//         for(int i=0;i<=allDesiredlinksNames.size();i++) {
//
//        	 WebElement link=allDesiredlinksNames.get(i);
//        	 String linkText= link.getAttribute("href");
//        
//             a2.keyDown(Keys.CONTROL).click(link).build().perform();
////        	 ----------------------http statuscode------------------	
//            URL u=new URL(linkText);
//         	HttpURLConnection conn= (HttpURLConnection)u.openConnection();
//         	conn.setRequestMethod("HEAD");
//         	conn.connect();
//         	int rescode=conn.getResponseCode();
////         	System.out.println(rescode);
//         	
//         	if (rescode>200) {
//         		System.out.println( "status code is : "+  rescode + " Link is broken");
//         	}
//         	else {
//         		System.out.println( "status code is : "+ rescode  +" Working fine");
//         	}
// 
//             
//         }
//	------------------------------------section14 streams-------------------------------
//
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("span[class='sort-icon sort-descending']")).click();
		List <WebElement> li=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		li.stream().map(s->s.getText()).forEach(n->System.out.println(n));
		
		List <String> Original=li.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		Original.forEach(n->System.out.println(n));
		Assert.assertEquals(li, Original);
		
		


	}

	}


