package com.merico.selenium.test.ee.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.merico.selenium.autoscreenshot.AutoIntercept;
import com.merico.selenium.page.Page;
import com.merico.selenium.test.ee.control.LogoutControls;
import com.merico.selenium.test.ee.utils.Utilities;

public class LogoutPage extends Page {
	public LogoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isLoaded() {
		// No Ajax content, which can be considered to create the Page object has finished loading
		return true;
	}
	
	

	@AutoIntercept
	public void logout1(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}
	
	@AutoIntercept
	public void logout2(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}

	@AutoIntercept
	public void logout3(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}
	
	@AutoIntercept
	public void logout4(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}
	
	@AutoIntercept
	public void logout5(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}
	
	@AutoIntercept
	public void logout6(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}
	
	@AutoIntercept
	public void logout7(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}
	
	@AutoIntercept
	public void logout8(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}
	
	@AutoIntercept
	public void logout9(){
		Utilities.movePageToTop(driver);
		{
	      WebElement element = driver.findElement(By.cssSelector(LogoutControls.User_Account_Css));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	
		Utilities.waitForControlPresent(driver, By.xpath(LogoutControls.Logout_Xpath));
		driver.findElement(By.xpath(LogoutControls.Logout_Xpath)).click();
		Utilities.staticTimeDelay(1000);
	}
}
