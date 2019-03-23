package tests;
import java.io.PrintWriter;
import org.openqa.selenium.WebDriver;

import actions.FooterActions;

import pageObjects.HomePage;
import utility.Print;

public class FooterTests {
	public static void checkSocialNetworksLinks(WebDriver driver,String[]expectedUrls, PrintWriter pri, String url)  {
		String description="check if all social networks links are working";
		String result="test name: "+description+"---- status: ";
		String[] socialNetworks= {"facebook","pinterest", "instagram", "youtube"};
		String writeInTestResults;
		driver.get(url);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		
		String[] linksUrls=FooterActions.checkSocialNetworks(driver);
		String[] results = new String[4];
		for (int i=0;i<4;i++) {
			if(expectedUrls[i].equals(linksUrls[i])) {
				results[i]="ok";
			}
			else {
				results[i]="not ok";
			}
		}
		
		String testStatus="";
		
		for (int i=0;i<4;i++) {
			if(results[i].equals("not ok")) {
				testStatus=testStatus.concat(socialNetworks[i]+": failed;");
			}
		}
		
		if(testStatus.equals("")) {
			testStatus="passed";
		}
		
		writeInTestResults= result +testStatus;
		
		Print.prettyPrint(writeInTestResults, pri);
		
	}
	
	//-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
	
	public static void checkMagazinesLinks(WebDriver driver,String[]expectedUrls, PrintWriter pri, String url)  {
		String description="check if all magazines external links are working";
		String result="test name: "+description+"---- status: ";
		String[] socialNetworks= {"bunte","freundin", "inStyle", "elle","bazaar"};
		String writeInTestResults;
		driver.get(url);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		
		String[] linksUrls=FooterActions.checkMagazines(driver);
		String[] results = new String[5];
		for (int i=0;i<5;i++) {
			if(expectedUrls[i].equals(linksUrls[i])) {
				results[i]="ok";
			}
			else {
				results[i]="not ok";
			}
		}
		
		String testStatus="";
		
		for (int i=0;i<5;i++) {
			if(results[i].equals("not ok")) {
				testStatus=testStatus.concat(socialNetworks[i]+": failed;");
			}
		}
		
		if(testStatus.equals("")) {
			testStatus="passed";
		}
		
		writeInTestResults= result +testStatus;
		Print.prettyPrint(writeInTestResults, pri);
			
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////

	public static void checkSitesLinks(WebDriver driver,String[]expectedUrls, PrintWriter pri, String url)  {
		String description="check if all external sites links are working";
		String result="test name: "+description+"---- status: ";
		String[] externalLinks= {"amica","bambi", "focus", "freizeitrevue","guterrat","mein schoner garten","sperillu","tributetobambi","tv spielfilm","das kochrezept"};
		String writeInTestResults;
		driver.get(url);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		
		String[] linksUrls=FooterActions.checkSites(driver);
		String[] results = new String[10];
		for (int i=0;i<10;i++) {
			if(expectedUrls[i].equals(linksUrls[i])) {
				results[i]="ok";
			}
			else {
				results[i]="not ok";
			}
		}
		
		String testStatus="";
		
		for (int i=0;i<10;i++) {
			if(results[i].equals("not ok")) {
				testStatus=testStatus.concat(externalLinks[i]+": failed;");
			}
		}
		
		if(testStatus.equals("")) {
			testStatus="passed";
		}
		
		writeInTestResults= result +testStatus;
		Print.prettyPrint(writeInTestResults, pri);
			
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void checkInternalLinks(WebDriver driver,String[]expectedUrls, PrintWriter pri, String url)  {
		String description="check if all internal links are working";
		String result="test name: "+description+"---- status: ";
		String[] internalLinks= {"wir uber uns","newsletter", "abonnement", "archiv","community-richtlinien","FAQ","bestellvorgang","download anleitung","versandnosten",
				"kontakt","AGB","Daten Schitzbestimmungen","nutzungsbedingungen","unsere werbung","gewinnspielbedingungen","gesucht gefunden","nahkurse",
				"handlerndressen","datenschutzanfrage","mediaten online","mediaten print","anmelden"
				};
		
		String writeInTestResults;
		driver.get(url);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		
		String[] linksUrls=FooterActions.checkInternalLinks(driver);
		String[] results = new String[22];
		for (int i=0;i<22;i++) {
			if(expectedUrls[i].equals(linksUrls[i])) {
				results[i]="ok";
			}
			else {
				results[i]="not ok";
			}
		}
		
		String testStatus="";
		
		for (int i=0;i<22;i++) {
			if(results[i].equals("not ok")) {
				testStatus=testStatus.concat(internalLinks[i]+": failed;");
			}
		}
		
		if(testStatus.equals("")) {
			testStatus="passed";
		}
		
		writeInTestResults= result +testStatus;
		Print.prettyPrint(writeInTestResults, pri);
			
	}
	
	////////////////////////////////////////////////////////////////////////
	
	public static void checkFacebookLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if facebook link works ok";
		String facebookUrl="https://www.facebook.com/burdastyle";
		String testResult=FooterActions.checkFacebookLink(driver, facebookUrl, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	
	public static void checkPinterestLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if pinterest link works ok";
		String pinterestUrl="https://www.pinterest.de/burdastylede/";
		String testResult=FooterActions.checkPinterestLink(driver, pinterestUrl, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}


public static void checkInstagramLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
	driver.get(startingPoint);
	driver.manage().window().maximize();
	if(HomePage.cookieButton(driver)!=null) {
		HomePage.cookieButton(driver).click();
	}
	String description="check if instagram link works ok";
	String instagramUrl="https://www.instagram.com/burdastylegermany/";
	String testResult=FooterActions.checkInstagramLink(driver, instagramUrl, homeUrl, homeStagingUrl);
	String writeInTestResults="test name: "+description+"---- status: "+testResult;
	Print.prettyPrint(writeInTestResults, pri);
}

public static void checkYoutubeLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
	driver.get(startingPoint);
	driver.manage().window().maximize();
	if(HomePage.cookieButton(driver)!=null) {
		HomePage.cookieButton(driver).click();
	}
	String description="check if youtube link works ok";
	String youtubeUrl="https://www.youtube.com/user/NaehenmitBurda";
	String testResult=FooterActions.checkYoutubeLink(driver, youtubeUrl, homeUrl, homeStagingUrl);
	String writeInTestResults="test name: "+description+"---- status: "+testResult;
	Print.prettyPrint(writeInTestResults, pri);
}
};
