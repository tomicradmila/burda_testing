package actions;
import pageObjects.FooterSocialNetworks;
import pageObjects.FooterMagazines;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FooterActions {
	public static String[] checkSocialNetworks(WebDriver driver) {
		String[] urls = new String[4];
		Actions builder = new Actions(driver);
		Action clickOnFacebook=builder
				.moveToElement(FooterSocialNetworks.facebookLink(driver))
				.click()
				.build();
		
		clickOnFacebook.perform();
		
		urls[0]=driver.getCurrentUrl();
		driver.navigate().back();
		
		Actions builder2 = new Actions(driver);
		Action clickOnPinterest=builder2
				.moveToElement(FooterSocialNetworks.pinterestLink(driver))
				.click()
				.build();
		
		clickOnPinterest.perform();
			
		urls[1]=driver.getCurrentUrl();
		driver.navigate().back();
		
		Actions builder3= new Actions(driver);
		Action clickOnInstagram=builder3
				.moveToElement(FooterSocialNetworks.instagramLink(driver))
				.click()
				.build();
		
		clickOnInstagram.perform();
		
		
		urls[2]=driver.getCurrentUrl();
		driver.navigate().back();
		
		Actions builder4 = new Actions(driver);
		Action clickOnYoutube=builder4
				.moveToElement(FooterSocialNetworks.youtubeLink(driver))
				.click()
				.build();
		
		clickOnYoutube.perform();
	
		urls[3]=driver.getCurrentUrl();
		driver.navigate().back();
		
		return urls;
				
	}
	
	public static String[] checkMagazines(WebDriver driver) {
		String[] urls = new String[5];
		Actions builder = new Actions(driver);
		Action clickOnBunte=builder
				.moveToElement(FooterMagazines.bunteLink(driver))
				.click()
				.build();
		
		clickOnBunte.perform();
		
		urls[0]=driver.getCurrentUrl();
		driver.navigate().back();
		
		Actions builder2 = new Actions(driver);
		Action clickOnFreundin=builder2
				.moveToElement(FooterMagazines.freundinLink(driver))
				.click()
				.build();
		
		clickOnFreundin.perform();
			
		urls[1]=driver.getCurrentUrl();
		driver.navigate().back();
		
		Actions builder3= new Actions(driver);
		Action clickOnInStyle=builder3
				.moveToElement(FooterMagazines.inStyleLink(driver))
				.click()
				.build();
		
		clickOnInStyle.perform();
		
		
		urls[2]=driver.getCurrentUrl();
		driver.navigate().back();
		
		Actions builder4 = new Actions(driver);
		Action clickOnElle=builder4
				.moveToElement(FooterMagazines.elleLink(driver))
				.click()
				.build();
		
		clickOnElle.perform();
	
		urls[3]=driver.getCurrentUrl();
		driver.navigate().back();
		
		Actions builder5 = new Actions(driver);
		Action clickOnBazaar=builder5
				.moveToElement(FooterMagazines.bazaarLink(driver))
				.click()
				.build();
		
		clickOnBazaar.perform();
	
		urls[4]=driver.getCurrentUrl();
		driver.navigate().back();
		
		
		return urls;
				
	}

}
