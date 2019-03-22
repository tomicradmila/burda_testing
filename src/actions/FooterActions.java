package actions;
import pageObjects.FooterSocialNetworks;
import pageObjects.FooterMagazines;
import pageObjects.FooterSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FooterActions {
	public static String[] checkSocialNetworks(WebDriver driver) {
		String[] urls = new String[4];
		Actions builder = new Actions(driver);
		
		if(FooterSocialNetworks.facebookLink(driver)!=null) {
			Action clickOnFacebook=builder
					.moveToElement(FooterSocialNetworks.facebookLink(driver))
					.click()
					.build();
			
			clickOnFacebook.perform();
			urls[0]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[0]="";
		}
					
		Actions builder2 = new Actions(driver);
		if(FooterSocialNetworks.pinterestLink(driver)!=null) {
			Action clickOnPinterest=builder2
					.moveToElement(FooterSocialNetworks.pinterestLink(driver))
					.click()
					.build();
			
			clickOnPinterest.perform();
			urls[1]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[1]="";
		}
							
		Actions builder3= new Actions(driver);
		if(FooterSocialNetworks.instagramLink(driver)!=null) {
			Action clickOnInstagram=builder3
					.moveToElement(FooterSocialNetworks.instagramLink(driver))
					.click()
					.build();
			
			clickOnInstagram.perform();
			urls[2]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[2]= "";
		}
		
					
		Actions builder4 = new Actions(driver);
		if(FooterSocialNetworks.youtubeLink(driver)!=null) {
			Action clickOnYoutube=builder4
					.moveToElement(FooterSocialNetworks.youtubeLink(driver))
					.click()
					.build();
			
			clickOnYoutube.perform();
			urls[3]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[3]="";
		}
			
		return urls;
				
	}
	//-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
	
	public static String[] checkMagazines(WebDriver driver) {
		String[] urls = new String[5];
		Actions builder = new Actions(driver);
		if(FooterMagazines.bunteLink(driver)!=null) {
			Action clickOnBunte=builder
					.moveToElement(FooterMagazines.bunteLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[0]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[0]="";
		}
		
		if(FooterMagazines.freundinLink(driver)!=null) {
			Actions builder2 = new Actions(driver);
			Action clickOnFreundin=builder2
					.moveToElement(FooterMagazines.freundinLink(driver))
					.click()
					.build();
			
			clickOnFreundin.perform();
				
			urls[1]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[1]="";
		}
		
		if(FooterMagazines.inStyleLink(driver)!=null) {
			Actions builder3= new Actions(driver);
			Action clickOnInStyle=builder3
					.moveToElement(FooterMagazines.inStyleLink(driver))
					.click()
					.build();
			
			clickOnInStyle.perform();
			
			
			urls[2]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[2]="";
		}
		
		if(FooterMagazines.elleLink(driver)!=null) {
			Actions builder4 = new Actions(driver);
			Action clickOnElle=builder4
					.moveToElement(FooterMagazines.elleLink(driver))
					.click()
					.build();
			
			clickOnElle.perform();
		
			urls[3]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[3]="";
		}
		
		if(FooterMagazines.bazaarLink(driver)!=null) {
			Actions builder5 = new Actions(driver);
			Action clickOnBazaar=builder5
					.moveToElement(FooterMagazines.bazaarLink(driver))
					.click()
					.build();
			
			clickOnBazaar.perform();
		
			urls[4]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[4]="";
		}
				
		return urls;
				
	}
	
	//-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
	
	public static String[] checkSites(WebDriver driver) {
		String[] urls = new String[10];
		Actions builder = new Actions(driver);
		if(FooterSites.amicaLink(driver)!=null) {
			Action clickOnBunte=builder
					.moveToElement(FooterMagazines.bunteLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[0]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[0]="";
		}
		
		
		return urls;
				
	}
}
