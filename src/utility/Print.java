package utility;

import java.io.PrintWriter;

public class Print {
	
	public static void prettyPrint(String input, PrintWriter pri) {
		
		pri.write(input+"\r" );
		for(int i=0;i<60;i++) {
			pri.write("-");
		}
		pri.write("\r");
		
		
	}
	
public static void addToHtml(String testName, String testStatus,PrintWriter pri2) {
		String html="<div class=\"testContainer\">\n" + 
				"    	<div>test number</div>\n" + 
				"      	<div className=\"songTitle\">"+testName+"</div>\n" + 
				"      	<div className=\"songPerformer\">"+testStatus+"</div>\n" + 
				"    </div>";
		pri2.write(html);
		
		
		
	}

}
