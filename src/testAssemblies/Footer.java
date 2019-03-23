package testAssemblies;

import java.io.PrintWriter;

import org.openqa.selenium.WebDriver;

import tests.FooterTests;

public class Footer {
	
	public static void socialMedialLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri,PrintWriter pri2, String startingPoint) {
		FooterTests.checkFacebookLink(driver, homeUrl, homeStagingUrl, pri,pri2,startingPoint);
		FooterTests.checkPinterestLink(driver, homeUrl, homeStagingUrl, pri,pri2,startingPoint);
		FooterTests.checkInstagramLink(driver, homeUrl, homeStagingUrl, pri,pri2,startingPoint);
		FooterTests.checkYoutubeLink(driver, homeUrl, homeStagingUrl, pri,pri2,startingPoint);
	}

	public static void internalLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri,PrintWriter pri2, String startingPoint) {
		FooterTests.checkWirUberUnsLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkNewsletterLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkAbonnementLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkArchivLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkCommunityRichtlinienLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkFAQLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkBestellvorgangLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkDownloadAnleitungLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkVersandkodtenLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkKontaktLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkAGBLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkImpressumLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkDatenschutzbestimmungenLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checNutzungsbedingungenLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkUnsereWerbungLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkGewinnspielbedingungenLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkGesuhtGefundenLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkNahkurseLinkLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkHandleradressenLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkDatenschutzanfrageLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkMediadatenOnlineLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkMediatenPrintLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkAnmldenLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
	}
	
	public static void magazinesLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri, PrintWriter pri2,String startingPoint) {
		FooterTests.checkBunteLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkFreundinLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkInStyleLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkElleLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkBazaarLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
	}
	
	public static void externalLinksTests(WebDriver driver, String homeUrl,String homeStagingUrl,PrintWriter pri,PrintWriter pri2, String startingPoint) {
		FooterTests.checkAmicaLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkBambiLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkFocusLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkFreizeitRevueLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkGuterRatLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkMeinSchoeneGartenLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkSuperilluLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkBambiLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkTVSpielfilmLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
		FooterTests.checkDasKochrezeptLink(driver, homeUrl, homeStagingUrl, pri,pri2, startingPoint);
	}
	
}
