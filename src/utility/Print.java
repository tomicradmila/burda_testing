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
		String html="<div class=\"testContainer\">\n" + 
				"    	<div>"+testNumber+"</div>\n" + 
				"      	<div className=\"songTitle\">"+testName+"</div>\n" + 
				"      	<div className=\"songPerformer\">"+testStatus+"</div>\n" + 
				"    </div>";
		pri2.write(html);
		
		
		
	}

}
