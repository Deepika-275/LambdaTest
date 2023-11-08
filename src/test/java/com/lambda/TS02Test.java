package com.lambda;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.genericUtilies.ObjectsTS02;

public class TS02Test {
	@Test
	
//public static void main (String args[]) throws Exception {
		
		public static void TS02() throws Exception {

	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.lambdatest.com/selenium-playground/");
	driver.manage().window().maximize();
	ObjectsTS02 obj=new ObjectsTS02(driver);
	obj.getDragDrop().click();
	System.out.println("Drag and drop clicked");
	Thread.sleep(1000);
	
	obj.getRange();
	Actions ac=new Actions(driver);
	ac.dragAndDropBy(obj.getRange(), 215, 15).perform();
	System.out.println("Slider performed");
	Thread.sleep(2000);
	String value=obj.getCompare().getText();
	String expected="95";
	if(value.equals(expected)) {
		System.out.println("matched"+expected);
	}
	else {
		System.out.println("value not 95");
	}
	driver.close();
}
}
