package actions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FooterActions {
	//FOOTER SOCIAL MEDIA
	

	public static String checkLink(WebDriver driver,WebElement element, String targetUrl,String homeUrl, String homeStagingUrl) {
		Actions builder = new Actions(driver);
		if(element!=null) {
			Action clickOnElement=builder
					.moveToElement(element)
					.click()
					.build();
			
			clickOnElement.perform();
			if(driver.getCurrentUrl().contains(targetUrl)) {
				driver.navigate().back();
				if(driver.getCurrentUrl().equals(homeUrl)||driver.getCurrentUrl().equals(homeStagingUrl)) {
					return "passed";
				}
				return "failed";
			}
			else {
				return "failed";
			}
			
		}
		else {
			return "failed";
		}
	
		
}
	
	public static String checkLink(WebDriver driver,WebElement element, String targetUrl,String targetUrlStaging,String homeUrl, String homeStagingUrl) {
		Actions builder = new Actions(driver);
		if(element!=null) {
			Action clickOnElement=builder
					.moveToElement(element)
					.click()
					.build();
			
			clickOnElement.perform();
			if(driver.getCurrentUrl().contains(targetUrl)||driver.getCurrentUrl().contains(targetUrlStaging)) {
				driver.navigate().back();
				if(driver.getCurrentUrl().equals(homeUrl)||driver.getCurrentUrl().equals(homeStagingUrl)) {
					return "passed";
				}
				return "failed";
			}
			else {
				return "failed";
			}
			
		}
		else {
			return "failed";
		}
	}


	
}
