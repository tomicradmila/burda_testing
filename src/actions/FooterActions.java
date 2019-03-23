package actions;
import pageObjects.FooterSocialNetworks;
import pageObjects.FooterInternalLinks;
import pageObjects.FooterMagazines;
import pageObjects.FooterSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FooterActions {
	
	public static String checkFacebookLink(WebDriver driver,String facebookUrl,String homeUrl, String homeStagingUrl) {
		
		
		Actions builder = new Actions(driver);
		if(FooterSocialNetworks.facebookLink(driver)!=null) {
			Action clickOnFacebook=builder
					.moveToElement(FooterSocialNetworks.facebookLink(driver))
					.click()
					.build();
			
			clickOnFacebook.perform();
			if(driver.getCurrentUrl().equals(facebookUrl)) {
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
	//////////////////////////////////////////////////////////////////////////////
	
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
	
	/////////////////////////////////////////////////////////////////////////////////
	
	public static String[] checkSites(WebDriver driver) {
		String[] urls = new String[10];
		Actions builder = new Actions(driver);
		if(FooterSites.amicaLink(driver)!=null) {
			Action clickOnBunte=builder
					.moveToElement(FooterSites.amicaLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[0]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[0]="";
		}
		
		Actions builder1 = new Actions(driver);
		if(FooterSites.bambiLink(driver)!=null) {
			Action clickOnBunte=builder1
					.moveToElement(FooterSites.bambiLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[1]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[1]="";
		}
		
		Actions builder2 = new Actions(driver);
		if(FooterSites.focusLink(driver)!=null) {
			Action clickOnBunte=builder2
					.moveToElement(FooterSites.focusLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[2]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[2]="";
		}
		
		Actions builder3 = new Actions(driver);
		if(FooterSites.freizeitrevueLink(driver)!=null) {
			Action clickOnBunte=builder3
					.moveToElement(FooterSites.freizeitrevueLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[3]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[3]="";
		}
		
		Actions builder4 = new Actions(driver);
		if(FooterSites.guterRatLink(driver)!=null) {
			Action clickOnBunte=builder4
					.moveToElement(FooterSites.guterRatLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[4]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[4]="";
		}
		
		Actions builder5 = new Actions(driver);
		if(FooterSites.meinSchonerGartenLink(driver)!=null) {
			Action clickOnBunte=builder5
					.moveToElement(FooterSites.meinSchonerGartenLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[5]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[5]="";
		}
		
		Actions builder6 = new Actions(driver);
		if(FooterSites.superilluLink(driver)!=null) {
			Action clickOnBunte=builder6
					.moveToElement(FooterSites.superilluLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[6]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[6]="";
		}
		
		Actions builder7 = new Actions(driver);
		if(FooterSites.tributetobambiLink(driver)!=null) {
			Action clickOnBunte=builder7
					.moveToElement(FooterSites.tributetobambiLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[7]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[7]="";
		}
		
		Actions builder8 = new Actions(driver);
		if(FooterSites.tvSpielfilmLink(driver)!=null) {
			Action clickOnBunte=builder8
					.moveToElement(FooterSites.tvSpielfilmLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[8]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[8]="";
		}
		
		Actions builder9 = new Actions(driver);
		if(FooterSites.dasKochrezeptLink(driver)!=null) {
			Action clickOnBunte=builder9
					.moveToElement(FooterSites.dasKochrezeptLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[9]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[9]="";
		}
		
		return urls;
				
	}
	///////////////////////////////////////////////////////////////////////
	
	public static String[] checkInternalLinks(WebDriver driver) {
		String[] urls = new String[22];
		Actions builder = new Actions(driver);
		if(FooterInternalLinks.wirUberUnsmLink(driver)!=null) {
			Action clickOnBunte=builder
					.moveToElement(FooterInternalLinks.wirUberUnsmLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[0]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[0]="";
		}
		
		Actions builder1 = new Actions(driver);
		if(FooterInternalLinks.newsletterLink(driver)!=null) {
			Action clickOnBunte=builder1
					.moveToElement(FooterInternalLinks.newsletterLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[1]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[1]="";
		}
		Actions builder2 = new Actions(driver);
		if(FooterInternalLinks.abonnementLink(driver)!=null) {
			Action clickOnBunte=builder2
					.moveToElement(FooterInternalLinks.abonnementLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[2]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[2]="";
		}
		Actions builder3 = new Actions(driver);
		if(FooterInternalLinks.archivLink(driver)!=null) {
			Action clickOnBunte=builder3
					.moveToElement(FooterInternalLinks.archivLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[3]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[3]="";
		}
		Actions builder4 = new Actions(driver);
		if(FooterInternalLinks.communityRichtlinienLink(driver)!=null) {
			Action clickOnBunte=builder4
					.moveToElement(FooterInternalLinks.communityRichtlinienLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[4]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[4]="";
		}
		Actions builder5 = new Actions(driver);
		if(FooterInternalLinks.faqLink(driver)!=null) {
			Action clickOnBunte=builder5
					.moveToElement(FooterInternalLinks.faqLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[5]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[5]="";
		}
		Actions builder6 = new Actions(driver);
		if(FooterInternalLinks.bestellvorgangLink(driver)!=null) {
			Action clickOnBunte=builder6
					.moveToElement(FooterInternalLinks.bestellvorgangLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[6]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[6]="";
		}
		Actions builder7 = new Actions(driver);
		if(FooterInternalLinks.downloadAnleitungLink(driver)!=null) {
			Action clickOnBunte=builder7
					.moveToElement(FooterInternalLinks.downloadAnleitungLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[7]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[7]="";
		}
		Actions builder8 = new Actions(driver);
		if(FooterInternalLinks.versandkostenLink(driver)!=null) {
			Action clickOnBunte=builder8
					.moveToElement(FooterInternalLinks.versandkostenLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[8]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[8]="";
		}
		Actions builder9 = new Actions(driver);
		if(FooterInternalLinks.kontaktLink(driver)!=null) {
			Action clickOnBunte=builder9
					.moveToElement(FooterInternalLinks.kontaktLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[9]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[9]="";
		}
		Actions builder10 = new Actions(driver);
		if(FooterInternalLinks.AGBLink(driver)!=null) {
			Action clickOnBunte=builder10
					.moveToElement(FooterInternalLinks.AGBLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[10]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[10]="";
		}
		Actions builder11 = new Actions(driver);
		if(FooterInternalLinks.datenSchitzbestimmungenLink(driver)!=null) {
			Action clickOnBunte=builder11
					.moveToElement(FooterInternalLinks.datenSchitzbestimmungenLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[11]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[11]="";
		}
		Actions builder12 = new Actions(driver);
		if(FooterInternalLinks.nutzungsbedingungenLink(driver)!=null) {
			Action clickOnBunte=builder12
					.moveToElement(FooterInternalLinks.nutzungsbedingungenLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[12]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[12]="";
		}
		Actions builder13 = new Actions(driver);
		if(FooterInternalLinks.unsereWerbungLink(driver)!=null) {
			Action clickOnBunte=builder13
					.moveToElement(FooterInternalLinks.unsereWerbungLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[13]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[13]="";
		}
		Actions builder14 = new Actions(driver);
		if(FooterInternalLinks.gewinnspielbedingungenLink(driver)!=null) {
			Action clickOnBunte=builder14
					.moveToElement(FooterInternalLinks.gewinnspielbedingungenLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[14]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[14]="";
		}
		
		Actions builder15 = new Actions(driver);
		if(FooterInternalLinks.gesuhtGefundenLink(driver)!=null) {
			Action clickOnBunte=builder15
					.moveToElement(FooterInternalLinks.gesuhtGefundenLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[15]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[15]="";
		}
		
		Actions builder16 = new Actions(driver);
		if(FooterInternalLinks.nahkurseLink(driver)!=null) {
			Action clickOnBunte=builder16
					.moveToElement(FooterInternalLinks.nahkurseLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[16]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[16]="";
		}
		Actions builder17 = new Actions(driver);
		if(FooterInternalLinks.handleradressenLink(driver)!=null) {
			Action clickOnBunte=builder17
					.moveToElement(FooterInternalLinks.handleradressenLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[17]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[17]="";
		}
		Actions builder18 = new Actions(driver);
		if(FooterInternalLinks.datenschutzanfrageLink(driver)!=null) {
			Action clickOnBunte=builder18
					.moveToElement(FooterInternalLinks.datenschutzanfrageLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[18]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[18]="";
		}
		
		Actions builder19 = new Actions(driver);
		if(FooterInternalLinks.mediatenOnlineLink(driver)!=null) {
			Action clickOnBunte=builder19
					.moveToElement(FooterInternalLinks.mediatenOnlineLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[19]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[19]="";
		}
		Actions builder20 = new Actions(driver);
		if(FooterInternalLinks.mediatenPrintLink(driver)!=null) {
			Action clickOnBunte=builder20
					.moveToElement(FooterInternalLinks.mediatenPrintLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[20]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[20]="";
		}
		
		Actions builder21 = new Actions(driver);
		if(FooterInternalLinks.anmeldenLink(driver)!=null) {
			Action clickOnBunte=builder21
					.moveToElement(FooterInternalLinks.anmeldenLink(driver))
					.click()
					.build();
			
			clickOnBunte.perform();
			
			urls[21]=driver.getCurrentUrl();
			driver.navigate().back();
		}
		else {
			urls[21]="";
		}
		
		return urls;
		
	}
	
	
}
