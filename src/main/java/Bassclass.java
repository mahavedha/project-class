

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bassclass {

	public static WebDriver driver;
	public static WebDriver launchBrowser(String browsename) {
		
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

			return driver;
		}
	
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static String getCurrentURL() {
		String Url=driver.getCurrentUrl();
		return Url;
	}
	public static String getTitle() {
		String title=driver.getTitle();
		return title;
	}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void btnclick(WebElement e) {
		e.click();
	}
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
	}
	public static void moveIoElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}
	public static void fillTextBox(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	public static WebElement findElement(String locatename,String locator) {
		WebElement e=null;
		if(locatename.endsWith("id"));
		
			e=driver.findElement(By.id(locator));
	

			return e;
	
		
		

	}

}
