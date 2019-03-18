package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterSocialNetworks {
	
public static WebElement facebookLink (WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement facebookLink;
		try {
			 facebookLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Like uns auf Facebook')]")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return facebookLink;				
	}
public static WebElement pinterestLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement pinterestLink;
	try {
		 pinterestLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Entdecke unsere virtuelle Pinnwand')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return pinterestLink;				
}

public static WebElement instagramLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement instagramLink;
	try {
		 instagramLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Augenblicke der Kreativität')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return instagramLink;				
}

public static WebElement youtubeLink (WebDriver driver) {
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement youtubeLink;
	try {
		 youtubeLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'DIY Videos - Tipps und Tricks')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return youtubeLink;				
}



}
