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
		String result;
		
		//String filePath="C:\\IT_Bootcamp\\JAVA\\2018-10-02\\TestProba.txt";
		//String line="";
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String fileName=dateFormat.format(date).toString()+".txt";
		try {
		//FileReader fr=new FileReader(filePath);//citac fajlova, kao nas skener
		PrintWriter pri=new PrintWriter(fileName);
	
		//BufferedReader bf=new BufferedReader(fr);
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		//result=LoginTests.loginButtonClick(driver);
		result=FooterTests.checkSocialNetworksLinks(driver, Constant.socialNetworks, pri);
		String result2;
		result2=FooterTests.checkMagazinesLinks(driver, Constant.magazinsLinks);
		driver.close();
		
		pri.write(result+"\r" );
		for(int i=0;i<50;i++) {
			pri.write("-");
		}
		pri.write("\r");
		
		pri.write(result2+"\r" );
		for(int i=0;i<50;i++) {
			pri.write("-");
		}
		
		pri.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
