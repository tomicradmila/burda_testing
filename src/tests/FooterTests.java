package tests;
import java.io.PrintWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.FooterActions;
import pageObjects.FooterInternalLinks;
import pageObjects.FooterSocialNetworks;
import pageObjects.HomePage;
import utility.Print;

public class FooterTests {
	
	
	//-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
	
	
	
	public static void checkFacebookLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if facebook link works ok";
		String facebookUrl="https://www.facebook.com/burdastyle";
		WebElement element=FooterSocialNetworks.facebookLink(driver);
		String testResult=FooterActions.checkLink(driver, element,facebookUrl, homeUrl, homeStagingUrl);
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
		WebElement element=FooterSocialNetworks.pinterestLink(driver);
		String testResult=FooterActions.checkLink(driver, element,pinterestUrl, homeUrl, homeStagingUrl);
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
		WebElement element=FooterSocialNetworks.instagramLink(driver);
		String testResult=FooterActions.checkLink(driver, element,instagramUrl, homeUrl, homeStagingUrl);
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
		WebElement element=FooterSocialNetworks.youtubeLink(driver);
		String testResult=FooterActions.checkLink(driver, element,youtubeUrl, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	
	public static void checkNewsletterLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Newsletter link works ok";
		String targetUrl="https://www.burdastyle.de/newsletter";
		String targetUrlStaging="https://staging-env.burdastyle.de/newsletter";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkWirUberUnsLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Wir Uber Uns link works ok";
		String targetUrl="https://www.burdastyle.de/wir-ueber-uns/";
		String targetUrlStaging="https://staging-env.burdastyle.de/wir-ueber-uns/";
		WebElement element=FooterInternalLinks.wirUberUnsLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl,targetUrlStaging, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	public static void checkAnmldenLink(WebDriver driver,String homeUrl, String homeStagingUrl,PrintWriter pri,String startingPoint) {
		driver.get(startingPoint);
		driver.manage().window().maximize();
		if(HomePage.cookieButton(driver)!=null) {
			HomePage.cookieButton(driver).click();
		}
		String description="check if Anmelden link works ok";
		String targetUrl="http://geschaeftskunden.burdastyle.de/";
		
		WebElement element=FooterInternalLinks.anmeldenLink(driver);
		String testResult=FooterActions.checkLink(driver, element,targetUrl, homeUrl, homeStagingUrl);
		String writeInTestResults="test name: "+description+"---- status: "+testResult;
		Print.prettyPrint(writeInTestResults, pri);
	}
	
};
