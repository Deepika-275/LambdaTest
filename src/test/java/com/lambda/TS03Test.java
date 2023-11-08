package com.lambda;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericUtilies.ObjTS03;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS03Test {
    	@Test
	//public static void main (String args[]) throws Exception {
    		
    		public static void TS03() throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.manage().window().maximize();
	
		ObjTS03 obj=new ObjTS03(driver);
		obj.getInputForm().click();
		
		Thread.sleep(1000);
		obj.getSubmitBtn();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)");
		System.out.println("Scroll done");

		Thread.sleep(1000);
		
		obj.getNameText().sendKeys("Deepika Y");
		obj.getEmailText().sendKeys("deepika.yadavilli2@gmail.com");
		obj.getPswrdText().sendKeys("Deepika");
		obj.getCompanyText().sendKeys("Tatwa");
		String url= "https://www.tatwa.co.in/";
		obj.getWebsiteText().sendKeys(url);
		obj.getAdd1Text().sendKeys("Hyderabad");
		obj.getAdd2Text().sendKeys("Chandanangar");
		obj.getCityText().sendKeys("Hyderabad");
		obj.getStateText().sendKeys("Telangana");
		obj.getZipcodeText().sendKeys("500050");
		System.out.println("All details filled");
		
		Select sc= new Select(obj.getCountrySelect());
		sc.selectByVisibleText("United States");
		System.out.println("United States is Selected");
		Thread.sleep(3000);
		
		obj.getSubmitBtn().submit();
		System.out.println("Clicked on submit");
		Thread.sleep(2000);
      
		String msg=obj.getMessage().getText();
		String Expected= "Thanks for contacting us, we will get back to you shortly.";
		Assert.assertEquals(msg, Expected);
		System.out.println(msg);
		
		driver.close();
	}
}
