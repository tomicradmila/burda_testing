package utility;

import java.io.PrintWriter;

public class Print {
	
	public static void prettyPrint(String input, PrintWriter pri) {
		
		pri.write(input+"\r" );
		for(int i=0;i<50;i++) {
			pri.write("-");
		}
		pri.write("\r");
		
		
	}

}
