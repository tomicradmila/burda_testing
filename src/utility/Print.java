package utility;

import java.io.PrintWriter;

public class Print {
	
	public static void prettyPrint(String description, String result, String testNumber, PrintWriter pri) {
		
		String writeInFile=testNumber+"  "+description+"   "+"status: "+result;
		pri.write(writeInFile+"\r" );
		for(int i=0;i<60;i++) {
			pri.write("-");
		}
		pri.write("\r");
		
		
	}
	
public static void addToHtml(String testName, String testStatus,String testNumber,PrintWriter pri2) {
		String html;
	
	if(testStatus.equals("passed")) {
				html="\r"+
				"<div class=\"testContainer\">\n" + 
				"    	<div class=\"testNumber\">"+testNumber+"</div>\n" + 
				"      	<div class=\"testTitle\">"+testName+"</div>\n" + 
				"      	<div class=\"testStatus\">"+testStatus+"</div>\n" + 
				"    </div>";
		}
	else {
		html="\r"+
				"<div class=\"testContainer\">\n" + 
				"    	<div class=\"testNumber\">"+testNumber+"</div>\n" + 
				"      	<div class=\"testTitle\">"+testName+"</div>\n" + 
				"      	<div class=\"testStatusFailed\">"+testStatus+"</div>\n" + 
				"    </div>";
	}
	
	
		pri2.write(html);
						
	}
public static String doubleDigit(int number) {
	 if (number / 10 < 1) {
	        return "0" + number;
	    }
	    return number+"";
}

public static void addTestTimeToHtml(long testTime, PrintWriter pri2) {
	
	int hours=(int) Math.floor(testTime/3600000);
	int minutes=(int) Math.floor((testTime-hours*60000)/60000);
	
	int seconds=(int) Math.floor((testTime-hours*3600000-minutes*60000)/1000);
	
	String totalTime=doubleDigit(hours)+"h "+doubleDigit(minutes)+"m "+doubleDigit(seconds)+"s";
	String html="<div class=\"testContainer\">Testing duration: "+totalTime+"</div>";
	pri2.write(html);
	System.out.println(testTime);
	System.out.println(hours);
	System.out.println(minutes);
	System.out.println(seconds);
}
public static void addTestGroupTitle(String testGroupTitle, PrintWriter pri2) {
	String html="<div class=\"testContainer testGroup\">\n" + testGroupTitle+
			"\n" + 
			"    </div>";
	pri2.write(html);
	
}

}
