package com.lambda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS01Test {
	@Test
//public static void main (String Args[]) throws Exception {
	public static void TS01() throws Exception {

	
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.lambdatest.com/selenium-playground/");
	Thread.sleep(1000);
	System.out.println("Opened LambdaTests Selenium playground");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Simple Form Demo")).click();
	System.out.println("Simple form Demo Opened");
	Thread.sleep(1000);
 String s=driver.getCurrentUrl();
 System.out.println(s);
 if (s.equals("https://www.lambdatest.com/selenium-playground/simple-form-demo")){
	 System.out.println("Url matched");
	 }
 else {
	 System.out.println("Url not matched");
 }
	String wel= "Welcome to LambdaTest";
	driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(wel);
	Thread.sleep(1000);
	driver.findElement(By.id("showInput")).click();
	Thread.sleep(1000);
    WebElement p= driver.findElement(By.xpath("//p[@id='message']"));
   String text=p.getText();
   boolean bb= wel.equals(text);
   if (bb==true) {
	   System.out.println(text);
   }
   else {
	   System.out.println("Not matched");
   }
	driver.close();
}
}
