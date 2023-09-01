//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class practice_sections1to14 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe"); 
//		 WebDriver driver =new ChromeDriver();
//		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
//	}
//
//}



public class Sec10_11_revised {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement allLinksConstant = driver.findElement(By.id("gf-BIG"));

        List<WebElement> allDesiredLinks = allLinksConstant.findElements(By.xpath("//table/tbody/tr/td[1]/ul/li/a"));
        Actions actions = new Actions(driver);

        String parentWindow = driver.getWindowHandle(); // Store the parent window handle

        for (WebElement link : allDesiredLinks) {
            String linkHref = link.getAttribute("href");
            System.out.println(linkHref);

            // Perform action using Actions class
            actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();

            // Get the handles of the windows/tabs
            Set<String> windowHandles = driver.getWindowHandles();
            Iterator<String> iterator = windowHandles.iterator();
            iterator.next(); // Skip the parent window handle

            // Switch to the new tab
            String newTab = iterator.next();
            driver.switchTo().window(newTab);

            // Get the page title
            String pageTitle = driver.getTitle();
            System.out.println(pageTitle);

            // Close the new tab
            driver.close();
        }

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);

        driver.quit();
    }
}