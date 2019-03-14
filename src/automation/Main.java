package automation;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.LoginTests;

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
		//PrintWriter prp=new PrintWriter("Prezime.txt");
		//BufferedReader bf=new BufferedReader(fr);
		
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		result=LoginTests.loginButtonClick(driver);
		driver.close();
		//prp.close();
		pri.write(result+"\r" );
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
