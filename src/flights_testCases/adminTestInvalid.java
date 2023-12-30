package flights_testCases;

import Utils.utilsdemo;
import flights_libreay.flights_log;

public class adminTestInvalid {

	public static void main(String[] args) {

    utilsdemo.launchApp("http://orangehrm.qedgetech.com");
    
    flights_log sanju = new flights_log();
    
    sanju.login("asc", "acd");
    
     /*boolean ram = sanju.iserrMsg();
      if(ram)
      {
    	  System.out.println("test pass");
      }else
      {
    	  System.out.println("test fail");
      }*/
    	 
	
     boolean ram = sanju.iserrMsg();
    if(ram)
    {
    	System.out.println("test pass");
    }else
    {
    	System.out.println("test fail");
    }
    
    
    
    
    
    

	}

}
