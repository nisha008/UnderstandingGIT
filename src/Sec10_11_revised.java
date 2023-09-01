import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sec10_11_revised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
//		
////		--------------------Section 10------------------
//		driver.get("https://jqueryui.com/droppable/");
//		System.out.println(driver.switchTo().frame(0));
//		WebElement X=driver.findElement(By.id("draggable"));
//		WebElement Y=driver.findElement(By.id("droppable"));
//		Actions a=new Actions(driver);
//		a.dragAndDrop(X, Y).build().perform();
	
		
//		------------------------Section 11----------------
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement allLinksConstant=driver.findElement(By.id("gf-BIG"));
//		List<WebElement>allLinksConstant=driver.findElements(By.id("gf-BIG"));
//		allLinksConstant.stream().map(n->n.getText()).forEach(n->System.out.println(n));
		
//		WebElement allFooterlinksConstant	=allLinksConstant.findElement(By.xpath("//table/tbody/tr/td[4]/ul/li"));
		List<WebElement> allDesiredlinksNames= allLinksConstant.findElements(By.xpath("//table/tbody/tr/td[1]/ul/li/a"));
        Actions a2=new Actions (driver);

         for(int i=0;i<=allDesiredlinksNames.size();i++) {

        	 WebElement link=allDesiredlinksNames.get(i);
        	 String linkText= link.getAttribute("href");
        
             a2.keyDown(Keys.CONTROL).click(link).build().perform();
 
             
         }
       
         
            Set<String>keys=driver.getWindowHandles();
		    Iterator <String> im= keys.iterator();
		    while(im.hasNext()) {
//		    String childkey=im.next();

		    	driver.switchTo().window(im.next());
		    	
		    	System.out.println(driver.getTitle());
		    	
////		    String parentkey=im.next();
////		    String childkey=im.next();
//		    String titleofpage=driver.switchTo().window(childkey).getTitle();
//		    System.out.println(titleofpage);
//		    driver.close();
//		    driver.switchTo().window(parentkey);      	 
//             String pageTitle = driver.getTitle();
//             System.out.println(pageTitle);
		    }


       
//	List<WebElement>allDesiredlinksNames= allFooterlinksConstant.findElements(By.tagName("a"));
//	allDesiredlinksNames.stream().map(n->n.getText()).forEach(n->System.out.println(n));
//	allDesiredlinksNames.stream().forEach(n->{n.click();
//	    n.getText();
//        System.out.println(n);	
//	});

	}

	
}
	
//	public static void ClickLinks(List l, WebDriver driver) {
//		List<WebElement> theLinks=	driver.findElements(By.xpath("//table/tbody/tr/td[1]/ul/li/a"));
//		
//		
//	}

