package tests;
import java.io.PrintWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.FooterActions;
import pageObjects.FooterInternalLinks;
import pageObjects.FooterMagazines;
import pageObjects.FooterSites;
import pageObjects.FooterSocialNetworks;
import pageObjects.HomePage;
import utility.Print;

public class FooterTests {
	
	
	//-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
	
	
	
	public static void checkFacebookLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000001";
		String description="check if facebook link works ok";
		String facebookUrl="https://www.facebook.com/burdastyle";
		WebElement element=FooterSocialNetworks.facebookLink(driver);
		String testResult=FooterActions.checkLink(driver, element,facebookUrl, homeUrl, homeStagingUrl);
		
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkPinterestLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000002";
		String description="check if pinterest link works ok";
		String pinterestUrl="https://www.pinterest.de/burdastylede/";
		WebElement element=FooterSocialNetworks.pinterestLink(driver);
		String testResult=FooterActions.checkLink(driver, element,pinterestUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkInstagramLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000003";
		String description="check if instagram link works ok";
		String instagramUrl="https://www.instagram.com/burdastylegermany/";
		WebElement element=FooterSocialNetworks.instagramLink(driver);
		String testResult=FooterActions.checkLink(driver, element,instagramUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkYoutubeLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000004";
		String description="check if youtube link works ok";
		String youtubeUrl="https://www.youtube.com/user/NaehenmitBurda";
		WebElement element=FooterSocialNetworks.youtubeLink(driver);
		String testResult=FooterActions.checkLink(driver, element,youtubeUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000005";
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkNewsletterLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000006";
		String description="check if Newsletter link works ok";
		String targetUrl="https://www.burdastyle.de/newsletter";
		String targetUrlStaging="https://staging-env.burdastyle.de/newsletter";
		WebElement element=FooterInternalLinks.newsletterLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkAbonnementLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000007";
		String description="check if Abonnement link works ok";
		String targetUrl="https://burdastyle-abo.de/?hnr=extern.verlag.burdastyle.footer";
		
		WebElement element=FooterInternalLinks.abonnementLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkArchivLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000008";
		String description="check if Archiv link works ok";
		String targetUrl="https://www.burdastyle.de/magazin";
		String targetUrlStaging="https://staging-env.burdastyle.de/magazin";
		WebElement element=FooterInternalLinks.archivLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkCommunityRichtlinienLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000009";
		String description="check if Community Richtlinien link works ok";
		String targetUrl="https://www.burdastyle.de/community-richtlinien";
		String targetUrlStaging="https://staging-env.burdastyle.de/community-richtlinien";
		WebElement element=FooterInternalLinks.communityRichtlinienLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkFAQLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000010";
		String description="check if FAQ link works ok";
		String targetUrl="https://www.burdastyle.de/hilfe";
		String targetUrlStaging="https://staging-env.burdastyle.de/hilfe";
		WebElement element=FooterInternalLinks.faqLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkBestellvorgangLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000011";
		String description="check if Bestellvorgang link works ok";
		String targetUrl="https://www.burdastyle.de/fragen-zum-bestellablauf";
		String targetUrlStaging="https://staging-env.burdastyle.de/fragen-zum-bestellablauf";
		WebElement element=FooterInternalLinks.bestellvorgangLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkDownloadAnleitungLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000012";
		String description="check if Download Anleitung link works ok";
		String targetUrl="https://www.burdastyle.de/customer-information?page=naehen-mit-dem-downloadschnitt";
		String targetUrlStaging="https://staging-env.burdastyle.de/customer-information?page=naehen-mit-dem-downloadschnitt";
		WebElement element=FooterInternalLinks.downloadAnleitungLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkVersandkodtenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000013";
		String description="check if Versandkosten link works ok";
		String targetUrl="https://www.burdastyle.de/customer-information?page=versandkosten";
		String targetUrlStaging="https://staging-env.burdastyle.de/customer-information?page=versandkosten";
		WebElement element=FooterInternalLinks.versandkostenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkKontaktLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000014";
		String description="check if Kontakt link works ok";
		String targetUrl="https://www.burdastyle.de/kontakt/";
		String targetUrlStaging="https://staging-env.burdastyle.de/kontakt/";
		WebElement element=FooterInternalLinks.kontaktLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkAGBLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000015";
		String description="check if AGB link works ok";
		String targetUrl="https://www.burdastyle.de/customer-information?page=allgemeine-geschaeftsbedingungen";
		String targetUrlStaging="https://staging-env.burdastyle.de/customer-information?page=allgemeine-geschaeftsbedingungen";
		WebElement element=FooterInternalLinks.AGBLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkImpressumLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000016";
		String description="check if Impressum link works ok";
		String targetUrl="https://www.burdastyle.de/impressum";
		String targetUrlStaging="https://staging-env.burdastyle.de/impressum";
		WebElement element=FooterInternalLinks.impressumLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkDatenschutzbestimmungenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000017";
		String description="check if Datenschutzbestimmungen link works ok";
		String targetUrl="https://www.burdastyle.de/customer-information?page=datenschutzbestimmungen";
		String targetUrlStaging="https://staging-env.burdastyle.de/customer-information?page=datenschutzbestimmungen";
		WebElement element=FooterInternalLinks.datenSchitzbestimmungenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checNutzungsbedingungenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000018";
		String description="check if Nutzungsbedingungen link works ok";
		String targetUrl="https://www.burdastyle.de/nutzungsbedingungen";
		String targetUrlStaging="https://staging-env.burdastyle.de/nutzungsbedingungen";
		WebElement element=FooterInternalLinks.nutzungsbedingungenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkUnsereWerbungLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000019";
		String description="check if Unsere werbung link works ok";
		String targetUrl="https://bcn.burda.de/werbeloesungen/uebersicht/";
		
		WebElement element=FooterInternalLinks.unsereWerbungLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkGewinnspielbedingungenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000020";
		String description="check if Gewinnspielbedingungen link works ok";
		String targetUrl="https://www.burdastyle.de/gewinnspielbedingungen";
		String targetUrlStaging="https://staging-env.burdastyle.de/gewinnspielbedingungen";
		WebElement element=FooterInternalLinks.gewinnspielbedingungenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkGesuhtGefundenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000021";
		String description="check if GesuhtGefunden link works ok";
		String targetUrl="https://www.burdastyle.de/gesucht-und-gefunden/";
		String targetUrlStaging="https://staging-env.burdastyle.de/gesucht-und-gefunden/";
		WebElement element=FooterInternalLinks.gesuhtGefundenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkNahkurseLinkLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000022";
		String description="check if NahkurseLink link works ok";
		String targetUrl="https://www.burdastyle.de/naehkurs-liste";
		String targetUrlStaging="https://staging-env.burdastyle.de/naehkurs-liste";
		WebElement element=FooterInternalLinks.nahkurseLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkHandleradressenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000023";
		String description="check if Handleradressen link works ok";
		String targetUrl="https://www.burdastyle.de/haendler-liste";
		String targetUrlStaging="https://staging-env.burdastyle.de/haendler-liste";
		WebElement element=FooterInternalLinks.handleradressenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkDatenschutzanfrageLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000024";
		String description="check if Datenschutzanfrage link works ok";
		String targetUrl="https://www.burdastyle.de/datenschutzanfrage";
		String targetUrlStaging="https://staging-env.burdastyle.de/datenschutzanfrage";
		WebElement element=FooterInternalLinks.datenschutzanfrageLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkMediadatenOnlineLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000025";
		String description="check if MediadatenOnline link works ok";
		String targetUrl="https://bcn.burda.de/marken/national/titel/burda-style-online/";
	
		WebElement element=FooterInternalLinks.mediadatenOnlineLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkMediatenPrintLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000026";
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://bcn.burda.de/marken/national/titel/burda-style/";
	
		WebElement element=FooterInternalLinks.mediatenPrintLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkAnmldenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000027";
		String description="check if Anmelden link works ok";
		String targetUrl="http://geschaeftskunden.burdastyle.de/";
		
		WebElement element=FooterInternalLinks.anmeldenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
///////////////////////////////////////////////////////////////////////////////
	
	public static void checkBunteLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000028";
		String description="check if Bunte link works ok";
		String targetUrl="https://www.bunte.de/";
		
		WebElement element=FooterMagazines.bunteLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkFreundinLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000029";
		String description="check if Freundin link works ok";
		String targetUrl="https://www.freundin.de/";
		
		WebElement element=FooterMagazines.freundinLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkInStyleLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000030";
		String description="check if In style link works ok";
		String targetUrl="https://www.instyle.de/";
		
		WebElement element=FooterMagazines.inStyleLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	public static void checkElleLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000031";
		String description="check if Elle link works ok";
		String targetUrl="https://www.elle.de/";
		
		WebElement element=FooterMagazines.elleLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkBazaarLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000032";
		String description="check if Bazaar link works ok";
		String targetUrl="https://www.harpersbazaar.de/";
		
		WebElement element=FooterMagazines.bazaarLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	/////////////////////////////////////////////////////////////////////////
	//EXTERNAL LINKS
	public static void checkAmicaLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000033";
		String description="check if Amica link works ok";
		String targetUrl="https://www.amica.de/";
		
		WebElement element=FooterSites.amicaLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkBambiLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000034";
		String description="check if Bambi link works ok";
		String targetUrl="http://www.bambi.de/";
		
		WebElement element=FooterSites.bambiLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkFocusLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000035";
		String description="check if Focus link works ok";
		String targetUrl="https://www.focus.de/";
		
		WebElement element=FooterSites.focusLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkFreizeitRevueLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000036";
		String description="check if Freizeit Revue link works ok";
		String targetUrl="http://www.freizeitrevue.de/";
		
		WebElement element=FooterSites.freizeitrevueLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkGuterRatLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000037";
		String description="check if Guter Rat link works ok";
		String targetUrl="http://guter-rat.de/";
		
		WebElement element=FooterSites.guterRatLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkMeinSchoeneGartenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000038";
		String description="check if Mein Schoener Garten link works ok";
		String targetUrl="https://www.mein-schoener-garten.de/";
		
		WebElement element=FooterSites.meinSchonerGartenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	
	
	public static void checkSuperilluLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000039";
		String description="check if Superillu link works ok";
		String targetUrl="https://www.superillu.de/";
		
		WebElement element=FooterSites.superilluLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkTributetoBambiLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000040";
		String description="check if Tributeto Bambi link works ok";
		String targetUrl="https://www.tributetobambi-stiftung.de/";
		
		WebElement element=FooterSites.tributetobambiLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkTVSpielfilmLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000041";
		String description="check if TV Spielfilm link works ok";
		String targetUrl="https://www.tvspielfilm.de/";
		
		WebElement element=FooterSites.tvSpielfilmLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
	public static void checkDasKochrezeptLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,PrintWriter pri2,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String testNumber="000042";
		String description="check if Das Kochrezept link works ok";
		String targetUrl="https://www.daskochrezept.de/";
		
		WebElement element=FooterSites.dasKochrezeptLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		Print.prettyPrint(description, testResult,testNumber, pri);
		Print.addToHtml(description, testResult, testNumber,pri2);
	}
	
};


//,"h","", "","",""
//,"","",""
