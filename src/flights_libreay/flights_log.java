package flights_libreay;

import org.openqa.selenium.By;

import Utils.utilsdemo;

public class flights_log extends utilsdemo 
{

	
	public void login(String ui, String pwd) 
	{
		
		driver.findElement(By.name("email")).sendKeys(ui);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
	}
	
	  public boolean isdisplayed(String san)
	  {
		try {
			if(driver.findElement(By.className(san)).isDisplayed())
			{
				return true;
			}
		} catch (Exception e) 
		{
			  return false;
		}
		return false;  
	  
	  }
//---------------------------------------------------------------------------------------------------		
		/*public boolean iserrMsg()
		{
			String san;
	         san =	driver.findElement(By.id("spanMessage")).getText();	
			if(san.toLowerCase().contains("invalid") || san.toLowerCase().contains("empty"))
             {
            	 return true;
             }else
             {
            	 return false;
             }
			
			
		}*/
	
	public boolean iserrMsg()
	{
		String sanju;
	 sanju = driver.findElement(By.id("spanMessage")).getText();
	 if(sanju.toLowerCase().contains("invalid") || sanju.toLowerCase().contains("empty"))
    {
		 return true;
    }else
    {
    	return false;
    }
	}
	  
	  
	  
	  
	  
	  
	  
	  
	
	  
	  
	  
	  
	  
	  
	
}
