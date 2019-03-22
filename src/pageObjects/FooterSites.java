package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterSites {
public static WebElement amicaLink (WebDriver driver) {
		
	//1	
	WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement amicaLink;
		try {
			 amicaLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Amica Webseite besuchen')]")));
		}
		
		catch(Exception e) {
			return null;
		}
				
		return amicaLink;				
	}

public static WebElement bambiLink (WebDriver driver) {
	//2
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement bambiLink;
	try {
		 bambiLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Bambi Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return bambiLink;				
}
public static WebElement focusLink (WebDriver driver) {
	//3
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement focusLink;
	try {
		 focusLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Focus Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return focusLink;				
}
public static WebElement freizeitrevueLink (WebDriver driver) {
	//4
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement freizeitrevueLink;
	try {
		 freizeitrevueLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Freizeitrevue Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return freizeitrevueLink;				
}
public static WebElement guterRatLink (WebDriver driver) {
	//5
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement guterRatLink;
	try {
		 guterRatLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Guter Rat Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return guterRatLink;				
}
public static WebElement meinSchonerGartenLink (WebDriver driver) {
	//6
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement meinSchonerGartenLink;
	try {
		meinSchonerGartenLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Mein schöner Garten Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return meinSchonerGartenLink;				
}
public static WebElement superilluLink (WebDriver driver) {
	//7
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement superilluLink;
	try {
		superilluLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Superillu Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return superilluLink;				
}
public static WebElement tributetobambiLink (WebDriver driver) {
	//8
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement tributetobambiLink;
	try {
		tributetobambiLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'TRIBUTE TO BAMBI - Hilfe für Kinder in Not Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return tributetobambiLink;				
}
public static WebElement tvSpielfilmLink (WebDriver driver) {
	//9
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement tvSpielfilmLink;
	try {
		tvSpielfilmLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'TV Spielfilm Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return tvSpielfilmLink;				
}
public static WebElement dasKochrezeptLink (WebDriver driver) {
	//10
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement dasKochrezeptLink;
	try {
		dasKochrezeptLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title, 'Das Kochrezept Webseite besuchen')]")));
	}
	
	catch(Exception e) {
		return null;
	}
			
	return dasKochrezeptLink;				
}

}
