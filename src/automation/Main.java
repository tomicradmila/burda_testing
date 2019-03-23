package automation;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import utility.Constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tests.FooterTests;

public class Main {

	public static void main(String[] args) {
				
		//String filePath="C:\\IT_Bootcamp\\JAVA\\2018-10-02\\TestProba.txt";
		//String line="";
		//FileReader fr=new FileReader(filePath);//citac fajlova, kao nas skener
		//BufferedReader bf=new BufferedReader(fr);
		String homeStagingUrl=Constant.BURDA_MAIN_URL_STAGING;
		String homeUrl=Constant.BURDA_MAIN_URL;
		String startingPoint=Constant.BURDA_MAIN_URL;
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String fileName=dateFormat.format(date).toString()+".txt";
		try {
				PrintWriter pri=new PrintWriter(fileName);
				System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
				WebDriver driver=new ChromeDriver();
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
				
				//here is where we call our test
				
//				FooterTests.checkSocialNetworksLinks(driver, Constant.SOCIAL_NETWORKS, pri, url);
//				FooterTests.checkMagazinesLinks(driver, Constant.MAGAZINES_LINKS,pri, url);
//				FooterTests.checkSitesLinks(driver, Constant.SITE_LINKS, pri, url);
				//FooterTests.checkInternalLinks(driver,Constant.INTERNAL_LINKS_STAGING, pri, url);
				FooterTests.checkFacebookLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
				FooterTests.checkPinterestLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
				FooterTests.checkInstagramLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);
				FooterTests.checkYoutubeLink(driver, homeUrl, homeStagingUrl, pri,startingPoint);

				//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*	
		//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
				driver.close();
				pri.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
