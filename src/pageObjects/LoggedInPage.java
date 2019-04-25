package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoggedInPage {
	
	public static WebElement accountItems (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement accountItems;
		try {
			accountItems=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='account-items']")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return accountItems;				
	}
	
	public static WebElement einstellungen (WebDriver driver) {
		
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		List<WebElement> einstellungens = driver.findElements(By.xpath("//a[contains(@title, 'Einstellungen')]"));
		
		WebElement einstellungen=einstellungens.get(1);
		
				
		return einstellungen;				
	}
}
