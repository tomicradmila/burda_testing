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

}
