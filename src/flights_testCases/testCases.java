package flights_testCases;

import Utils.utilsdemo;
import flights_libreay.flights_log;

public class testCases {

	public static void main(String[] args) {
		utilsdemo.launchApp("http://flights.qedgetech.com");

		flights_log sanju =new flights_log();
		
		sanju.login("aajagadish0813@gmail.com", "Jaga@123");
		
		//utilsdemo.closeApp();
		
		 boolean ram =   sanju.isdisplayed("suresh");
	     if(ram)
	     {
	    	 System.out.println("test pass");
	    	 
	     }else
	     {
	    	 System.out.println("test fail");
	     }
	
	}

}
